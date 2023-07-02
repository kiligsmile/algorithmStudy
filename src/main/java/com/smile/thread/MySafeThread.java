package com.smile.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**

 * 编写一个线程安全的计数器

 * 5个线程一起跑，输出线程和计数到1000

 * @author yadid

 *

 */

public class MySafeThread implements Runnable {
// 设置计数初值为0
    private static AtomicInteger count = new AtomicInteger(0);
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MySafeThread.calc();
        }
    }
    private synchronized static void calc() {
        if (count.get() < 1000) {
// 自增1，返回更新后的值
            int c = count.incrementAndGet();
            System.out.println("线程:" + Thread.currentThread().getName()+" :" + c);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MySafeThread myThread = new MySafeThread();
            Thread t = new Thread(myThread);
            t.start();
        }
    }
}

