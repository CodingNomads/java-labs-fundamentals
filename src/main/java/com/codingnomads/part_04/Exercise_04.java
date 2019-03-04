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
    public static int getMaxVal(int[][] testArray){

        int col;
        int row;
        int maximumValue = testArray[0][0];

        for(col = 0; col < testArray.length; col++){
            for(row = 0; row < testArray[col].length; row++){
                if(testArray[col][row] > maximumValue){
                    maximumValue = testArray[col][row] ;
                }
            }
        }
        return maximumValue;
    }
    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
    public static int getMinVal(int[][] testArray){

        int col;
        int row;
        int minimumValue = testArray[0][0];

        for(col = 0; col < testArray.length; col++){
            for(row = 0; row < testArray[col].length; row++){
                if(testArray[col][row] < minimumValue){
                    minimumValue = testArray[col][row] ;
                }
            }
        }
        return minimumValue;
    }

}