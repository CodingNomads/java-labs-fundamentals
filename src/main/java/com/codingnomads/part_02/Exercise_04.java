package com.codingnomads.part_02;
import java.util.Scanner;


/**
 * Part 2 Exercise 4:
 * <p>
 * Pounds to kilos
 * <p>
 * One pound is 0.454 kilograms.
 */

public class Exercise_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a weight in pounds: ");

        double pounds = Double.parseDouble(input.nextLine());

        System.out.println("The weight inputted in kilos is: " + (pounds*0.454));

    }


}