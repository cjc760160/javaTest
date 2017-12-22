package com.cjc.multiThread;

/**
 * Created by Administrator on 2017-11-23.
 */
public class Thread4 extends Thread {
    public Thread4(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50 ; i++) {
            System.out.println("" +  this.getName() + "--------" + i);
            //当i为30时，该线程会把CPU时间让掉，让其他活着自己的线程执行（谁先抢到谁执行）
            if (i ==30) {
                this.yield();
            }
        }
    }

       public static void main(String[] args) {
        Thread4 t1 = new Thread4("张三");
        Thread4 t2 = new Thread4("李四");
        t1.start();
        t2.start();
    }
}
