package com.codingnomads.part_08;

class ClassA {


    public static void main(String[] args) {
        ClassB newObjB = new ClassB();
    try {
        newObjB.divide(5,0);
    } catch (ArithmeticException e) {
        System.out.println("you can't divide by zero" + " - outside function");

    }

    }

}

class ClassB {

    public ClassB() {
    }

    int divide(int a, int b) throws ArithmeticException {
        int ans;
        try {
            ans = a / b;
        } catch (ArithmeticException e) {
            System.out.println("you can't divide by zero" + " - inside function");
            throw e;
        }

        return ans;
    }

}
