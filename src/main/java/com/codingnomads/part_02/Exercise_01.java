package com.codingnomads.part_02;
import java.util.Scanner;

/**
 * Part 2 Exercise 1:
 * Celsius to Fahrenheit
 * <p>
 * Write the necessary code to read a degree in Celsius (as a double) from the console
 * then convert it to fahrenheit and print it to the console.
 * <p>
 * F = 9 * (C / 5) + 32;
 * <p>
 * Output should read like - "27.4 degrees celsius = 81.32 degrees fahrenheit"
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter Degree");
        double degree = kb.nextDouble();

        double fahrenheit = 9 * (degree / 5) + 32;

        System.out.println(degree + " degrees celsius = " + fahrenheit + " degrees fahrenheit");
    }
}