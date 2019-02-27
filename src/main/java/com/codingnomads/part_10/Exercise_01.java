package com.codingnomads.part_10;

/**
 * Create an application that demonstrates how to create threads by implementing the runnable interface
 * Create an application that demonstrates how to create threads by extending Thread
 */

class Part10 {
    public static void main(String[] args) {
        Sample operation = new Sample();
        AnotherOne operation1 = new AnotherOne();

        Thread thread = new Thread(operation);
        thread.run();

        Thread thread1 = new Thread(operation1);
        thread1.run();
    }
}

class Sample implements Runnable {
    @Override
    public void run() {
        int a = 0;
        for (int i = 10000000; i > 1; i--) {
            a+=1;
            System.out.println(a);
        }
    }
}

class AnotherOne implements Runnable {
    @Override
    public void run() {
    int b = 0;
        for (int i = 0; i < 1000000000; i++) {
            b+=1;
            System.out.println(b);
        }
    }
}

