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

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter Money for Investment");
        double money = kb.nextDouble();

        System.out.println("Enter Interest Rate");
        double i = kb.nextDouble();

        System.out.println("Enter Years to Invest");
        int year = kb.nextInt();

        double futureVal = money * i * year / 100 + money;

        System.out.println("Future Value is: " + futureVal);

    }

}


