package com.wucongyou.tifra.ioc;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午10:19
 */
public interface BeanFactory {

    <T> T getBean(String beanName, Class<T> requiredType);
}
