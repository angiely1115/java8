package com.youhui.lv.com.youhui.nio.juc;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author lvrongzhuan
 * @desc: 空中网
 * @createTime 2018/1/5 10:08
 * @Modified by:
 */
public class TestKongzw {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> arrayBlockingQueue =  new ArrayBlockingQueue<String>(4);
        for(int i=0;i<4;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        String str = null;
                            str = arrayBlockingQueue.poll();
                        printObj(str);
                    }
                }
            }).start();
        }
        for(int i=0;i<16;i++){
            String str = i+"";
            arrayBlockingQueue.put(str);
//            printObj(str);
        }
    }
    public static void  printObj(String str){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("**********:"+str);
    }
}
