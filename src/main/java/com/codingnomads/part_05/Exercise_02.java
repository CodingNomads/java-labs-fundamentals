package com.codingnomads.part_05;


/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 */


class Exercise_02{
    public static void main(String[] args) {

        Names names = new Names(4);

        names.addName("Roi");
        names.addName("Cristian");
        names.addName("Jordan");
        names.addName("Seleni");

        for (int i = 0; i < names.getLength() ; i++) {
            System.out.print(names.getName(i) + " ");
        }

        System.out.println("\n============================\n");


        names.setLength(6);


        names.setNames("Sabine", 3);
        names.addName("Eileen");
        names.addName("Alp");


        for (int i = 0; i < names.getLength() ; i++) {
            System.out.print(names.getName(i) + " ");
        }
    }
}


class Names{
    private String [] names;
    private int length;
    private int index;

    Names(int length){
        this.length = length;
        names = new String[length];
    }

    public void addName(String name){
        names[index++] = name;
    }

    public void setNames(String name, int index){
        if(index >= length){
            System.out.println("Invalid index");
            return;
        }

        names[index] = name;
    }

    public String getName(int index){
        if(index > length){
            System.out.println("Invalid index");
            return "";
        }

        return names[index];
    }

    public void setLength(int length){

        String [] tempArray = new String[length];

        this.length = length;

        for (int i = 0; i < names.length ; i++) {
            tempArray[i] = names[i];
        }

        names = tempArray;
    }

    public String[] getNames() {
        return names;
    }

    public int getLength() {
        return length;
    }

    public int getIndex() {
        return index;
    }
}