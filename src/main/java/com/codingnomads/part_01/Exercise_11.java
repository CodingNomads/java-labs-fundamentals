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
        float birthPerMinute = 6/60f;
        float deathPerMinute = 12/60f;
        float immigrantsPerMinute = 40/60f;
        float changesPerMinute = birthPerMinute + immigrantsPerMinute - deathPerMinute;
        double currentPop = 380123456;
        double popGrowthPerYear = 365 * 24 * 60 * changesPerMinute;
//        System.out.println(popGrowthPerYear);
//        double popGrowthPerYear = 365 * 24 * 60 *  (1+ birthPerMinute) * (1 - deathPerMinute) * (1+immigrantsPerMinute);
        System.out.println("The population will be " + (int)((3 * popGrowthPerYear) + currentPop) + " in three years.");

    }

}