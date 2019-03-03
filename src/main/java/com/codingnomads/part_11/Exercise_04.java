package com.codingnomads.part_11;

/**
 * Make a new generic method called sumArray that will return the
 * sum of all numbers in the array (no matter data type of numbers
 * the array has in it)
 */


public class Exercise_04 {

    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12};
        Double[] doubleArray = new Double[]{1.0, 2.1, 3.2, 4.3, 5.4, 6.5, 7.6, 8.7, 9.8, 10.9, 11.91, 12.92};
        Float[] floatArray = new Float[]{1.2f, 2.3f, 3.4f, 4.5f, 5.6f, 6.7f, 7.8f, 9.8f, 10f, 11f, 12f};

        SumArray<Number> sumArray = new SumArray<>();

        System.out.println(sumArray.sumArray(intArray));
        System.out.println(sumArray.sumArray(doubleArray));
        System.out.println(sumArray.sumArray(floatArray));

    }

}

class SumArray<T extends Number> {

    public T sumArray(T[] inputArray) {
        Double sum = 0.0;
        for (int i = 1; i < inputArray.length; i++) {
            sum += inputArray[i].doubleValue();

        }
        return (T)sum;
    }



}


