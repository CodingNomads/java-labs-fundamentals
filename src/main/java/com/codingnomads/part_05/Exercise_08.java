package com.codingnomads.part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

class OuterClass {

    int x = 0; // initialising instance variable and setting to 0.

    void setInnerObj() {
        InnerClass innerObj = new InnerClass();
        innerObj.setOuterClassInstanceVariable(1337);
    }

    int addInnerObj(int add1, int add2) {
        InnerClass innerObj = new InnerClass(); // Each method in the outerclass needs create an object of type inner class in order to be able to access the methods in the inner class. Because of the scope of the inner class is not known to the outer but the reverse is true because the inner is a member of the outer.
        int x = innerObj.add1(add1);
        int y = innerObj.add2(add2);
        int sum = x + y;
        return sum;
    }

    class InnerClass {

        // method to set outer class instance variable
        int setOuterClassInstanceVariable(int input) {
            x = input;
            System.out.println(x);
            return x;
        }

        int add1(int add1){
            return add1;
        }

        int add2(int add2){
            return add2;
        }

    }
}

class ControllerNestedClassDemo {

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.setInnerObj();

        OuterClass outerObj2 = new OuterClass();
        System.out.println(outerObj.addInnerObj(5,10));
    }
}


