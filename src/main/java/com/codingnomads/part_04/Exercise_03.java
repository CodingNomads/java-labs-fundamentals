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

        int[][] twoDimensions = new int[9][4];

        for (int i = 0; i < twoDimensions.length; i++) {
            for (int t = 0; t < twoDimensions.length; t++) {
                twoDimensions[i][t] = i + t +i*10;

              /* if(i == 1) twoDimensions[i][t] = i + t +10; // = +i*10
                if(i == 2) twoDimensions[i][t] = i + t + 20;
                if(i == 3)twoDimensions[i][t] = i + t +30;
                if(i == 4)twoDimensions[i][t] = i + t +40; */

            }
        }
        for (int i = 0; i < twoDimensions.length; i++) {
            for (int t = 0; t < twoDimensions.length; t++) {

                System.out.println(twoDimensions[i][t]);
        }
            System.out.println();

        }
}
}
