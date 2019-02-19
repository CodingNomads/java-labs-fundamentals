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
        float sum = 0;
        boolean sign = true;
        for(int i = 1; i < 12; i = i + 2){
            float number = 1f/i;

            if(!sign){
                number = number * -1;
                sign = true;
            } else {
                number = number * 1;
                sign = false;
            }
            sum +=number;
        }
        float pi = sum*4;
        System.out.println("Pi is estimated to " + pi +".");

    }
}