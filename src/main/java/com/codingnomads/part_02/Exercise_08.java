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

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a number between 0 - 1.000.000");

        for(;;) {

            int val = kb.nextInt();

            if (val < 0 || val > 1000000)
                System.out.println("Enter a number between 0 - 1.000.000");
            else {
                int count = 0;

                while (count++ <= 1000000) {
                    if (val == count)
                        break;
                }

                System.out.println(val);
                break;
            }
        }
    }
}

