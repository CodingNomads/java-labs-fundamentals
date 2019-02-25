package com.codingnomads.part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 */

//Then, from within method_01, pass the instance of Class_02 to a new method, method_02.


class Controller{
    public static void main(String[] args) {

        Controller c1 = new Controller();
        Rivers danube = new Rivers();

        System.out.println(danube.flowSpeed);
        System.out.println(danube.color);

        c1.changeSpeed(danube);

        System.out.println(danube.flowSpeed);
        System.out.println(danube.color);

    }


    public void changeSpeed(Rivers riverVar) {

        riverVar.setFlowSpeed(55);

        changeColor(riverVar);
    }

    public void changeColor(Rivers riverVar){

            riverVar.setColor("greybrown");
        }
    }


class Rivers{
    int howManyLiters;
    String color = "blue";
    int flowSpeed = 60;

    public void setFlowSpeed(int flowSpeed) {
        this.flowSpeed = flowSpeed;
    }

    public void setColor(String color){
        this.color = color;
    }
}