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

class Exercise_01 {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input 10 integers");

        while ( i < myIntArray.length) {
            myIntArray[i] = input.nextInt();
            System.out.println("Enter " + (myIntArray.length - 1 - i) + " more numbers.");
            i++;
        }

        System.out.println("10 numbers entered. Thank you.");

        for (i = 1; i < (myIntArray.length - 1); i = i + 2 ) {
            System.out.println(myIntArray[i]);
        }

        for (i = myIntArray.length - 2; i >= 0; i = i - 2) {
            System.out.println(myIntArray[i]);
        }

    }



}