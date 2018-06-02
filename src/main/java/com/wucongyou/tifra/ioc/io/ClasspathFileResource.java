package com.wucongyou.tifra.ioc.io;

/**
 * @author congyou.wu
 * @since 2018-06-02 15:27
 */
public class ClasspathFileResource extends FileResource {

    public ClasspathFileResource(String location) {
        super(location);
    }

    @Override
    protected String getFinalLocation() {
        return ClasspathFileResource.class.getClassLoader().getResource(location).getPath();
    }
}
