package com.anno_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect  //标注当前MyAspect是一个切面类
public class MyAspect {


    //配置前置通知
    //@Before("execution(* com.anno_aop.*.*(..))")
    public void before(){
        System.out.println("前置增强。。。。");
    }
    public void afterReturning(){
        System.out.println("后置增强。。。");
    }
    //配置环绕通知
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强。。。");
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强。。。");
        return proceed;
    }

    public void throwing(){
        System.out.println("异常增强。。。。");
    }
    //配置最终通知

    //@After("execution(* com.anno_aop.*.*(..))")
    @After("MyAspect.pointcut()")
    public void after(){
        System.out.println("最终通知增强。。。。");
    }

    //定义切点表达式
    @Pointcut("execution(* com.anno_aop.*.*(..))")
    public void pointcut(){

    }
}
