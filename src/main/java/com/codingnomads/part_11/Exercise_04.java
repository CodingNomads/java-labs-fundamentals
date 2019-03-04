package com.codingnomads.part_11;

/**
 * Make a new generic method called sumArray that will return the
 * sum of all numbers in the array (no matter data type of numbers
 * the array has in it)
 */


public class Exercise_04 {
    public static void main(String[] args) {

        Number [] array = {2, 3.4, 555L, 1000F, 1, 3423};

        System.out.println(sumArray(array));

    }

    public static <T extends Number> Object sumArray(T[] array){

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }

       return (Object)sum;
    }
}


