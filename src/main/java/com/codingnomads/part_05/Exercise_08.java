package com.codingnomads.part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

class OuterClass{
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int printOutput(){
        InnerClass output = new InnerClass();
        x = 20;
        y = 50;
        int result = output.addition();
        return result;
    }

    @Override
    public String toString() {
        return "OuterClass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //innerClass
    class InnerClass{

        int setX(int x){
            return x;
        }

        int setY(int y){
            return y;
        }

        int addition(){
          return x + y;
        }

    }
}

class Controller{

    public static void main(String[] args) {
        OuterClass example = new OuterClass();
        example.setX(2);
        example.setY(4);
        System.out.println(example);

        System.out.println();
        System.out.println(example.printOutput());


    }

}