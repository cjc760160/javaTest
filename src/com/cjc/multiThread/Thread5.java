package com.cjc.multiThread;

/**
 * Created by cjcjjj on 2017-11-23.
 */
public class Thread5 implements Runnable {
    private String name;
    private Object prev;
    private Object self;
 
    public Thread5(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Thread5 pa = new Thread5("A", c, a);
        Thread5 pb = new Thread5("B", a, b);
        Thread5 pc = new Thread5("C", b, c);

        new Thread(pa).start();
        Thread.sleep(100);
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
    }
}
