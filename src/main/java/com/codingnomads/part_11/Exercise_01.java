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

    public static <T> void printArray(T[]... inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.println(inputArray[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray, stringArray);

    }
}






