package com.ti.aop_anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

    //@Before("execution( * com.ti.aop_anno.*.*(..))")
    @Before("pointcut()")
    public void before(){
        System.out.println("前置通知。。。。");
    }

    public void afterReturning(){
        System.out.println("后置通知。。。");
    }

    @Around("pointcut()")
    public Object round(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("前置环绕通知。。。");
        Object proceed = pjp.proceed();
        System.out.println("后置环绕通知。。。");
        return proceed;

    }
    public void after(){
        System.out.println("最终通知。。。");
    }

    //配置切点
    @Pointcut("execution( * com.ti.aop_anno.*.*(..))")
    public void pointcut(){

    }
}
