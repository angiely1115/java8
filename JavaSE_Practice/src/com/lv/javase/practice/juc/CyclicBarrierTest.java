package com.lv.javase.practice.juc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: lvrongzhuan
 * @Description:
 * @Date: 2018/7/24 9:14
 * @Version: 1.0
 * modified by:
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("都到了，继续走");
            }
        });
        CyclicBarrierTest cyclicBarriarTest = new CyclicBarrierTest();
        for(int i=0;i<15;i++){
            DogTread dogTread = cyclicBarriarTest.new DogTread(cyclicBarrier);
            new Thread(dogTread).start();
        }
    }

    class DogTread implements Runnable{
        private CyclicBarrier cyclicBarrier;

        public DogTread(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"只狗狗在等待");
            try {
                cyclicBarrier.await();
                System.out.println("都到了"+Thread.currentThread().getName()+"狗狗又继续");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
