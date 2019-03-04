package com.codingnomads.part_10;

public class MyTThread extends Thread{

    public MyTThread(String name) {
        super(name);
        start();
    }

    public void run(){
        System.out.println(getName() + "starting.");
        try{
            for(int count = 0; count < 10; count ++){
                Thread.sleep(200);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException exc){
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyTThread mt = new MyTThread("Child 1");

        for(int i = 0; i < 50; i++){
            System.out.println(".");
            try{
                Thread.sleep(200);
            } catch (InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }

}
