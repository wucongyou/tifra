package com.wucongyou.tifra.ioc.examples.service.impl;

import com.wucongyou.tifra.ioc.annotation.Autowired;
import com.wucongyou.tifra.ioc.annotation.Service;
import com.wucongyou.tifra.ioc.examples.dao.UserDao;
import com.wucongyou.tifra.ioc.examples.model.User;
import com.wucongyou.tifra.ioc.examples.service.UserService;

/**
 * @author congyou.wu
 * @since 2018-06-02 17:07
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User get(int id) {
        return userDao.get(id);
    }
}
