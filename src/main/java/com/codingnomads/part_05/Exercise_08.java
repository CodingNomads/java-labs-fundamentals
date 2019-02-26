package com.codingnomads.part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

public class Exercise_08 {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class NestedClass {

        public void setVars() {

            setName("Cristian");
            setAge(29);

        }

        public int addTheseTwo(int n1, int n2) {

            return n1 + n2;

        }

        public int multiplyTheseTwo(int n1, int n2) {

            return n1 * n2;

        }

        private final int result = addTheseTwo(1, 2) + multiplyTheseTwo(1, 2);


    }
}
