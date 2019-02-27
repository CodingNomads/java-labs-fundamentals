package com.codingnomads.part_04;
import java.math.*;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int max;
        int min;

        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready
        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array

    static int getMaxVal(int[][] dataArray) {
        int max = 0;
        for (int[] a : dataArray) {
            for (int i : a) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    static int getMinVal(int[][] dataArray) {
        int min = 0;
        for (int[] a : dataArray) {
            for (int i : a) {
                if (i < min) {
                    min = i;
                }
            }
        }
        return min;
    }

}