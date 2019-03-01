package com.codingnomads.part_11;

import java.util.Arrays;
import java.util.NoSuchElementException;


/**
 * Modify your Queue Class so that it is completely generic
 */
class QueueClass<T> {

    // Private Instance variables
    private int maxSize;
    private Object[] queArray;
    private int numOfItems;
    private int front;
    private int rear;

    // Method to create queue array
    public void createQueue(int s) {
        maxSize = s;
        queArray = new Object[maxSize];
        numOfItems = 0;
        front = 0;
        rear = -1;
    }

    @Override
    public String toString() {
        return "QueueClass{" +
                "maxSize=" + maxSize +
                ", queArray=" + Arrays.toString(queArray) +
                ", numOfItems=" + numOfItems +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }

    public void add(T element) {
        if (arrayIsFull()) {
            incrementArraySize();
        }
        queArray[++rear] = element;
        numOfItems++; // increase counter of number of items by one
    }

    private void incrementArraySize() {
        System.out.println("Queue full; extending");
        Object[] temp = new Object[maxSize * 2];
        queArray = temp;
    }

    private boolean arrayIsFull() {
        return numOfItems == maxSize;
    }

//    public void offer() {
//
//    }


    public void remove() {
        queArray[front] = 0;
        front++;
        Object[] temp1 = new Object[queArray.length - 1];
        for (int i = front; i < queArray.length; i++) {
            temp1[i - 1] = queArray[i];
        }
        queArray = temp1;
        front--;
        numOfItems--;

    }

    public int poll() {
        T element = (T) queArray[front];
        front++;
//        Object[] temp1 = new Object[queArray.length - 1];
//        for (int i = front; i < queArray.length; i++) {
//            temp1[i - 1] = queArray[i];
//        }
//        queArray = temp1;
        front--;
        numOfItems--;
        return a;
    }

    public int element() {
        try {
            return queArray[front];
        } catch (NoSuchElementException exc) {
            System.out.println("Queue is empty");
        }
        return queArray[front];
    }


    public int peek() {
        return queArray[front];
    }

    public int size() {
        return numOfItems;
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

        System.out.println("Queue size is: " + queue.size());
        System.out.println("Front of queue is: " + queue.peek());
        System.out.println("Element method returns: " + queue.element());
        System.out.println("Poll method returns: " + queue.poll());

        System.out.println("Queue composition after poll method: " + queue.toString());

    }
}