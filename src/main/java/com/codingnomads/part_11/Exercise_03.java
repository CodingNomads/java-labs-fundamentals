package com.codingnomads.part_11;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Modify your Queue Class so that it is completely generic
 */
public class Exercise_03 {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.poll();
        queue.offer(2);
        System.out.println(queue.toString());

        MyQueue<String> stringQueue = new MyQueue<>();

        stringQueue.add("a");
        stringQueue.add("b");
        stringQueue.add("c");
        stringQueue.add("d");
        stringQueue.add("e");
        stringQueue.add("f");
        stringQueue.poll();
        stringQueue.offer("l");
        System.out.println(stringQueue.toString());


    }

}

