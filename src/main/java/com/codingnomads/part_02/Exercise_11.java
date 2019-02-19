package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 * <p>
 * Calculate investment value
 * <p>
 * Receive the following args from user:
 * - investment amount
 * - interest rate in percentage
 * - number of years to invest
 * <p>
 * Print future value to the console.
 */

public class Exercise_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount you wish to invest: ");

        double amount = scanner.nextDouble();

        System.out.println("Please enter the interest rate in percentage, you wish to calculate with: ");

        int interestRatePercentage = scanner.nextInt();
        double calculation = 1 + (interestRatePercentage/100);

        System.out.println("Please enter the number of years you wish to invest.");

        int years = scanner.nextInt();

        double futureAmount = amount * calculation * years;

        System.out.println(futureAmount + " is the amount of money you can expect it to be after " + years + " years.");


    }
}


