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

        System.out.println("Enter a number of minutes: ");
        Scanner input = new Scanner(System.in);
        double minutes = Double.parseDouble(input.nextLine());
        boolean goAhead = false;

        while (goAhead == false) {
        if ((minutes > 1000000000) || (minutes < 0)) {
            System.out.println("Out of range. Please enter between 0 & 1,000,000,000");
            }

        else {

            goAhead = true;

            }
        }

        double numYears = minutes / (365 * 24 * 60);
        double numDays = ((minutes % 31536000) / (24 * 60));

        if (numYears < 1) {
            numYears = 0;
        }

        System.out.println(numYears + " years " + numDays + " days.");

    }
}


