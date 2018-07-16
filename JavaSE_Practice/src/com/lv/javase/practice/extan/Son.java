package com.lv.javase.practice.extan;


/**
 * @Author lvrongzhuan
 * @desc:
 * @createTime 2018/3/615:58
 * @Modified by:
 */
public class Son extends Father{
    public Son() {
        System.out.println("儿子辈");
    }

    public static void main(String[] args) {
        new Son();
    }
}
