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

        System.out.println(getMaxVal(dataArray));
        System.out.println(getMinVal(dataArray));
    }

    public static int getMaxVal(int [][] array){
        int max = array[0][0];

        for(int [] arr : array) {
            for (int val : arr)
                if (val > max)
                    max = val;
        }

        return max;
    }

    public static int getMinVal(int [][] array){
        int min = array[0][0];

        for(int [] arr : array) {
            for (int val : arr)
                if (val < min)
                    min = val;
        }

        return min;
    }



}