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

        System.out.println("Miles to drive: ");
        double milesToDrive = scanner.nextDouble();

        System.out.println("MPG: ");
        double mpg = scanner.nextDouble();

        System.out.println("Price per gallon on fuel: ");
        double gasPrice = scanner.nextDouble();

        double totalCost = (milesToDrive / mpg) * gasPrice;

        System.out.println("The cost of the trip will be: " + totalCost);
    }

}