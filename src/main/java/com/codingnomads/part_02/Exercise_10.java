package com.codingnomads.part_02;

/**
 * Part 2 Exercise 10:
 * <p>
 * Write a program that prints out every prime number between 1 and 100
 */
public class Exercise_10 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;

        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter+= 1;
                }
            }
            if (counter == 2) {
                System.out.print(i + " ");
            }
        }

    }
}


