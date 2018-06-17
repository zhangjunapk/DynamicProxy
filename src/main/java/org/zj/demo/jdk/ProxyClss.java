package org.zj.demo.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ZhangJun on 2018/6/17.
 */
public class ProxyClss implements InvocationHandler {
    Object o;
    public ProxyClss(Object o) {
        this.o=o;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
    IPerson p= (IPerson) o;
   p.say();
        return proxy;
    }
}
