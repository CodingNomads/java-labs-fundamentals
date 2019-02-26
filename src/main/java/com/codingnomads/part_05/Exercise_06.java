package com.codingnomads.part_05;

/**
 *
 * Study this functional example of using recursion to print the fibonacci sequence until you can comfortably explain
 * how it works and why to a stranger.
 *
 */


import java.util.Scanner;

public class Exercise_06 {                                //Class

    public static void main(String[] args) {             //main method
        Scanner stdIn = new Scanner(System.in);         // make a scanner object

        System.out.print("How many numbers do you want to print? ");
        int iter = stdIn.nextInt();                     //enter the number of elements you want to print. = new int
        for (int i=0;i<iter;i++) {                      // count up to the number you entered from 0
            System.out.print(fibonacci(i) + " ");       //print the fibonacci method on each number you entered
        }

        stdIn.close();
    }

    public static long fibonacci(long n) {              //fibonacci method that takes a long as a parameter
        if (n<0)
            throw new IllegalArgumentException("Can't accept negative arguments"); // dose not allow for negative


        return
                (n < 2) ? n : fibonacci(n-1) + fibonacci(n-2); // if n is less than 2 print itself/ else (n-1) + (n-2)
    }
}