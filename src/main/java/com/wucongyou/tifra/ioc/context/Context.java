package com.wucongyou.tifra.ioc.context;

import com.wucongyou.tifra.ioc.factory.support.ConfigurableBeanFactory;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午10:20
 */
public interface Context {

    ConfigurableBeanFactory getBeanFactory();
}
