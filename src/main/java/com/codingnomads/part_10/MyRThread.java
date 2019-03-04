package com.codingnomads.part_10;

public class MyRThread implements Runnable{

    String threadName;

    MyRThread(String name) {
        threadName = name;
    }

    public void run(){
        System.out.println(threadName + " starting");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(200);
                System.out.println("In" + threadName + ", count is " + count);
            }
        } catch (InterruptedException exc){
            System.out.println(threadName + "interrupted.");
        }
        System.out.println(threadName + "terminating.");
    }
}

class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyRThread myThread = new MyRThread("Child #1");

        Thread newThread = new Thread(myThread);

        newThread.start();

        for(int i = 0; i < 50; i++){
            System.out.println(".");
            try{
                Thread.sleep(100);
            } catch (InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
