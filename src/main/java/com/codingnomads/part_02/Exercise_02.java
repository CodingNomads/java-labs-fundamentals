package com.codingnomads.part_02;
import java.util.*;

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
        System.out.println("Enter the height of the cylinder:");
        double height = scanner.nextDouble();
        System.out.println("Enter the radius of the cylinder:");
        double radius = scanner.nextDouble();

        double area = radius * radius * Math.PI + radius * 2 * Math.PI;
        double volumne = area * height;

        System.out.println("Volumne = "+ (int)volumne + "; Area = " + (int)area);
    }
}