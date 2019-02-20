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
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Pounds");
        double pound = keyboard.nextDouble();

        double kilograms = pound * 0.454;

        System.out.println(pound + " pound is " + kilograms + " kilograms");
    }
}