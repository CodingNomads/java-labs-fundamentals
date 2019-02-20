package com.codingnomads.part_02;
import java.util.*;
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
        double minute;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number in minutes, up to 1,000,000,000:");
            minute = scanner.nextDouble();
        } while (minute >1000000000);
        System.out.println(minute + " minutes is " + minute/60/24/365 + " years.");
    }
}


