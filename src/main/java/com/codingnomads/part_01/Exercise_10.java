package com.codingnomads.part_01;

/**
 * Part 1 Exercise 10:
 * <p>
 * If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 * in miles per hour. (Tip: 1 mile = 1.6 km)
 */

public class Exercise_10 {
    public static void main(String[] args) {
        float hours = (30f+30f/60f)/60f;
        float miles = 12f/1.6f;
        float speed = miles/hours;
        System.out.println("The runner's speed is " + speed + " miles per hour.");
    }
}