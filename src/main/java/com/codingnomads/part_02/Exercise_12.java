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

        Scanner input = new Scanner(System.in);

        System.out.println("How far do you want to drive?: ");
        double miles = Double.parseDouble(input.nextLine());

        System.out.println("What is the MPG of your car?: ");
        double mpg = Double.parseDouble(input.nextLine());

        System.out.println("How much is a gallon of petrol?: ");
        double pricePerGallon = Double.parseDouble(input.nextLine());

        double tripCost = miles / mpg * pricePerGallon;
        System.out.println("The price of your trip is: " + tripCost + " $");

    }

}