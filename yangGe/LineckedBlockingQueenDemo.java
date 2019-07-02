package com.yangGe;

import java.util.concurrent.ArrayBlockingQueue;

public class LineckedBlockingQueenDemo {
    //当阻塞队列为空时,从队列中获取元素将会阻塞,直到其他线程往空队列中插入新元素
    //当阻塞队列是满时,往队列中添加元素会阻塞,直到其他线程从列中移除一个或多个元素或者完全清空队列使队列重新变得空闲起来后继续新增
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(3);
        //插入
        abq.add("a");//当超过界限时会报异常
        abq.offer("b");//当 超过界限时会返回false
        abq.put("cc");//当超过界限时会阻塞,进入等待状态,直至取出
        //移除
        abq.remove();//当超过界限时会报异常
        abq.poll();//当 超过界限时会返回false
        abq.take();//当阻塞队列为空时,队列会一直阻塞消费者直到队列可用
        //检查
        abq.peek();//查询队首元素

    }
    public void add(){

    }
}
