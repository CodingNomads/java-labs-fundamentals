package com.codingnomads.part_04;

import java.util.Scanner;

/**
 * Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 * Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 * Then print out the 9th, 7th, 5th, 3rd, and 1st.
 * <p>
 * Example input: 1,2,3,4,5,6,7,8,9,10
 * Example output: 2,4,6,8,10,9,7,5,3,1
 * <p>
 * Output can be on one line or many lines. However you like.
 */

class ArrayNumbers{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = new int[10];

        System.out.println("Please enter 10 numbers: ");


        for(int i = 0; i < input.length; i++){

            input[i] = scanner.nextInt();
        }

        for(int t = 1; t < input.length; t=+2){

            System.out.print(input[t] + ", ");
        }
        System.out.println();

        for(int c = 8; c < input.length; c=-2){

            System.out.println(input[c] + ", ");
        }

    }

}