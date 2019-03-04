package com.codingnomads.part_11;

/**
 * Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {
    public static void main(String[] args) {

        Object [] array = {3, 3, 3, 5.4, 5.4, "String"};

        array = exchange(array);

        for (Object object : array) {
            System.out.print(object + " ");
        }
    }

    public static <T> T[] exchange(T[] array){

        for (int i = 0; i < array.length -1 ; i++) {
            if(!array[i].equals(array[i + 1])) {
                Object temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = (T)temp;
            }
        }

        return array;
    }
}



