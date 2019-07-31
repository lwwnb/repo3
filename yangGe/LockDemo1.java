package yangGe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockDemo1 {

    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {

                    System.out.println("明天找到工作了"+Thread.currentThread().getName());

                }
            });
        }


    }
}
