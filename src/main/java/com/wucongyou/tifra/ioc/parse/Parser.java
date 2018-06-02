package com.wucongyou.tifra.ioc.parse;

import com.wucongyou.tifra.ioc.io.Resource;

/**
 * @author congyou.wu
 * @since 2018-06-02 14:40
 */
public interface Parser {

    IOCConf parse(Resource resource);
}
