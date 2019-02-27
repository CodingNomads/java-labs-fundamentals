package com.codingnomads.part_08;
import java.util.Stack;
import java.util.Arrays;

//Complete question 10 in the self-test for chapter 9.

//The complement of a queue is a stack. It uses first-in, last-out accessing and is often likened to a stack of plates.
//The first plate put on the table is the last plate used. Create a stack
//class called Stack that can hold characters.
// Call the methods that access the stack push( ) and pop( ).
// Allow the user to specify the size of the stack when it is created. Keep all other members of the Stack class private.
//Add custom exceptions to your class that report stack full and stack empty conditions.

//In question 3 of the Chapter 6 Self Test, you created a Stack class.
//Add custom exceptions to your class that report stack full and stack empty conditions.

public class Exercise_02_answer {

    public static void main(String[] args) {
        MyStack numberStack = new MyStack();
        int capacity = 5;
        int size = 0;

        numberStack.setCapacity(capacity);
        numberStack.setSize(size);

        for(int i = 0; i <= size; i++){
            try{
                System.out.println(numberStack);
                if(size == 0)
                    throw new EmptyStackException("Stack is empty!");
            } catch (EmptyStackException ex){
                System.out.println(ex.toString());
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array out of bounds!");
            }
        }



        System.out.println(numberStack);


        for(int i = 1; i < 11; i++){
            try{
                numberStack.push(i);
                System.out.println(size);
                if(i > capacity)
                    throw new FullStackException("stack is full.");
            } catch (FullStackException e){
                System.out.println(e.toString());
            }

        }


        System.out.println(numberStack);
    }

}


class EmptyStackException extends Exception{

    public EmptyStackException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "MyStack is empty";
    }
}

class FullStackException extends Exception{

    public FullStackException(String message){
        super(message);
    }

    @Override
    public String toString(){
        return "MyStack is full";
    }

}

class MyStack{

        private int capacity;
        private int[] myStack = new int[capacity];
        private int size = 0;

        //define size method when created
        public void setSize(int num){
            num = size;
        }

        //define capacity
        public void setCapacity(int num){
            num = capacity;
        }

        //push method
        public void push(int input){
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
        return "MyStack{" +
                "myStack=" + Arrays.toString(myStack) +
                ", size=" + size +
                '}';
    }
}