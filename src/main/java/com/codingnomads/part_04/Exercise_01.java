package com.codingnomads.part_04;

import java.util.Scanner;

/**
 * Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 * Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 * The print out the 9th, 7th, 5th, 3rd, and 1st.
 * <p>
 * Example input: 1,2,3,4,5,6,7,8,9,10
 * Example output: 2,4,6,8,10,9,7,5,3,1
 * <p>
 * Output can be on one line or many lines. However you like.
 */

class Array{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int [] array = new int [10];

        for(int i = 0; i < array.length; ++i){
            System.out.println("Start Enter Numbers");
            System.out.println("Number " + i);
            array[i] = keyboard.nextInt();
        }

        for(int i = 1; i < array.length; i += 2)
            System.out.print(array[i] + " ");

        for(int i = array.length - 2; i >= 0; i -= 2)
            System.out.print(array[i] + " ");


    }
}