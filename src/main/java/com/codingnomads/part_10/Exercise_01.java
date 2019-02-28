package com.codingnomads.part_10;

/**
 * Create an application that demonstrates how to create threads by implementing the runnable interface
 * Create an application that demonstrates how to create threads by extending Thread
 */

class MyThread implements Runnable {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " starting");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + threadName + ", count is: " + count);

            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interupted");
        }
        System.out.println("Thread finished.");
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1"); // constructing runnable objects
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        Thread newThread1 = new Thread(thread1); // construct thread on objects
        Thread newThread2 = new Thread(thread2);
        Thread newThread3 = new Thread(thread3);

        newThread1.start(); // starting threads.
        newThread2.start();
        newThread3.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(" . ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread ended");
    }

}