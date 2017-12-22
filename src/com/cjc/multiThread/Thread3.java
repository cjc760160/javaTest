package com.cjc.multiThread;

/**
 * Created by Administrator on 2017-11-22.
 */
public class Thread3 extends Thread {
    private String name;

    public Thread3(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程运行开始");
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程" + name + "运行" + i);
            try {
                sleep((int)Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "线程运行结束");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "主线程开始");
        Thread3 t1 = new Thread3("线程1");
        Thread3 t2 = new Thread3("线程2");
        t1.start();
        try {
            t1.join();  //测试线程join()方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t2.join();
        System.out.println(Thread.currentThread().getName() + "主线程运行结束");
    }
}
