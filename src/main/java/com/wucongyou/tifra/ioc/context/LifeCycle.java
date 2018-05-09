package com.wucongyou.tifra.ioc.context;

/**
 * @author congyou.wu
 * @since 2018-05-08 下午10:32
 */
public interface LifeCycle {

    void start();

    void stop();

    boolean isRunning();
}
