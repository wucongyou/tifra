package com.wucongyou.tifra.ioc.registry;

import java.util.concurrent.ConcurrentHashMap;

import com.wucongyou.tifra.ioc.exception.BeanRegisterException;

/**
 * @author congyou.wu
 * @since 2018-06-02 15:48
 */
public class DefaultRegistry implements Registry {

    private ConcurrentHashMap<String, Object> registry = new ConcurrentHashMap<String, Object>();

    public <T> void register(String name, T obj) {
        if (registry.containsKey(name)) {
            throw new BeanRegisterException("Bean with name " + name + " already exists");
        }
        registry.put(name, obj);
    }

    public <T> T get(String name) {
        return (T) registry.get(name);
    }
}
