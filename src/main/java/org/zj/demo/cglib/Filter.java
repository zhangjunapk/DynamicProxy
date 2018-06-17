package org.zj.demo.cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * Created by ZhangJun on 2018/6/17.
 */
public class Filter implements CallbackFilter {
    /**
     * 当我们调用被代理的对象方法的时候，
     * 会执行这个方法，根据int值来判断需要
     * 执行的方法
     * @param method
     * @return
     */
    public int accept(Method method) {
        if(method.getName().equals("girlSay")){
            return 0;
        }
        return 1;
    }
}
