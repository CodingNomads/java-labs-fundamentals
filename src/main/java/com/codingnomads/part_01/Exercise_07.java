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

        double sum = 0;
        boolean flag = true;

        for (int i = 3; i < 100000; i += 2){

            if(flag)
                sum += 1.0 / i;
            else
                sum -= 1.0 / i;

            flag = !flag;
        }

        double result = 4.0 * (1 - sum);

        System.out.println(result);
    }
}