package com.codingnomads.part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {

        int[] myArray = new int[6];

        for(int i = 0; i < myArray.length; i++){

            myArray[i] = i * 7;
}

        for(int x : myArray){
            System.out.println(x);
        }


    }
}