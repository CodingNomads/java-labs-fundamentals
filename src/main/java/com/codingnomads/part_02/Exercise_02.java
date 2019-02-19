package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 * <p>
 * Write the necessary code that reads the radius
 * and the length of a cylinder from the console
 * then computes the volume and area and prints the
 * results to the console.
 * <p>
 * tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter Radius");
        int radius = kb.nextInt();

        System.out.println("Enter Length");
        int length = kb.nextInt();

        double area = (2 * radius * radius * 3.1415) + (2 * 3.1415 * radius * length);
        double volume = 3.1415 * radius * radius * length;

        System.out.println("Area: " + area + "\nVolume: " + volume);

    }


}