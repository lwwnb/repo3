package yangGe;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclictBarrierDemo {
    public static void main(String[] args) {
        //CyclicBarrier,当到达指定数字时,从0开始,主线程执行
        CyclicBarrier cb=new CyclicBarrier(7,()->{
            System.out.println("集齐七龙珠，召唤神龙");
        });
        for( int i=1;i<=7;i++){
            int a=i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"第"+a+"颗七龙珠");
                try {
                    cb.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },String.valueOf(i)).start();
        }
    }

}
