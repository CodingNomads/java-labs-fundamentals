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
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Minutes Up To 1.000.000");

        while(true) {
            int min = keyboard.nextInt();

            if (min > 1000000)
                System.out.println("Enter minutes up to 1.000.000");
            else {
                double days = (double) min / (60 * 24);
                double years = days / 365;
                System.out.println(min + " minutes = " + days + " days" + years + " years.");
                break;
            }
        }
    }
}


