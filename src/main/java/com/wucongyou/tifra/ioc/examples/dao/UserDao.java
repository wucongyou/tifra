package com.wucongyou.tifra.ioc.examples.dao;

import com.wucongyou.tifra.ioc.examples.model.User;

/**
 * @author congyou.wu
 * @since 2018-06-02 16:59
 */
public interface UserDao {

    User get(int user);
}
