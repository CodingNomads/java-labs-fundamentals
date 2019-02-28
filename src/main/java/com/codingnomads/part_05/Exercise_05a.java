package com.codingnomads.part_05;

public class Exercise_05a {

    public static void main(String[] args) {
        System.out.println(factorial(4));

    }

    static int factorial(int i) {
        if (i == 1) {
            return 1;
        }
        int sum = factorial(i - 1) * i;
        return sum;
    }
}
