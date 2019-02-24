package com.codingnomads.part_04;


/**
 The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
the method that access the stack push() and pop(). Allow the user to specify the top of the stack when it is created.
Keep all other members of the Stack class private.
 */

class Exercise_07{
    public static void main(String[] args) {

        Stack stack = new Stack(3);
        stack.push('c');
        stack.push('a');
        stack.push('x');
        stack.pop();

        stack.show();

    }

    static class Stack {

        private char[] stack;
        private int top = 0;

        public Stack(int size) {
            stack = new char[size];
        }

        public void push(char element) {
            stack[top] = element;
            top++;
        }

        public void pop() {
            top--;
        }

        public void show() {
            if (top == 0) {
                throw new NullPointerException("No Element to show");
            }
            for (int i = 0; i < top; i++) {
                System.out.println(stack[i]);
            }
        }
    }
}
