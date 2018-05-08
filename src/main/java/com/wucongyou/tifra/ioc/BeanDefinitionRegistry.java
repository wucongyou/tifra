package com.wucongyou.tifra.ioc;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午10:49
 */
public interface BeanDefinitionRegistry {

    void register(String beanName, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefinition(String beanName);
}
