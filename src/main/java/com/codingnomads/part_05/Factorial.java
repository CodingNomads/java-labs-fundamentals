package com.codingnomads.part_05;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int i){
        if(i == 0) return 1;

        return factorial(i - 1) * i;

    }
}
