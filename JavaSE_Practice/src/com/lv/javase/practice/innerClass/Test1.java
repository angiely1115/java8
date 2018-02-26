package com.lv.javase.practice.innerClass;

/**
 * @Author lvrongzhuan
 * @desc: 继承内部类
 * @createTime 2018/2/25 22:13
 * @Modified by:
 */
public class Test1 extends OuterClass.InnerClass.InnerClass2{
    Test1(OuterClass.InnerClass wi) {
        wi.super();
    }
}
