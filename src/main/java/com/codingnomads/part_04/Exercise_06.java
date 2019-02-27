package com.codingnomads.part_04;
import java.util.*;

/**
 * Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 * it cannot be retrieved again) of integers 0 through 100. Then print out every other
 * value in the queue.
 * <p>
 * expected output: 0,2,4,6,8.....100
 */

class Exercise_06 {
    public static void main(String[] args) {

        int element = 0;

        // Declaring queue
        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 0; i < 101; i++) {
            q.add(i);
        }

        for (int i = 1; i < 101; i = i + 2) {
            q.remove(i);
        }

        System.out.println(q);
    }
}