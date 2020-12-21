package com.ti.aop_anno;

import org.springframework.stereotype.Component;

@Component("target")
public class Target implements TargetInterface{
    public void save() {
        System.out.println("保存中。。。。");
    }
}
