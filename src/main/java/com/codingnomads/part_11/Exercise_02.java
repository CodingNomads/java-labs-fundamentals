package com.codingnomads.part_11;

/**
 * Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {

    public static <E> void exchange(E[] inputArray, int x){
        E y = inputArray[x];
        inputArray[x] = inputArray[x-1];
        inputArray[x-1] = y;


        for(E elements : inputArray){
            System.out.println(elements);
        }
    }

    public static void main(String[] args) {

        Integer[] intArray = {0,1,2,3,4,5,6,7};

        exchange(intArray, 3);
    }
}

