package com.codingnomads.part_06;

public class Teacher extends Person {

    // Setting private instance variables for teacher class
    private String subjectTaught;
    private int yearsExperience;
    private int salary;

    // creating Teacher constructor with call to super.


    public Teacher(String name, int age, String sex, String subjectTaught, int yearsExperience, int salary) {
        super(name, age, sex);
        this.subjectTaught = subjectTaught;
        this.yearsExperience = yearsExperience;
        this.salary = salary;
    }

    // creating object of type teacher.

    Teacher teacher = new Teacher("Aimee Bradshaw",29,"Female","Kindergarten",5,30000);

}
