package com.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {

        //目标对象
        final Target target=new Target();

        //增强对象
        final Advice advice=new Advice();

        //返回值，就是动态生成的代理对象
        TargetInterface targetInterface= (TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(), //目标对象的类加载器
                target.getClass().getInterfaces(), //目标对象相同的接口字节码对象数组
                new InvocationHandler() {
                    //调用代理对象的任何方法，实质执行的都是invoke()方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //前置增强
                        advice.before();
                        //执行目标方法
                        Object invoke = method.invoke(target, args);
                        //后置增强方法
                        advice.afterReturning();
                        return invoke;
                    }
                }
        );
        //调用代理对象的方法
        targetInterface.save();

    }
}
