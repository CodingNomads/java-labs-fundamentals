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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the radius of your cylinder: ");

        double radius = scanner.nextDouble();

        System.out.println("Please enter the length of your cylinder: ");

        double length = scanner.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = radius * radius * Math.PI * length;

        System.out.println("The area of your cylinder is: " + area);
        System.out.println("The volume of your cylinder is: " + volume);


    }


}