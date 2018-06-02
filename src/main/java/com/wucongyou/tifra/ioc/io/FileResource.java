package com.wucongyou.tifra.ioc.io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author congyou.wu
 * @since 2018-06-02 14:51
 */
public class FileResource implements Resource {

    protected String location;

    public FileResource(String location) {
        this.location = location;
    }

    public InputStream stream() throws IOException {
        return new FileInputStream(getFinalLocation());
    }

    public Reader reader() throws IOException {
        return new FileReader(getFinalLocation());
    }

    protected String getFinalLocation() {
        return location;
    }
}
