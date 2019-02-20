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

        System.out.println("What is the radius of the cylinder: ");
        double cylRadius = scanner.nextDouble();

        System.out.println("What is the length of the cylinder: ");
        double cylLength = scanner.nextDouble();

        double volOfCyl = Math.PI * Math.pow(cylRadius, 2) * cylLength;
        //The area formula in requirements does not seem right
        double areaOfCyl = 2 * Math.PI * cylRadius * cylLength + 2 * Math.PI * Math.pow(cylRadius, 2);

        System.out.println("The Volume of the cylinder is: " + volOfCyl + " and the Area is: " + areaOfCyl);


    };
};
