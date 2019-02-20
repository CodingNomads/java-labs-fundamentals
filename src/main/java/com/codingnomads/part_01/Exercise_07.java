package com.codingnomads.part_01;

/**
 * Part 1 Exercise 7:
 * Print pi to the console using the following formula: note that this is not the complete series to
 * compute the true number pi. Do you see a pattern there? maybe can be done in a loop...
 * <p>
 * 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 */
//todo couldnt solve it

public class Exercise_07 {
    public static void main(String[] args) {
        double calculation = 0.0;
        boolean shouldAdd = false;


        for (int b = 3; b < 1000000000; b += 2) {
            if (shouldAdd) {
                calculation += 1.0 / b;
            } else {
                calculation -= 1.0 / b;
            }
            shouldAdd = !shouldAdd;

        }
        System.out.println("Pi will be: " + 4.0 * (1.0 + calculation));
    }
}

