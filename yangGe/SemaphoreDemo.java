package com.yangGe;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {
    public static void main(String[] args) {
        //3个位置,3个线程可抢到,其他线程进行等待,非公平
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                try {
                    //acquire() 获取锁
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"抢到了");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(Thread.currentThread().getName()+"离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //释放锁
                    semaphore.release();
                }
            },String.valueOf(i)).start();
        }

    }
}
