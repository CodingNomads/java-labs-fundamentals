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
        int bornPerDay = (60 * 60 * 24) / 6;
        int deadPerDay = (60 * 60 * 24) / 12;
        int immPerDay = (60 * 60 * 24) / 40;
        int currPop = 380123456;
        int threeYearsInDays = 365 * 3;

        System.out.println("The total population in 3 years will be: " + (currPop + (bornPerDay * threeYearsInDays) +
                (immPerDay * threeYearsInDays) - (deadPerDay * threeYearsInDays)));

    }

}