package com.codingnomads.part_11;

/**
 * Modify your Queue Class so that it is completely generic
 */
public class Exercise_03 {
    public static void main(String[] args) {

        MyQueue<String> names = new MyQueue();


        System.out.println(names.add("roi"));
        System.out.println(names.add("cristian"));
        System.out.println(names.add("alp"));

        System.out.println(names.peek());


        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());

    }
}