package com.codingnomads.part_03;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

public class Exercise_02 {

    public static void main(String[] args) {

        int x = multiply(5,6);
        int y = divide(8,4);

        System.out.println((x + y));

    }

    static int multiply(int a, int b) {

        int product = a * b;
        return product;

    }

    static int divide(int a, int b) {

        int divided = a / b;
        return divided;
    }

}