package com.wucongyou.tifra.ioc.registry;

/**
 * @author congyou.wu
 * @since 2018-06-02 14:33
 */
public interface Registry {

    <T> void register(String name, T obj);

    <T> T get(String name);
}
