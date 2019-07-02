package com.yangGe;

import java.util.concurrent.CountDownLatch;

public class CountlDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        //countDownLatch 倒计时 await（）等待  直到计数器为0时，线程才开启
        CountDownLatch cd = new CountDownLatch(6);
        for (int i = 1; i <= 6; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"我先回房间了");
                    cd.countDown();
                }
            }).start();

        }
        cd.await();
        System.out.println(Thread.currentThread().getName()+"关门");
    }

}
