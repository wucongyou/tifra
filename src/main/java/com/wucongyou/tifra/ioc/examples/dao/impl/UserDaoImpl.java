package com.wucongyou.tifra.ioc.examples.dao.impl;

import com.wucongyou.tifra.ioc.examples.dao.UserDao;
import com.wucongyou.tifra.ioc.examples.model.User;

/**
 * @author congyou.wu
 * @since 2018-06-02 17:10
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User get(int id) {
        return mockUser(id);
    }

    private User mockUser(int id) {
        User user = new User();
        user.setId(id);
        user.setName("user_" + id);
        user.setAge(18);
        return user;
    }
}
