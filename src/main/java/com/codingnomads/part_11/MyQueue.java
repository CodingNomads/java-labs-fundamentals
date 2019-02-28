package com.codingnomads.part_11;

import java.util.Arrays;


/**
 * Modify your Queue Class so that it is completely generic
 */
public class MyQueue<E> {

    private Object[] queue;
    private Integer size = 0;
    private E head = null;
    private Integer indexOfHead = 0;

    public MyQueue() {
        this.queue = new Object[5];
    }

    public E poll() {
        if (head != null) {
            queue[indexOfHead] = null;
            indexOfHead++;
            E temp = head;
            head = (E)queue[indexOfHead];
            return temp;
        } else {
            return null;
        }
    }

    public E peek() {
        if (head != null) {
            return head;
        } else {
            return null;
        }
    }

    public void add(E element) {
        if (head == null) {
            head = element;
            queue[0] = head;
            size++;
        } else {
            if (size == queue.length) {
                increaseLengthOfQueue();
            }
            queue[size] = element;
            size++;
        }
    }

    private void increaseLengthOfQueue() {
        queue = Arrays.copyOf(queue,size * 2);
    }
}