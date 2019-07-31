package com.yangGe;

public class Th extends  Thread implements Runnable{
    public static String str;

    @Override
    public void run() {
        System.out.println("lww");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Th());
        t.start();

        str="b";
        System.out.println(str);
    }
}
