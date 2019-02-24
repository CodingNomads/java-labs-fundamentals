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

    public static int getMaxVal(int[][] ar){
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int t = 0; t < ar[i].length; t++) {

                if (ar[i][t] > max)
                    max = ar[i][t];
            }
        }return max;
    }

// write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array

        public static int getMinVal(int[][] ray){
            int min = 0;
            for (int i = 0; i < ray.length; i++) {
                for (int t = 0; t < ray[i].length; t++) {

                    if (ray[i][t] < min)
                        min = ray[i][t];

                }

            }return min;
        }
    }