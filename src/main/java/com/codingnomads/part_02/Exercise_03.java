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

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Feet Length");
        double feet = keyboard.nextDouble();

        double meter = feet * 0.305;

        System.out.println(feet + " feet= " + meter + " meters. ");
    }

}