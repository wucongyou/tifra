package com.wucongyou.tifra.ioc.context;

import com.wucongyou.tifra.ioc.factory.DefaultFactory;
import com.wucongyou.tifra.ioc.factory.Factory;

/**
 * @author congyou.wu
 * @since 2018-06-02 15:51
 */
public class BootstrapContext implements Context {

    private Factory factory;

    public BootstrapContext(String location) {
        factory = new DefaultFactory(location);
    }

    public Object get(String name) {
        return factory.get(name);
    }
}
