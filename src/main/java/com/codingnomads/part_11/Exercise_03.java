package com.codingnomads.part_11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Modify your Queue Class so that it is completely generic
 */
class QueueClass {

    // Private Instance variables
    private int maxSize;
    private int[] queArray;
    private int currentPos;
    private int numOfItems;
    private int front;
    private int rear;

    // Method to create queue array
    public void createQueue(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        numOfItems = 0;
        front = 0;
        rear = -1;
    }

    @Override
    public String toString() {
        return "QueueClass{" +
                "maxSize=" + maxSize +
                ", queArray=" + Arrays.toString(queArray) +
                ", currentPos=" + currentPos +
                ", numOfItems=" + numOfItems +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }

    public void add(int a) {
        // Checking if queue is full
        if (numOfItems == maxSize) {
            System.out.println("Queue full; extending");
            int[] temp = new int[maxSize + 1];
            temp = queArray;
            return;
        }
        queArray[++rear] = a;
        numOfItems++; // increase counter of number of items by one
    }

    public void offer(){

    }



    public void remove(){
        queArray[rear] = 0;
        rear--;
        numOfItems--;

    }

    public void poll() {

    }

    public void element(){

    }

    public void peek() {

    }





    public static void main(String[] args) {

        QueueClass queue = new QueueClass();
        queue.createQueue(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.toString());

        queue.remove();
        queue.remove();

        System.out.println(queue.toString());

    }
}