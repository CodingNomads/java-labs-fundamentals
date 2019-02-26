package com.codingnomads.part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 */

class Exercise_02 {
    public static void main(String[] args) {

        Food nasiGoreng = new Food();

        foodReviewer(nasiGoreng);



    }

    public static void foodReviewer(Food dish) {

        System.out.println("I am the regular one..");

        dish.setCost(100);
        dish.setVegan(false);
        dish.setYummy(true);

        System.out.println(dish.toString());

        pickyFoodReviewer(dish);



    }

    public static void pickyFoodReviewer(Food dish) {

        System.out.println("I am the picky one...");

        dish.setCost(123);
        dish.setVegan(true);
        dish.setYummy(false);

        System.out.println(dish.toString());


    }


}

class Food {

    private boolean isYummy;
    private double cost;
    private boolean isVegan;

    public void setYummy(boolean yummy) {
        isYummy = yummy;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    @Override
    public String toString() {
        return "Food{" +
                "isYummy=" + isYummy +
                ", cost=" + cost +
                ", isVegan=" + isVegan +
                '}';
    }
}