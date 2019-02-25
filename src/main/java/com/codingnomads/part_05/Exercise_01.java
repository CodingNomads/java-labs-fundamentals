package com.codingnomads.part_05;

import java.util.Date;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */
class Exercise_01{
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Alp DURMAZ");
        student1.setAge(31);
        student1.setGender("Male");
        student1.setDeparmentId(1102);
        student1.setDepartment("Java");
        student1.setStudentId(9978);

        System.out.println(student1.toString());

    }
}

class Student extends Member{
    private int studentId;
    private int departmentID;
    private String department;



    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getDeparmentId() {
        return departmentID;
    }

    public void setDeparmentId(int deparmentId) {
        this.departmentID = deparmentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" + "Name= " + getName() + " Age= " + getAge() + " Gender= " + getGender() +
                " studentId= " + studentId +
                ", deparmentId= " + departmentID +
                ", department= '" + department + '\'' +
                '}';
    }
}

class Member {
    private String name;
    private String gender;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
