package com.codingnomads.part_06;

import java.util.concurrent.ScheduledExecutorService;

public class Student extends Person {
    // Setting up private instance variables for subclass
    private int studentID;
    private int gpa;
    private String universityAttended;


    // creating constructor for student
    public Student(String name, int age, String sex, int studentID, int gpa, String universityAttended) {
        super(name, age, sex);
        this.studentID = studentID;
        this.gpa = gpa;
        this.universityAttended = universityAttended;
    }

    // using setters in superclass to set private instance variables.



    // creating object of type student
    Student student = new Student("Jordan Shenolikar", 32, "Male", 10001, 3, "CodingNomads");


}



