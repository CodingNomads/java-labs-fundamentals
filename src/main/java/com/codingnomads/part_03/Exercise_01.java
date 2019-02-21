package com.codingnomads.part_03;

/**
 * Write 3 classes. These classes can reside in the same file for ease and clarity.
 * The first class (the controller) should have at least two methods, one of which being a main method.
 * The main method needs to utilize constructors to create at least two separate objects. Each class must
 * have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
 * objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
 * Vehicle object in this exercise :)
 * <p>
 * Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
 * sports teams, trees, beers, people and so on.
 **/

/*  the controller) should have at least two methods, one of which being a main method.
    forgot - missing - cant think of any at the moment  age * growSpeed per year for example - age needed*/


class Controller {

    public static void main(String[] args) {

        Trees palm = new Trees("Holly palms", "green", 20, 8, 3, "brown", false);


        Flowers sunflower = new Flowers("Sunnflowers", "green", 15, 4, "yellow", 23, 30);


    }
}

 class Plants {

    String familyType;
    String leafColor;
    int leafLength;
    int growSpeed;

    Plants(String familyType, String leafColor, int leafLength, int growSpeed) {
        this.familyType = familyType;
        this.leafColor = leafColor;
        this.growSpeed = growSpeed;
        this.leafLength = leafLength;
    }
}

class Trees extends Plants {

    double trunkHeight;
    String trunkColor;
    boolean fruits;

    Trees(String familyType, String leafColor, int leafLength, int growSpeed, double trunkHeight, String trunkColor, boolean fruits) {
        super(familyType, leafColor, leafLength, growSpeed);
        this.trunkHeight = trunkHeight;
        this.trunkColor = trunkColor;
        this.fruits = fruits;

        System.out.println(familyType + " have " + leafLength + " cm long and " + leafColor + " leafs." + "They grow " + growSpeed + " cm a year.");
        System.out.println("Their trunks are " + trunkHeight + " meters high and of " + trunkColor + " color.");
        if (fruits) {
            System.out.println("They also have edible fruits.");
        } else {
            System.out.println("They do not have edible fruits.");
        }
        //override growSpeed f.e.
    }
}

class Flowers extends Plants {

    String flowerColor;
    int numberOfFlowerLeafs;
    int flowerDiameter;

    Flowers(String familyType, String leafColor, int leafLength, int growSpeed, String flowerColor, int numberOfFlowerLeafs, int flowerDiameter) {
        super(familyType, leafColor, leafLength, growSpeed);
        this.flowerColor = flowerColor;
        this.numberOfFlowerLeafs = numberOfFlowerLeafs;
        this.flowerDiameter = flowerDiameter;

        System.out.println();
        System.out.println(familyType + " have " + leafLength + " cm long and " + leafColor + " leafs." + "They grow " + growSpeed + " cm a year.");
        System.out.println("Their flowers are of " + flowerColor + " colour and have " + numberOfFlowerLeafs + " flower leafs.\nTheir flower has a diameter of " + flowerDiameter + " cm.");
    }
}