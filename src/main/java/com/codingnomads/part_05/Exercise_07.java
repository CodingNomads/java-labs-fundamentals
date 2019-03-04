package com.codingnomads.part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */

class Shirt {
    public static void main(String[] args) {
        Clothes shirts = new Clothes();
        shirts.setColor("blue");
        shirts.setTotalNum(2);
        System.out.println(shirts);

        Clothes dresses = new Clothes();
        dresses.setColor("red");
        dresses.setTotalNum(1);
        System.out.println(dresses);

        Clothes jackets = new Clothes();
        jackets.setColor("black");
        jackets.setTotalNum(1);
        System.out.println(jackets);

        Clothes.isHasSleeves();
        Clothes.setHasSleeves(false);
    }

}

class Clothes{

    private int totalNum;
    private static boolean hasSleeves;
    private String color;

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public static boolean isHasSleeves() {
        return hasSleeves;
    }

    public static void setHasSleeves(boolean hasSleeves) {
        Clothes.hasSleeves = hasSleeves;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "totalNum=" + totalNum +
                ", color='" + color + '\'' +
                '}';
    }
}