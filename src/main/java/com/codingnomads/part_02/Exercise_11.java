package com.codingnomads.part_02;
import java.util.Scanner;
import java.math.*;

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

        Scanner input = new Scanner(System.in);

        System.out.println("How much do you want to invest? ($): ");
        double investmentAmount = Double.parseDouble(input.nextLine());

        System.out.println("What percentage rate should be applied? : ");
        double investmentRate = Double.parseDouble(input.nextLine());

        System.out.println("How many years are you going to HODL your investment? ");
        double investmentDuration = Double.parseDouble(input.nextLine());

        double futureValueInterim = Math.pow((1 + investmentRate), investmentDuration);
        double futureValue = investmentAmount * futureValueInterim;

        System.out.println("The future value of your investment will be: "  + futureValue + " $");

    }

}


