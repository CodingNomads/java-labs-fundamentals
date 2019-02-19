package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 * <p>
 * Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 * How many years and days does that number in minutes represent?
 * <p>
 * For this exercise each year has 365 days.
 */
public class Exercise_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter minutes here: \nWe will tell you how many years and days they are.");

        int minutes = scanner.nextInt();

        if (minutes <= 1000000000) {
            double days = (int) minutes / 1440;

            int years = (int) days / 365;

            int realDays = (minutes - years * 525600) / 1440;

            System.out.println("This would be " + years + " years and " + realDays + " days.");
        } else {
            System.out.println("Sorry! Your number is too high!");
        }
    }
}


//minutes/525600;

