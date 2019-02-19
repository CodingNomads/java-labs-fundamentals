package com.codingnomads.part_01;

/**
 * Part 1 Exercise 10:
 * <p>
 * If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 * in miles per hour. (Tip: 1 mile = 1.6 km)
 */

public class Exercise_10 {
    public static void main(String[] args) {

        int kms = 12;
        double mins = 30.5;

        double result = (kms / 1.6) / ((mins * 60) / 3600);

        System.out.println(result);
    }

}