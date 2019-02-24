package com.codingnomads.part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class Exercise_02 {
    public static void main(String[] args) {

        int[] numbers = new int[2018];
        int data = 0;

        for (int i = 0; i <= 2017; i++) {
            numbers[i] = data;
            data++;
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
