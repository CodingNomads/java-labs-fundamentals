package com.codingnomads.part_11;

/**
 * Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {

    static <T> void arrayElementSwap (T[] inputArray, int a, int b) {
        T store = null;
        store = inputArray[a];
        inputArray[a] = inputArray[b];
        inputArray[b] = store;


        for (T c: inputArray) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8};
        String[] stringArray = {"This","sentence","will","not","make","sense"};

        arrayElementSwap(intArray,5,3);
        arrayElementSwap(stringArray,3,5);
    }

}

