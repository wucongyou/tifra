package com.wucongyou.tifra.ioc.parse;

import java.util.Arrays;
import java.util.List;

import com.wucongyou.tifra.ioc.Def;

/**
 * @author congyou.wu
 * @since 2018-06-02 22:55
 */
public class IOCConf {

    private List<Def> beans;

    private String[] scanPackages;

    @Override
    public String toString() {
        return "IOCConf{" +
            "beans=" + beans +
            ", scanPackages=" + Arrays.toString(scanPackages) +
            '}';
    }

    public List<Def> getBeans() {
        return beans;
    }

    public void setBeans(List<Def> beans) {
        this.beans = beans;
    }

    public String[] getScanPackages() {
        return scanPackages;
    }

    public void setScanPackages(String[] scanPackages) {
        this.scanPackages = scanPackages;
    }
}
