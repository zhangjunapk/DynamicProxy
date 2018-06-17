package org.zj.demo.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ZhangJun on 2018/6/17.
 */
public class GirlMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("等等，我要说啥来着~~~");
        //这里是调用他爹的，不是调用这个子类的方法
        methodProxy.invokeSuper(o,objects);
        System.out.println("刚才我说了什么~~,忘了...");
        return o;
    }
}
