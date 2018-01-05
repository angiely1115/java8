package com.youhui.lv;

import com.youhui.lv.proxy.Tom;

import java.util.Arrays;

/**
 * @Author lvrongzhuan
 * @desc:
 * @createTime 2017/12/2215:26
 * @Modified by:
 */
public class Test2 {
    public static void main(String[] args) {
        Class[] classes = Tom.class.getInterfaces();
        Arrays.stream(classes).forEach(x -> {
            try {
                System.out.println(x.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
