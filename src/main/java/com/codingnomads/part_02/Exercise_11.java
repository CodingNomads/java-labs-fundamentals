package com.codingnomads.part_02;
import java.util.*;
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
        System.out.println("Enter investment amount:");
        double principal = scanner.nextDouble();
        System.out.println("Enter interest rate in percentage: ");
        double interestRate = scanner.nextDouble();
        System.out.println("Enter the number of years to invest: ");
        int years = scanner.nextInt();

        System.out.println("Future value = " + principal * Math.pow((1+interestRate),years));
    }
}


