package com.wucongyou.tifra.ioc;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午10:19
 */
public interface BeanRegistry {

    void register(String beanName, Object beanObject);
}
