package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 * <p>
 * Receive the following arguments from the user:
 * - miles to drive
 * - MPG of the car
 * - Price per gallon of fuel
 * <p>
 * Display the cost of the trip in the console.
 */

public class Exercise_12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the miles to drive: ");

        double miles = scanner.nextDouble();

        System.out.println("Please enter the MPG of your car: ");

        double MPG = scanner.nextDouble();

        System.out.println("What is the price of a gallon of fuel: ");

        double price = scanner.nextDouble();

        double gallonsUsed = miles/MPG;

        double tripCost = gallonsUsed *price;

        System.out.println("Your trip will cost you " + tripCost + " Euro.");
    }

}