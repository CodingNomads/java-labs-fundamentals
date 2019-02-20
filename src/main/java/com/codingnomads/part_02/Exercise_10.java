package com.codingnomads.part_02;

/**
 * Part 2 Exercise 10:
 * <p>
 * Write a program that prints out every prime number between 1 and 100
 */
public class Exercise_10 {
    public static void main(String[] args) {
        for(int num = 1; num < 101; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.println(num);
        }

    }
}



