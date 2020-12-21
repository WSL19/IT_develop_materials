package com.service.impl;

import com.service.UserService;
import com.wsl.UserDao;
import com.wsl.impl.UserDaoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {



    private UserDao userDao;

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
        //userDao=new UserDaoImpl();
    }

    public void save() {

        userDao.save();


    }
}
