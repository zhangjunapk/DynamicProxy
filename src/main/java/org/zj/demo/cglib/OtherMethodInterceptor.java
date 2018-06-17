package org.zj.demo.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ZhangJun on 2018/6/17.
 */
public class OtherMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("其他的之前");
       methodProxy.invoke(o,objects);
        System.out.println("其他的之后");
        return o;
    }
}
