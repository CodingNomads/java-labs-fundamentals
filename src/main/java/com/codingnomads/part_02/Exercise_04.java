package com.codingnomads.part_02;

import java.util.Scanner;

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

        System.out.println("Please put in your amount in pounds: ");

        double pounds = scanner.nextDouble();
        double kilos = pounds * 0.454;

        System.out.println("This would be "+ kilos + " kilos.");
    }



}