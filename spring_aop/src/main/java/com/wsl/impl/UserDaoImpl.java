package com.wsl.impl;

import com.domain.User;
import com.wsl.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {


    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        /*System.out.println("UserDaoiMPL创建....");*/
    }

    public void init(){
        System.out.println("初始化方法。。。。");
    }

    public void destroy(){
        System.out.println("销毁化方法。。。。");
    }
    public void save() {
        System.out.println("hello save running.....");
        System.out.println("username是。。。"+username);
        System.out.println("age是。。。"+age);
        System.out.println(stringList);
        System.out.println(userMap);
        System.out.println(properties);
    }
}
