package com.codingnomads.part_01;


/**
 * Part 1 Exercise 8:
 * <p>
 * Write the necessary code that prints out the area
 * and perimeter of a circle with a radius of 3.14
 */

public class Exercise_08 {

    public static void main(String[] args) {
        double radius = 3.14;
        double area;
        double perimeter;

        perimeter = 2* Math.PI * radius;
        area = (radius*radius)* Math.PI;

        System.out.println("This is the perimeter of the circle: " + perimeter);
        System.out.println("This is the area of the circle: " + area);


    }

}