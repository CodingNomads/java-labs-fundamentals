package com.codingnomads.part_10;

public class MyThread2 extends Thread {

    MyThread2(String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName() + " starting");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(getName() + " is at " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println("thread interrupted yo.");
        }
        System.out.println(getName() + " fin.");
    }
}

class ThreadExtends {
    public static void main(String[] args) {
        System.out.println("Main thread starting");

        MyThread2 mainthread = new MyThread2("MyThread2 thread");

        for (int i = 0; i < 50; i++) {
            System.out.println(" . ");
            try {
                mainthread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("something went wrong.");
            }
        }

        System.out.println("main thread fin.");
    }
}
