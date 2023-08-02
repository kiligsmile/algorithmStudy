package com.smile.thread;


class PrintABC {

    private volatile int value = 1;

    void printA() {
        synchronized (this) {
            while (value != 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ": A");
            value = 2;
            notifyAll();
        }
    }

    void printB() {
        synchronized (this) {
            while (value != 2) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ": B");
            value = 3;
            notifyAll();
        }
    }

    void printC() {
        synchronized (this) {
            while (value != 3) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ": C");
            value = 1;
            notifyAll();
        }
    }

}

public class Main {
    public static void main(String[] args) {

        PrintABC printABC = new PrintABC();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    printABC.printA();
                }
            }
        }, "线程一").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    printABC.printB();
                }
            }
        }, "线程二").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    printABC.printC();
                }
            }
        }, "线程三").start();

    }
}

