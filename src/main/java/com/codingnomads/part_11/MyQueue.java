package com.codingnomads.part_11;

import java.util.NoSuchElementException;

public class MyQueue<E> {
    int size;
    Node current;

    MyQueue(){
        current = new Node();
    }

    public boolean add(E element){

        if(size == 0){
            current.element = element;
            ++size;
            return true;
        }

        Node<E> temp = current;

        while(temp.previous != null){
            temp = temp.previous;
        }

        temp.previous = new Node<E>(element);

        ++size;

        return true;
    }

    public E remove(){
        if(size == 0){
            throw new NoSuchElementException();
        }

        E temp = (E)current.element;

        current = current.previous;

        return temp;
    }

    public E poll(){
        if(size == 0)
            throw new NoSuchElementException();

        E removed = (E)current.element;

        current = current.previous;

        return removed;
    }


    public E element() throws NoSuchElementException{

        if(size == 0){
            throw new NoSuchElementException();
        }

        return peek();
    }


    public E peek(){

        if(size == 0) {
            return null;
        }

        return (E)current.element;
    }

    class Node<E>{
        private E element;
        private Node next;
        private Node previous;

        Node(){}

        Node(E element){
            this.element = element;
        }
    }
}
