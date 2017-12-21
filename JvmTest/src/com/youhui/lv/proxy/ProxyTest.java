package com.youhui.lv.proxy;

import java.lang.reflect.Proxy;

/**
 * @Author lvrongzhuan
 * @desc:
 * @createTime 2017/12/1819:04
 * @Modified by:
 */
public class ProxyTest {
    public static void main(String[] args) {
        Tom tom = new Tom();
        People peopleProxy = (People) Proxy.newProxyInstance(tom.getClass().getClassLoader(),tom.getClass().getInterfaces(),new TomFM(tom));
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();
        People peopleProxy1 = (People) jdkDynamicProxy.creatProxyInstance(tom);
        peopleProxy1.jiehun();
    }
}
