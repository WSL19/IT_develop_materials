package com.ti.aop_xml;

//目标类
public class Target implements TargetInterface{

    public void save() {
        System.out.println("保存中。。。。");
    }
}
