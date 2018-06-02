package com.wucongyou.tifra.ioc.factory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wucongyou.tifra.ioc.Def;
import com.wucongyou.tifra.ioc.annotation.Autowired;
import com.wucongyou.tifra.ioc.exception.BeanCreateException;
import com.wucongyou.tifra.ioc.io.ClasspathFileResource;
import com.wucongyou.tifra.ioc.io.Resource;
import com.wucongyou.tifra.ioc.parse.IOCConf;
import com.wucongyou.tifra.ioc.parse.JSONDefParser;
import com.wucongyou.tifra.ioc.parse.Parser;
import com.wucongyou.tifra.ioc.registry.DefaultRegistry;
import com.wucongyou.tifra.ioc.registry.Registry;

/**
 * @author congyou.wu
 * @since 2018-06-02 15:54
 */
public class DefaultFactory implements Factory {

    private Registry registry = new DefaultRegistry();

    public DefaultFactory(String location) {
        Parser parser = new JSONDefParser();
        Resource resource = new ClasspathFileResource(location);
        IOCConf iocConf = parser.parse(resource);
        List<Def> defs = iocConf.getBeans();

        // init registry
        ClassLoader cl = getClassLoader();
        Map<String, Desc> descMap = new HashMap<>();

        for (Def def : defs) {
            Desc desc = new Desc();
            Map<String, Field> depMap = new HashMap<>();
            try {
                Class c = cl.loadClass(def.getClazz());
                desc.setClazz(c);

                // process deps
                for (Field field : c.getDeclaredFields()) {
                    Annotation[] annotations = field.getDeclaredAnnotations();
                    for (Annotation annotation : annotations) {
                        if (annotation instanceof Autowired) {
                            depMap.put(field.getName(), field);
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                throw new BeanCreateException("Bean init failed for " + def, e);
            }
            desc.setName(def.getName());
            desc.setDependencies(depMap);
            descMap.put(desc.getName(), desc);
        }

        // register
        descMap.forEach((name, desc) -> {
            try {
                // new instance
                Object obj = desc.getClazz().newInstance();
                registry.register(name, obj);
            } catch (Exception e) {
                throw new BeanCreateException("Bean init failed for " + desc, e);
            }
        });

        descMap.forEach((name, desc) -> {
            try {
                Object obj = registry.get(name);
                // inject dependencies
                desc.getDependencies().forEach((depName, field) -> {
                    try {
                        // todo check cycle dependencies
                        Object depObj = registry.get(depName);
                        if (depObj == null) {
                            throw new BeanCreateException("Failed to find dependency " + depName + " for " + desc);
                        }
                        field.setAccessible(true);
                        field.set(obj, depObj);
                    } catch (IllegalAccessException e) {
                        throw new BeanCreateException("Failed to inject dependency " + depName + " for " + desc, e);
                    }
                });
            } catch (Exception e) {
                throw new BeanCreateException("Bean init failed for " + desc, e);
            }
        });
    }

    private ClassLoader getClassLoader() {
        return DefaultFactory.class.getClassLoader();
    }

    public <T> T get(String name) {
        return registry.get(name);
    }
}
