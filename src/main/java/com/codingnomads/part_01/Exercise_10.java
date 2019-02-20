package com.codingnomads.part_01;

/**
 * Part 1 Exercise 10:
 * <p>
 * If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 * in miles per hour. (Tip: 1 mile = 1.6 km)
 */

public class Exercise_10 {
    public static void main(String[] args) {
        double distanceInMiles = 12/1.6;
        double speed = 30.00 / 60.00 + 30.00/3600;
        double averageSpeed = distanceInMiles/speed;

        System.out.println("This is the average speed in miles per hour: " + averageSpeed);
    }

}