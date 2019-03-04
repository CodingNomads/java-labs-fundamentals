package com.codingnomads.part_04;
import java.util.*;

/**
 * Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 * it cannot be retrieved again) of integers 0 through 100. Then print out every other
 * value in the queue.
 * <p>
 * expected output: 0,2,4,6,8.....100
 */

public class Exercise_06{
    public static void main(String[] args) {

        Queue<Integer> exampleQueue = new LinkedList<>();

        for(int i = 0; i < 101; i++){
            exampleQueue.add(i);
        }


        for(int i = 0; i < 51; i++){
            System.out.println(exampleQueue.poll());
            exampleQueue.poll();

        }

//        Iterator<Integer> exQueItr = exampleQueue.iterator();

    }
}