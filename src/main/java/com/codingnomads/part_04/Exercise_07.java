package com.codingnomads.part_04;


import java.util.Arrays;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */

public class Exercise_07{
    public static void main(String[] args) {
        Stack abcStack = new Stack();

        abcStack.setSize(10);
        abcStack.push('a');
        abcStack.push('b');
        abcStack.push('c');

        abcStack.pop();
        abcStack.show();

    }
}

class Stack{

    private char[] myStack = new char[10];
    private int size = 0;

    //define size method when created
    public void setSize(int num){
        num = size;
    }

    //push method
    public void push(char input){
        myStack[size] = input;
        size ++;
    }

    //pop method
    public void pop(){
        size --;
    }



    //show Stack
    public void show(){
        for(int i = 0; i < size; i++){
            System.out.println(myStack[i]);
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "myStack=" + Arrays.toString(myStack) +
                ", size=" + size +
                '}';
    }
}