package org.zj.demo.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by ZhangJun on 2018/6/17.
 */
public class Content {
    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        enhancer.setCallbacks(new Callback[]{new GirlMethodInterceptor(),new OtherMethodInterceptor()});
        enhancer.setCallbackFilter(new Filter());

        enhancer.setSuperclass(Girl.class);
        Girl g= (Girl) enhancer.create();
        g.girlSay();
    }
}
