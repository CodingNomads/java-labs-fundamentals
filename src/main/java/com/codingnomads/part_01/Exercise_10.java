package com.codingnomads.part_01;

/**
 * Part 1 Exercise 10:
 * <p>
 * If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 * in miles per hour. (Tip: 1 mile = 1.6 km)
 */

public class Exercise_10 {

    public static void main(String[] args) {

        double distanceKm = 12.0;
        double timeSeconds = ((30*60)+(30));

        double distanceMiles = (distanceKm / 1.6);

        double averageMilesPerSecond = distanceMiles / timeSeconds;

        double averageMilesPerHour = averageMilesPerSecond * (60*60);

        System.out.println("The runners average speed in miles per hour is: " + averageMilesPerHour);


    }

}