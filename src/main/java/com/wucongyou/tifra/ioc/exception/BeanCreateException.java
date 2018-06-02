package com.wucongyou.tifra.ioc.exception;

/**
 * @author congyou.wu
 * @since 2018-06-02 16:15
 */
public class BeanCreateException extends RuntimeException {

    public BeanCreateException() {
    }

    public BeanCreateException(String message) {
        super(message);
    }

    public BeanCreateException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeanCreateException(Throwable cause) {
        super(cause);
    }

    public BeanCreateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
