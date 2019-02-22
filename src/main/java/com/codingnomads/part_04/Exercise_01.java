package com.codingnomads.part_04;
import java.util.*;


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

public class Exercise_01{

    public static void main(String[] args) {
        int[] intArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please print out 10 integers");

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println(intArray[1]);
        System.out.println(intArray[3]);
        System.out.println(intArray[7]);
        System.out.println(intArray[9]);
        System.out.println(intArray[8]);
        System.out.println(intArray[6]);
        System.out.println(intArray[4]);
        System.out.println(intArray[2]);
        System.out.println(intArray[0]);


    }

}