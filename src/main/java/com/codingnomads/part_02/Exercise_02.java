package com.codingnomads.part_02;
import  java.util.Scanner;

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

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a cylinder: ");

        double radius = Double.parseDouble(input.nextLine());

        System.out.println("Enter the length of the cylinder: ");

        double length = Double.parseDouble(input.nextLine());

        double area = radius * length * 3.1415;

        System.out.println("The area of the cylinder is: " + area);



    }


}