package org.zj.demo.jdk;

import java.lang.reflect.Proxy;

/**
 * Created by ZhangJun on 2018/6/17.
 */
public class Content {
    public static void main(String[] args) {

        Girl girl=new Girl();
        ProxyClss pro=new ProxyClss(girl);

        IPerson person = (IPerson) Proxy.newProxyInstance(pro.getClass().getClassLoader(), girl
                .getClass().getInterfaces(), pro);
        person.say();





    }
}
