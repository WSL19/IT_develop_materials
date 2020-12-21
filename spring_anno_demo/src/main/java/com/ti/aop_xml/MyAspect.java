package com.ti.aop_xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    public void before(){
        System.out.println("前置通知。。。。");
    }

    public void afterReturning(){
        System.out.println("后置通知。。。");
    }

    public Object round(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("前置环绕通知。。。");
        Object proceed = pjp.proceed();
        System.out.println("后置环绕通知。。。");
        return proceed;

    }
    public void after(){
        System.out.println("最终通知。。。");
    }
}
