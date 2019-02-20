package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 * <p>
 * Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 * How many years and days does that number in minutes represent?
 * <p>
 * For this exercise each year has 365 days.
 */
public class Exercise_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the minutes to convert to years: ");
        double minutes = scanner.nextInt();

        double minsInYears = ((minutes / 60) / 24) / 365;

        System.out.println(minutes + " is equivalent to: " + minsInYears);
    }

}


