package com.codingnomads.part_05;
import java.util.List;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */


public class Exercise_09{

    static String varargsEx(String ... s){
        StringBuilder sentences = new StringBuilder();
        for(String arg : s){
            sentences.append(arg);
        }

//        System.out.println(List.from(s));
        return sentences.toString();


//        for(int i = 0; i< s.length; i++) {
//            System.out.println(s[i]);
//        }
    }

    public static void main(String args[]){
        System.out.println(varargsEx("I am a sentence.","I am another sentence", "I also am a sentence."));

    }




}



