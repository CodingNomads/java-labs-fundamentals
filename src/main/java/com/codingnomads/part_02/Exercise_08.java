package com.codingnomads.part_02;
import java.util.*;

/**
 * Part 2 Exercise 8:
 * <p>
 * Receive a number between 0 and 1,000,000,000 from the user.
 * Use while loop to find the number - when the number is found
 * exit the loop and print the number to the console.
 */
public class Exercise_08 {
    public static void main(String[] args) {
        long number;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number between 0 and 1 million:");
            number = scanner.nextLong();
        } while (number < 0 || number > 1000000000);
        System.out.println(number);
    }
}

