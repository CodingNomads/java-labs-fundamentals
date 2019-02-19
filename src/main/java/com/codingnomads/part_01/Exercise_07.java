package com.codingnomads.part_01;

/**
 * Part 1 Exercise 7:
 * Print pi to the console using the following formula: note that this is not the complete series to
 * compute the true number pi. Do you see a pattern there? maybe can be done in a loop...
 * <p>
 * 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 */

public class Exercise_07 {

    public static void main(String[] args) {
        
        double product = 1;
        int x = 1;

        for (int i = 3; i <= 11; i = (i + 2)) {

            if (x % 2 == 1) {
                product = product - (1.0/i);

            } else {
                product = product + (1.0 / i);
            }

            x++;

        }

        double pi = product * 4.0;
        System.out.println("The formula evaluates to: " + pi);

    }

}