package com.rongly.java11.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lvrongzhuan
 * @Description: 黑盒子
 * @Date: 2019/2/2 10:10
 * @Version: 1.0
 * modified by:
 */
public class JFRTest {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("发生GC："+this);
    }

    public static void main(String[] args) {
        byte[] bytes =new byte[1024];
        List<byte[]> bytes1 = new ArrayList<>();
        while (true){
            bytes1.add(bytes);
            if (bytes1.size()%500==0) {
                bytes1.clear();
            }
        }
    }
}
