package com.wucongyou.tifra.ioc.core.io.support;

import com.wucongyou.tifra.ioc.core.io.Resource;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午11:03
 */
public interface ResourceLoader {

    Resource getResource(String location);

}
