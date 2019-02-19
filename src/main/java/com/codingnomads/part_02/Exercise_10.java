package com.codingnomads.part_02;

/**
 * Part 2 Exercise 10:
 * <p>
 * Write a program that prints out every prime number between 1 and 100
 */
public class Exercise_10 {
    public static void main(String[] args) {

        boolean flag = false;

        for(int i = 2; i < 100; ++i) {
            flag = false;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }

            if(!flag)
                System.out.print(i + " ");
        }
    }
}


