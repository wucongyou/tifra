package com.wucongyou.tifra.ioc;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * @author congyou.wu
 * @since 2018-06-02 14:36
 */
public class Def {

    private String name;

    @SerializedName("class")
    private String clazz;

    private boolean singleton;

    private List<String> dependencies;

    @Override
    public String toString() {
        return "Def{" +
            "name='" + name + '\'' +
            ", clazz=" + clazz +
            ", singleton=" + singleton +
            '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public boolean isSingleton() {
        return singleton;
    }

    public void setSingleton(boolean singleton) {
        this.singleton = singleton;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }
}
