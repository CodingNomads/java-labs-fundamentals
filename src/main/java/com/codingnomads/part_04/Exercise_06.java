package com.codingnomads.part_04;

import java.util.PriorityQueue;

/**
 * Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 * it cannot be retrieved again) of integers 0 through 100. Then print out every other
 * value in the queue.
 * <p>
 * expected output: 0,2,4,6,8.....100
 */


class QueueSample{
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue();

        for(int i = 0; i <= 100; i++) {
            priorityQueue.add(i);
        }

        for (int i = 1; i < 100; i += 2) {
            priorityQueue.remove(i);

        }

        for(int i = 0; i < 51; ++i){
            System.out.print(priorityQueue.poll() + " ");
        }
    }
}