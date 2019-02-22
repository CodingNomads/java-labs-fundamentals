package com.codingnomads.part_04;

/**

 Create, populate, and print out a two-dimensional array that will show the following output:

 0 1 2 3 4 5 6 7 8 9
 10 11 12 13 14 15 16 17 18 19
 20 21 22 23 24 25 26 27 28 29
 30 31 32 33 34 35 36 37 38 39
 40 41 42 43 44 45 46 47 48 49

 */

public class Exercise_03 {

    public static void main(String[] strings) {

        int[][] numChart = new int[5][10];

        for(int num = 0; num < 50;){
            for(int i = 0; i < 5; i++){
                for(int x = 0; x < 10; x++){
                    numChart[i][x] = num;
                    num++;
                    }
            }
        }


        for (int[] arr : numChart) {
            for (int v : arr) {
                System.out.print(" " + v);
            }
            System.out.println();
        }
    }
}