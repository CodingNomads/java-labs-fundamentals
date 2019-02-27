package com.codingnomads.part_10;

/**
 * Create an application that demonstrates how to create threads by implementing the runnable interface
 * Create an application that demonstrates how to create threads by extending Thread
 */

class ThreadSample{
    public static void main(String[] args) {

        System.out.println("Main Started");

        Thread thread1 = new Thread1("Thread 1");
        Thread thread2 = new Thread2("Thread 2");

        thread1.start();
        thread2.start();

        System.out.println("Main Ended");
    }
}

class Thread1 extends Thread implements Runnable{
    Thread thread1;

    public Thread1(String name){

        this.thread1 = new Thread(this,name);
    }

    public void run(){
        System.out.println(thread1.getName() + " Started");

        for (int i = 0; i < 1000 ; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread1.getName() + " Counting " + i);
        }

        System.out.println(thread1.getName() + " Ended");
    }
}

class Thread2 extends Thread implements Runnable{
    Thread thread2;

    Thread2 (String name){
        this.thread2 = new Thread(this,name);
    }

    public void run(){
        System.out.println(thread2.getName() + " Started");

        for (int i = 0; i < 1000 ; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread2.getName() + " printing " + "*");
        }

        System.out.println(thread2.getName() + " Ended");
    }
}