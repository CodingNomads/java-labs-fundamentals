package com.codingnomads.part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

class NestedClassSample{
    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.add(100,200);
        System.out.println("Number1= " + outer.getNumber1());
        System.out.println("Number2= " + outer.getNumber2());
        System.out.println(outer.getSum());

        outer.multiply(400, 500);
        System.out.println("Number1= " + outer.getNumber1());
        System.out.println("Number2= " + outer.getNumber2());
        System.out.println(outer.getSum());
    }
}

class Outer{
    private int sum;
    private int number1;
    private int number2;
    Inner inner;

    public void add(int number1, int number2){
        inner = new Inner();
        sum = inner.add(this,number1, number2);
    }

    public void multiply(int number1, int number2){
        inner = new Inner();
        sum = inner.multiply(this,number1, number2);
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getSum() {
        return sum;
    }

    class Inner{
        public int add(Outer outer,int number1, int number2){
            setOuterClassNumbers(outer, number1,number2);
            return number1 + number2;
        }

        public int multiply(Outer outer, int number1, int number2){
            setOuterClassNumbers(outer,number1,number2);
            return number1 * number2;
        }

        private void setOuterClassNumbers(Outer outer, int number1, int number2){
            outer.number1 = number1;
            outer.number2 = number2;
        }

    }
}