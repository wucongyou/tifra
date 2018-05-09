package com.wucongyou.tifra.ioc.factory.support;

import com.wucongyou.tifra.ioc.core.io.Resource;
import com.wucongyou.tifra.ioc.core.io.support.ResourceLoader;

/**
 * @author congyou.wu
 * @since 2018-05-09 上午8:30
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    public BeanDefinitionRegistry getRegistry() {
        return null;
    }

    public ResourceLoader getResourceLoader() {
        return null;
    }

    public ClassLoader getBeanClassLoader() {
        return null;
    }

    public int loadBeanDefinitions(Resource resource, Resource... resources) {
        return 0;
    }
}
