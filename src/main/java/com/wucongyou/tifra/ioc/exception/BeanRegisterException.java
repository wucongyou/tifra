package com.wucongyou.tifra.ioc.exception;

/**
 * @author congyou.wu
 * @since 2018-06-02 16:25
 */
public class BeanRegisterException extends RuntimeException {

    public BeanRegisterException() {
    }

    public BeanRegisterException(String message) {
        super(message);
    }

    public BeanRegisterException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeanRegisterException(Throwable cause) {
        super(cause);
    }

    public BeanRegisterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
