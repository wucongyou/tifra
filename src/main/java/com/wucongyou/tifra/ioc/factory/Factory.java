package com.wucongyou.tifra.ioc.factory;

/**
 * @author congyou.wu
 * @since 2018-06-02 15:53
 */
public interface Factory {

    <T> T get(String name);
}
