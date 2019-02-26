package com.codingnomads.part_06;

public class Person {

   private String name;
   private int age;
   private String sex;

   // creating person constructors
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }


    // creating setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

class Controller {
    public static void main(String[] args) {

    }
}





