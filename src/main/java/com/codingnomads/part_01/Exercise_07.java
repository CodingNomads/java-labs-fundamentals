package com.codingnomads.part_01;


import java.util.ArrayList;

/**
 * Part 1 Exercise 7:
 * Print pi to the console using the following formula: note that this is not the complete series to
 * compute the true number pi. Do you see a pattern there? maybe can be done in a loop...
 * <p>
 * 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 */

public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<Double> numSequence = new ArrayList<>();


        for (int i = 3; i < 12; i+=2) {
            numSequence.add(1.0 / i);
        }

        System.out.println(4.0 * (1 - (numSequence.get(0)) + (numSequence.get(1)) - (numSequence.get(2)) +
                (numSequence.get(3) - (numSequence.get(4)))));


    }

}