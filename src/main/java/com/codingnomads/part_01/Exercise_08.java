package com.codingnomads.part_01;

/**
 * Part 1 Exercise 8:
 * <p>
 * Write the necessary code that prints out the area
 * and perimeter of a circle with a radius of 3.14
 */

public class Exercise_08 {
    public static void main(String[] args) {

        double area = 3.14 * 3.14 * Math.PI;
        double perimeter = 2 * 3.14 * Math.PI;

        System.out.println("Area: " + area);
        System.out.println("Perimeter " + perimeter);
    }

}