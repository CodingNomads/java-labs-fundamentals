package com.codingnomads.part_02;
import java.util.*;
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
        System.out.println("Enter miles to drive: ");
        double miles = scanner.nextDouble();
        System.out.println("Enter MPG of the car: ");
        double mpg = scanner.nextDouble();
        System.out.println("Enter price per gallon of fuel: ");
        double price = scanner.nextDouble();

        System.out.println("The cost of the trip is " + miles / mpg * price);
    }

}