package org.zj.demo.cglib;

/**
 * Created by ZhangJun on 2018/6/17.
 */
public class Girl implements IPerson {
    @Override
    public void say() {
        System.out.println("吾乃及川，汝是?");
    }
    public void girlSay(){
        System.out.println("我说了~~~");
    }
}
