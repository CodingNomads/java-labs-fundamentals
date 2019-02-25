package com.codingnomads.part_04;


import java.util.Stack;

/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
Keep all other members of the Stack class private.
 */


class StackSample{
    public static void main(String[] args) {

        Stack stack = new Stack();

        char ch = 'a';

        for(int i = 0; i < 30; ++i){
            System.out.print(stack.push(ch) + " ");
            ++ch;
        }

        System.out.println();

        for(int i = 0; i < 30; ++i){
            System.out.print(stack.pop() + " ");
        }
    }
}

