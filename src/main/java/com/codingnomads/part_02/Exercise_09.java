package com.codingnomads.part_02;


import java.util.ArrayList;

/**
 * Part 2 Exercise 9:
 * <p>
 * Use a do-while loop to print out the letters of the alphabet in reverse order.
 * Tip: Use a variable of char type.
 */
public class Exercise_09 {
    public static void main(String[] args) {

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int i = alphabet.length - 1;

        do {
            System.out.print(alphabet[i] + " ");
            i--;
        } while (i != 0);

        System.out.print(alphabet[0]);

    }

}


