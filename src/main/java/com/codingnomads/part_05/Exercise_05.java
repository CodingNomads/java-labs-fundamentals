package com.codingnomads.part_05;

/**
 * Write one class. This class must have two methods, a main() + a recursive method. The recursive method must take in
 * an integer as a parameter. The recursive method must then print out "Hello Recursion!" as many times as the "initial"
 * input parameter dictates. For instance if the int passed to the recursive method is 10. The recursive method must print
 * out "Hello Recursion!" 10 times.
 */

/*
class RecursiveTry {

    public static void main(String[] args) {
        recursive(10);
    }

    public static void recursive(numb i) {
        System.out.println("Hello Recursion!");
        if (numb == 1) return 1;
        recursive();
    }
}

public int recursiveMethod(int numb){
   int accumulator = 1;
   if(numb==1)
       // because factorial facot so multiply cannot be 0
       return 1;
   return    accumultor *= recursiveMehotd(numb - 1)*numb;

   said always returns 1 so gos to next in stack
            ich glaub man muss numb ja ändern und darauf ruft die methode sich auf
            und dann gehts weiter  - keine ahnung
        er auch nicht! ;) :P
}
    recursiveMehotd(numb - 1)until this is not resolved the whole line will not be calculated

easier
res = rescurvieMethod(numb-1);
return res * numb;
*/
/* class Exercise 05{
public static void main(String[]args){
    int iter = 10;
    Recursion(iter);

    static void Recursion(int i){}

        if(i ==0){
            return;
        }
        recursion(i-1);
        sout(Hello +i);
        }
        }
        umgekehrt ausdrucken 10 -1*/


 class Factorial{
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    public static int factorial(int val){
        if(val == 0){
            return 1;  //base case
        }

        return factorial(val -1) * val;
    }
}

