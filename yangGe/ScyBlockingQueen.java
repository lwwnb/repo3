package com.yangGe;

import sun.security.provider.NativePRNG;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class ScyBlockingQueen {
    public static void main(String[] args) {
        //单个元素的队列,生产后消费之后才能生产第二个
        BlockingQueue<String> blockingQueue=new SynchronousQueue<>();
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName()+"put 1");
                blockingQueue.put("a");
                System.out.println(Thread.currentThread().getName()+"put 2");
                blockingQueue.put("b");
                System.out.println(Thread.currentThread().getName()+"put 3");
                blockingQueue.put("c");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName()+"取出"+blockingQueue.take());
                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName()+"取出"+blockingQueue.take());
                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName()+"取出"+blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
