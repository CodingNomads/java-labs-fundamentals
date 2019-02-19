package com.codingnomads.part_01;

/**
 * Part 1 Exercise 11:
 * In the U.S., if there is:
 * - One person who is born every 6 seconds
 * - One person who dies every 12 seconds
 * - One person who immigrates every 40 seconds
 * <p>
 * Write the necessary code to display the total population for the next 3 years (without a leap year)
 * <p>
 * Let's say the current population is 380,123,456.
 */

public class Exercise_11 {
    public static void main(String[] args) {
        int totalSec = 365 * 24 * 60 * 60;
        int totalPop = 380123456;
        totalPop += 3 * (totalSec / 6) + (totalSec / 40) - (totalSec / 12);

        System.out.println(totalPop);


    }

}