package com.rongly.java11.demo;

import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2019/2/1 11:51
 * @Version: 1.0
 * modified by:
 */
public class StringTest {

    @Test
    public void stringTest1(){
        //判断是否一个空白字符串
        String str = "    ";
        System.out.println(str.isBlank());
        String str2 = "   白素贞  bbb   　      　        ";
        //可以去掉包括英文和其他语言中所有的空白字符
        System.out.println(str2.strip());
        //只能去除码值小于等于32的空白字符
        System.out.println(str2.trim());
        System.out.println("去除尾部的空白字符："+str2.stripTrailing());
        System.out.println("去除首部的空白字符："+str2.stripLeading());
        System.out.println("字符串重复复制："+"java11".repeat(3));
        //lines转换给流 根据换行符
        System.out.println("java11\nyyy\n".lines().count());
        String lines = "新白娘子传奇";
        lines.lines().forEach(System.out::println);
    }
}
