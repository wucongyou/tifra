package com.wucongyou.tifra.ioc.factory.support;

import com.wucongyou.tifra.ioc.BeanFactory;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午10:29
 */
public interface ConfigurableBeanFactory extends BeanFactory, BeanRegistry {

    void setBeanClassLoader(ClassLoader beanClassLoader);

    ClassLoader getBeanClassLoader();
}
