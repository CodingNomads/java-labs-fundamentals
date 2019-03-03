package com.codingnomads.part_11;

import java.util.LinkedList;
import java.util.List;

public class MyQueue<E> {

    LinkedList<E> myQueue = new LinkedList<E>();

    //add
    public void add(E input){
        myQueue.add(input);
    }

    //offer
    public void offer(E input){
        myQueue.offer(input);
    }

    //remove
    public void remove(){
        myQueue.remove();
    }

    //poll
    public void poll(){
        myQueue.poll();
    }

    //element
    public void element(){
        myQueue.element();
    }

    //peek
    public void peek(){
        myQueue.peek();
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "myQueue=" + myQueue +
                '}';
    }
}
