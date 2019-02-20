package com.codingnomads.part_01;

/**
 * Part 1 Exercise 9:
 * <p>
 * Write the necessary code to display the area of a rectangle, as well as the perimeter of
 * a rectangle that has a width of 2.4 and a height of 6.4
 */

 class Rectangle {


        public double calculateArea(double width, double height){

            double area = height * width;
            return area;
        }

        public double calculatePerimeter(double width, double height){

        double perimeter = 2 * width + 2 * height;
        return perimeter;
    }
}


public class Exercise_09 {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        System.out.println("This is the area of the rectangle: " +rectangle1.calculateArea(2.4, 6.4));
        System.out.println("This is the perimeter of the rectangle: " +rectangle1.calculatePerimeter(2.4, 6.4));

        }
    }


