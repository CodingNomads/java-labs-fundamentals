package com.codingnomads.part_11;


/**
 * Make a new generic method called sumArray that will return the
 * sum of all numbers in the array (no matter data type of numbers
 * the array has in it)
 */


public class Exercise_04 {
    public static void main(String[] args) {
        Integer[] someArray = {10,20,30,40};

        AnotherHolder<Integer> sumIt = new AnotherHolder<>();
        System.out.println(sumIt.sumArray(someArray));
    }

}

class AnotherHolder<T extends Number> {

    public T sumArray(T [] arr) {
        Double result = 0.0;
        for (Number element : arr) {
            result+= element.doubleValue();
        }
        return (T)result;
    }

}


