package com.codingnomads.part_06;

public class Exercise_06 {

    void methodOne(){
        System.out.println("This is method One inside Exercise 6.");
    }

}

class B extends Exercise_06{

    void methodOne(){
        System.out.println("Inside class B's method one. ");
    }
}

class C extends Exercise_06{

    void methodOne(){
        System.out.println("Inside class C's method one.");
    }
}

class Controller{

    public static void main(String[] args) {
        Exercise_06 a = new Exercise_06();
        a.methodOne();

        B b = new B();
        b.methodOne();

        C c = new C();
        c.methodOne();
    }
}