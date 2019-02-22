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

        int [] [] multiDim = new int [5][10];
        int count = 0;

        for(int i = 0; i < multiDim.length; ++i) {
            for (int k = 0; k < multiDim[i].length; ++k)
                multiDim[i][k] = count++;
        }

        for(int [] array : multiDim) {
            for (int val : array)
                System.out.print(val + " ");

            System.out.println();
        }
    }
}