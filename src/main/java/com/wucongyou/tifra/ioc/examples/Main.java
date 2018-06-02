package com.wucongyou.tifra.ioc.examples;

import com.wucongyou.tifra.ioc.context.BootstrapContext;
import com.wucongyou.tifra.ioc.context.Context;
import com.wucongyou.tifra.ioc.examples.dao.UserDao;
import com.wucongyou.tifra.ioc.examples.model.User;
import com.wucongyou.tifra.ioc.examples.service.UserService;

/**
 * @author congyou.wu
 * @since 2018-06-02 16:28
 */
public class Main {

    public static void main(String[] args) {
        Context ctx = new BootstrapContext("ioc.json");

        UserDao userDao = (UserDao) ctx.get("userDao");
        User user = userDao.get(1);
        System.out.println(user);

        UserService userService = (UserService) ctx.get("userService");
        user = userService.get(1);
        System.out.println(user);
    }
}
