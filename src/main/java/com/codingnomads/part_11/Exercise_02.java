package com.codingnomads.part_11;

/**
 * Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Integer[] exchangeMe = {10,20,30,40};

        HolderOfMethod swapper = new HolderOfMethod();
        Integer[] arr = (Integer[]) swapper.exchangePositions(exchangeMe,0,1);

        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}

class HolderOfMethod<T> {
    public <T> T[] exchangePositions (T[] arrToSwap,Integer firstElementIndex, Integer secondElementIndex) {

        T temp = arrToSwap[firstElementIndex];
        arrToSwap[firstElementIndex] = arrToSwap[secondElementIndex];
        arrToSwap[secondElementIndex] = temp;

        return arrToSwap;
    }
}

