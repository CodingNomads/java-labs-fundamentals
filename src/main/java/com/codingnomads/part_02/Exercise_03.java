package com.codingnomads.part_02;
import  java.util.Scanner;

/**
 * Part 2 Exercise 3:
 * <p>
 * Read in a number in feet from the console
 * and print out the corresponding length in meters
 * <p>
 * 1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a length in feet: ");

        double feet = Double.parseDouble(input.nextLine());

        System.out.println("The length inputted in meters is: " + (feet * 0.305));

    }

}