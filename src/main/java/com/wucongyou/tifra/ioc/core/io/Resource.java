package com.wucongyou.tifra.ioc.core.io;

import java.io.File;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午11:05
 */
public interface Resource extends InputStreamSource {

    boolean exists();

    boolean isOpen();

    File getFile();
}
