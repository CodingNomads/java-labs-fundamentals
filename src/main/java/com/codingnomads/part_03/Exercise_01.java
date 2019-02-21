package com.codingnomads.part_03;

import com.sun.management.GarbageCollectorMXBean;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/

class Controller{
    public static void main(String[] args) {

        Weather weather1 = new Weather(28, "Centigrade", "Rain");
        System.out.println(weather1.toString());

        Weather weather2 = new Weather(32, "Fahrenheit","Snow", 15, "Mph");
        System.out.println(weather2.toString());

        Dog dog =new Dog("Pancar", "Shih Tzu", 2);
        System.out.println(dog.toString());
    }
}

class Dog{
    public String name;
    public String breed;
    public int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}

class Weather{
    private float degree;
    private String scale;
    private String condition;
    private float wind;
    private String windScale;

    public Weather(float degree, String scale, String condition){
        this.degree = degree;
        this.scale = scale;
        this.condition = condition;
    }

    public Weather(float degree, String scale, String condition, float wind, String windScale){
        this.degree = degree;
        this.scale = scale;
        this.condition = condition;
        this.wind = wind;
        this.windScale = windScale;
    }

    public void setDegree(float degree) {
        this.degree = degree;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setWind(float wind) {
        this.wind = wind;
    }

    public void setWindScale(String windScale) {
        this.windScale = windScale;
    }

    public float getDegree() {
        return degree;
    }

    public String getScale() {
        return scale;
    }

    public String getCondition() {
        return condition;
    }

    public float getWind() {
        return wind;
    }

    public String getWindScale() {
        return windScale;
    }

    @Override
    public String toString() {
        return "Weather" +
                "degree =" + degree +
                ", scale ='" + scale + '\'' +
                ", condition ='" + condition + '\'' +
                ", wind =" + wind +
                ", windScale ='" + windScale + '\''
                ;
    }
}



