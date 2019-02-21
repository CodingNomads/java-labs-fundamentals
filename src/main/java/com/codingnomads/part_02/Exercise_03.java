package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 * <p>
 * Read in a number in feet from the console
 * and print out the corresponding length in meters
 * <p>
 * 1 foot = .305 meter.
 */

public class Exercise_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many feet do you want to convert to meters: ");
        double userFeet = scanner.nextDouble();

        double meters = userFeet * 0.305;

        System.out.println(userFeet + " in meters is: " + meters);
    }

}