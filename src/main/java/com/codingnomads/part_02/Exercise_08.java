package com.codingnomads.part_02;
import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 * <p>
 * Receive a number between 0 and 1,000,000,000 from the user.
 * Use while loop to find the number - when the number is found
 * exit the loop and print the number to the console.
 */
public class Exercise_08 {

    public static void main(String[] args) {

        System.out.println("Enter a number between 0 and 1,000,000,000: ");
        Scanner input = new Scanner(System.in);
        int guess = Integer.parseInt(input.nextLine());
        int i = 0;

        while (guess != i) {
            System.out.println("Searching...");
            i++;
        }

        System.out.println("FOUND. Your number is: " + i);

    }

}

