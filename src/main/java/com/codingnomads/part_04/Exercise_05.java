package com.codingnomads.part_04;
import java.util.Arrays;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {

        int[] array = new int[10];
        Arrays.fill(array, 1337);

        for (int a : array) {
            System.out.println(a);
        }

    }
}