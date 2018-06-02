package com.wucongyou.tifra.ioc.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author congyou.wu
 * @since 2018-06-02 14:41
 */
public interface Resource {

    InputStream stream() throws IOException;

    Reader reader() throws IOException;
}
