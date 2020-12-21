package com.factory;

import com.wsl.UserDao;
import com.wsl.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
