package com.codingnomads.part_02;

import java.util.InputMismatchException;
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

        System.out.println("Investment amount: ");
        double invAmt = scanner.nextDouble();

        System.out.println("Interest rate as a percentage: ");
        try {

            double intRate = scanner.nextDouble();
            System.out.println("Number of years to invest: ");
            double years = scanner.nextDouble();
            double futureAmt = invAmt + (invAmt * (intRate * years));
            System.out.println("The future value for your initial investment of " + invAmt + " at an interest rate of "
                    + intRate + " during " + years + " year(s) will be: " + futureAmt);
        } catch (InputMismatchException exc) {

            String tempIntRate = scanner.nextLine();
            String newIntRate = tempIntRate.replace("%", "");
            double intRate = Double.parseDouble(newIntRate) / 100.00;

            System.out.println("Number of years to invest: ");
            double years = scanner.nextDouble();

            double futureAmt = invAmt + (invAmt * (intRate * years));

            System.out.println("The future value for your initial investment of " + invAmt + " at an interest rate of "
                    + intRate * 100 + "% during " + years + " year(s) will be: " + futureAmt);
        }
    }
}


