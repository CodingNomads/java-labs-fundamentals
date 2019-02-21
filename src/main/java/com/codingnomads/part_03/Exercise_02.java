package com.codingnomads.part_03;

import java.util.Scanner;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task. For instance, create a
 main() method, a multiply(int a, int b) method, and a divide(int a, int b) method. From the main method call the
 multiply and divide methods (both of which return an int) then add the two returned values together and print them out.

 */

class Exercise_02{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int number1 = input.nextInt();

        System.out.println("Enter Number 2");
        int number2 = input.nextInt();

        System.out.println(pow(number1, number2) + divide(number1, number2));
    }

    public static int pow(int number, int exponent){

        int result = 1;

        while(exponent-- > 0)
            result *= number;

        return result;
    }

    public static int divide(int val1, int val2){

        return val1 / val2;
    }
}
