package com.yangGe;

public class LockDemo1 {

    public static void main(String[] args) {
        LockDemo lockDemo = new LockDemo();
        new Thread(()->{
            lockDemo.print5();
        }).start();
        new Thread(()->{
            lockDemo.print10();
        }).start();
        new Thread(()->{
            lockDemo.print15();
        }).start();
    }
}
