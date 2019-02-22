package com.codingnomads.part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

public class Exercise_02{

    public static void main(String[] args) {

        int[] numArray = new int[2018];

        for(int i = 0; i <= 2017; i++){
            numArray[i] = i;
        }

        for(int i = 2017; i > 0; i= i -2){
            System.out.println(numArray[i]);
        }
    }

}