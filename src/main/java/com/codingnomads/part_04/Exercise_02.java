package com.codingnomads.part_04;

import java.util.Arrays;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class Exercise_02 {

    public static void main(String[] args) {

        int[] myArrayInt = new int[2018];
        for (int i = 0; i < myArrayInt.length; i++) {
            myArrayInt[i] = i;
        }

        for (int i = myArrayInt.length - 1; i > 0; i = i - 2) {
            System.out.println(myArrayInt[i]);
        }

    }
}