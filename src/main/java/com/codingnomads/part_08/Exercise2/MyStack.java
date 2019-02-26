package com.codingnomads.part_08.Exercise2;

import java.util.Arrays;

public class MyStack<E> {

    private Object[] stack;
    private int top = 0;

    public MyStack() {
        this.stack = new Object[5];
    }

    public void push(E element) {
        if (top == stack.length) {
            increaseSizeOfArray();
        }
        stack[top] = element;
        top++;
    }

    public void pop() {
        try {
            stack[top] = null;
            top--;
        } catch (ArrayIndexOutOfBoundsException exc) {
            throw new StackIsEmptyException("Stack is empty",exc);
        }
    }

    public void show() {
        try {
            for (int i = 0; i < top; i++) {
                System.out.println(stack[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            throw new StackIsEmptyException("Stack is empty",exc);
        }

    }

    public Object peek() {
        try {
            return stack[top - 1];
        } catch (ArrayIndexOutOfBoundsException exc) {
            throw new StackIsEmptyException("Stack is empty", exc);
        }
    }

    private void increaseSizeOfArray() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

}
