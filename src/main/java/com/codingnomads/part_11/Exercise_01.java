package com.codingnomads.part_11;

/**
 * Let's say you have an integer array and a string array. Write a single method printArray that can print all
 * the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
 * <p>
 * Complete the code so that it prints the following lines:
 * <p>
 * 1
 * 2
 * 3
 * Hello
 * World
 */

public class Exercise_01<T> {

    // Generic method to accept generic array type input array
    static <T> void printArray (T[] inputArray) {
        for (T element : inputArray) { // for each loop to cycle through array elements and print
            System.out.println(element);
        }


    }

    public static void main(String[] args) {

        Integer[] intArray = {1,2,3}; // creating arrays
        String[] stringArray = {"Hello","World"};

        printArray(intArray); // passing arrays to method.
        printArray(stringArray);

    }
}






