package com.youhui.lv.com.youhui.nio.juc;

import java.util.concurrent.*;

/**  
 * 测试CyclicBarrier类的使用  
 */  
public class TestCountDownLatch {
    static final Integer NUM = 5;  
    public static void main(String[] args) throws InterruptedException {  
        //实例CyclicBarrier对象  
        CountDownLatch countDownLatch = new CountDownLatch(NUM);
        //实例化一个固定大小线程池  
        ExecutorService executor = Executors.newFixedThreadPool(NUM);
        for(int i = 1;i<=NUM;i++){  
            //执行线程  
            executor.execute(new MyRunnale1(countDownLatch,i+"号"));
            //为了更好的效果，休眠一秒  
            Thread.sleep(1000);  
        }  
        System.out.println("指令通知完成");
        executor.shutdown();
    }  
}


class MyRunnale1 implements Runnable{
    private CountDownLatch countDownLatch;
    private String mark;  
    public MyRunnale1(CountDownLatch countDownLatch,String mark) {
        super();  
        this.countDownLatch = countDownLatch;
        this.mark = mark;  
    }  
    @Override  
    public void run() {  
        System.out.println(mark+"进入线程,线程阻塞中...");  
        try {  
            // barrier的await方法，在所有参与者都已经在此 barrier 上调用 await 方法之前，将一直等待。
            countDownLatch.countDown();
            countDownLatch.await();
            Thread.sleep(2000);//为了看到更好的效果，线程阻塞两秒  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }
          
        System.out.println(mark+"线程阻塞结束,继续执行...");  
          
    }

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}