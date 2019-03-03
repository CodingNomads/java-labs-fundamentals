package com.codingnomads.part_11;

/**
 * Make a new generic method called sumArray that will return the
 * sum of all numbers in the array (no matter data type of numbers
 * the array has in it)
 */


public class Exercise_04 {

    public static <E extends Number> E sumArray(E[] inputArray){
        E sum = (E)new Double(0);
        for(E elements : inputArray){
            sum = (E)((Double)(sum.doubleValue() + elements.doubleValue()));
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        System.out.println(sumArray(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println(sumArray(doubleArray));
    }



}


