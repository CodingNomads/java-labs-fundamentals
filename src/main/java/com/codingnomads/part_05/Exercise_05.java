package com.codingnomads.part_05;

/**
 * Write one class. This class must have two methods, a main() + a recursive method. The recursive method must take in
 * an integer as a parameter. The recursive method must then print out "Hello Recursion!" as many times as the "initial"
 * input parameter dictates. For instance if the int passed to the recursive method is 10. The recursive method must print
 * out "Hello Recursion!" 10 times.
 */

class Exercise_05 {
    public static void main(String[] args) {
        int iter = 10;
        Recursion(iter);

    }

    static void Recursion(int i) {

        if (i == 0) {
            return;
        }

        Recursion(i - 1);
        System.out.println("Hello Recursion " + i);
    }
}
