package com.wucongyou.tifra.ioc;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午10:29
 */
public interface ConfigurableBeanFactory extends BeanFactory, BeanRegistry {

    void setBeanClassLoader(ClassLoader beanClassLoader);

    ClassLoader getBeanClassLoader();
}
