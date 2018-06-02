package com.wucongyou.tifra.ioc.factory;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author congyou.wu
 * @since 2018-06-02 22:23
 */
public class Desc {

    private String name;

    private Class clazz;

    private Map<String, Field> dependencies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Map<String, Field> getDependencies() {
        return dependencies;
    }

    public void setDependencies(Map<String, Field> dependencies) {
        this.dependencies = dependencies;
    }
}
