package com.codingnomads.part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
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
    static int getMaxVal(int[][] someArray) {

        int currentHighestValue = Integer.MIN_VALUE;

        for (int row = 0; row < someArray.length; row++) {
            for (int col = 0; col < someArray[row].length; col++) {
                int value = someArray[row][col];
                if (value > currentHighestValue) {
                    currentHighestValue = value;
                }
            }
        }
        return currentHighestValue;
    }

    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    static int getMinVal(int[][] someArray) {

        int currentMinVal = Integer.MAX_VALUE;

        for (int row = 0; row < someArray.length; row++) {
            for (int col = 0; col < someArray[row].length; col++) {
                int value = someArray[row][col];
                if (value < currentMinVal) {
                    currentMinVal = value;
                }
            }
        }

        return currentMinVal;
    }

}