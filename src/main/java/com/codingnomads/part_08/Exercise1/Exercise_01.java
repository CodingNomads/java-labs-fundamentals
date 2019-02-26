package com.codingnomads.part_08.Exercise1;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        boolean divisorIsZero = true;

        while (divisorIsZero) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number you want to divide: ");
            int numberA = scanner.nextInt();

            System.out.println("Enter the number you want to divide by: ");
            int numberB = scanner.nextInt();

            try {
                System.out.println("Result is: " + numberA / numberB);
                divisorIsZero = false;
            } catch (ArithmeticException e) {
                System.out.println("You cannot divide by 0, try again!");
                divisorIsZero = true;
            }
        }
        System.out.println("Completed");
    }
}
