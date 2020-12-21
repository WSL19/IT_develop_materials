package com.factory;

import com.wsl.UserDao;
import com.wsl.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
