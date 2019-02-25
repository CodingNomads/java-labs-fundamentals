package com.codingnomads.part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 */


class Controller3 {
    public static void main(String[] args) {

        Controller3 c1 = new Controller3();
        FruitTrees apple = new FruitTrees("Apple tree", "apples");

        FruitTrees apple2 = new FruitTrees("Apple tree", 5);
        System.out.println(apple2.age);

        c1.changeAge(apple2);
        System.out.println(apple2.age);

        FruitTrees apple3 = new FruitTrees(5, 77);



    }

    public void changeAge(FruitTrees t){
        t.setAge(23);

    }

}

class FruitTrees {
    String name;
    String nameOfFruits;
    int age;
    int numberOfFruitsPerYear;

    public FruitTrees(String name, String nameOfFruits) {
        this.name = name;
        this.nameOfFruits = nameOfFruits;

        System.out.println("This " + name + " will provide you with " + nameOfFruits);

    }

    public FruitTrees(String name, int age) {
        this.name = name;
        this.age = age;


    }

    public FruitTrees(int age, int numberOfFruitsPerYear) {
        this.age = age;
        this.numberOfFruitsPerYear = numberOfFruitsPerYear;

       // System.out.println("This tree will provide you in its lifetime with: " +  + "fruits.");

    }

    public void setAge(int age) {
        this.age = age;
    }
}