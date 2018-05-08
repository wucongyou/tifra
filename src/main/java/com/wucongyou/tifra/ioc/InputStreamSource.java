package com.wucongyou.tifra.ioc;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午11:05
 */
public interface InputStreamSource {

    InputStream getInputStream() throws IOException;
}
