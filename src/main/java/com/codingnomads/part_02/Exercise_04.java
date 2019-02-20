package com.codingnomads.part_02;
import java.util.*;

/**
 * Part 2 Exercise 4:
 * <p>
 * Pounds to kilos
 * <p>
 * One pound is 0.454 kilograms.
 */

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to convert from pounds to kilos:");
        double pound = scanner.nextDouble();

        double kilo = pound * 0.454;

        System.out.println(pound + " pounds is " + kilo + " kilos.");
    }

}