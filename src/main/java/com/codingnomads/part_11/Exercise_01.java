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

    public void printArray(T[] input) {
        for (T element : input) {
            System.out.println(element);
        }
    }

}

class ControllerForThis {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3};
        String[] arr2 = {"Hello","World"};

        Exercise_01<Integer> printerOfInts = new Exercise_01<>();
        printerOfInts.printArray(arr1);

        Exercise_01<String> printerOfStrings = new Exercise_01<>();
        printerOfStrings.printArray(arr2);
    }
}










