package com.demo;

import com.service.UserService;
import com.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserController {

    public static void main(String[] args) {
        //ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("E:\\It_Developt\\spring\\spring_aop\\src\\main\\resources\\applicationContext.xml");
        //UserService userService = (UserService) applicationContext.getBean("userService");
        UserService bean = applicationContext.getBean(UserService.class);
        bean.save();

    }
}
