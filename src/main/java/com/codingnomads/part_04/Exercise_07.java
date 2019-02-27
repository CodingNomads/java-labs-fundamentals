package com.codingnomads.part_04;

/**
 * The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
 * The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
 * the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
 * Keep all other members of the Stack class private.
 */


class Stack {

    private int maxSize;
    private char[] stackArray;
    private int top;


    public Stack(int a) {
        maxSize = a;
        stackArray = new char[maxSize];

    }

    public void stackPush(char a) {
        stackArray[top++] = a;
    }

    public char stackPop() {
        return stackArray[--top];
    }

    public static void main(String[] args) {

        Stack myStack = new Stack(5);

        myStack.stackPush('a');
        myStack.stackPush('b');
        myStack.stackPush('c');
        myStack.stackPush('d');
        myStack.stackPush('e');

        for (int i = 0; i < myStack.maxSize; i++) {
            System.out.println(myStack.stackArray[i]);
        }

        System.out.println();
        
        myStack.stackPop();
        myStack.stackPop();
        myStack.stackPop();

        for (int i = 0; i < 2; i++) {
            System.out.println(myStack.stackArray[i]);
        }

    }
}
