package com.wucongyou.tifra.ioc;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午10:48
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    ClassLoader getBeanClassLoader();

    int loadBeanDefinitions(Resource resource, Resource... resources);
}
