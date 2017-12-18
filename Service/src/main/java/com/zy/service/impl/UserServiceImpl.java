package com.zy.service.impl;

import com.zy.dao.UserDao;
import com.zy.service.UserService;
import com.zy.entity.User;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
        //throw new RuntimeException();
    }
}
