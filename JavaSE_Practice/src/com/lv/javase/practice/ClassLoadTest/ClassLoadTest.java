package com.lv.javase.practice.ClassLoadTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @Author lvrongzhuan
 * @desc: 类加载器
 * @createTime 2018/2/27 20:45
 * @Modified by:
 */
public class ClassLoadTest {
    @Test
    public void test1(){
       String[] sysStr =  System.getProperty("sun.boot.class.path").split(";");
        Arrays.stream(sysStr).forEach(s-> System.out.println(s));

        System.out.println("*****java.ext.dirs*****");
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println("*****java.class.path******");
        String[] paths = System.getProperty("java.class.path").split(";");
        Arrays.stream(paths).forEach(p-> System.out.println(p));
    }
}
