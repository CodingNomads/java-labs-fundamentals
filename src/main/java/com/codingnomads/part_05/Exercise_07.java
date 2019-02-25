package com.codingnomads.part_05;

import java.util.Random;


class Constructor {

    /**
     * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
     * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
     * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
     * variable and the static variable for each class.
     */

    public static void main(String[] args) {

        Random random = new Random();

        Enemy enemy;

        int enemyId;

        for (int i = 0; i < 100 ; i++) {
            int shoot = random.nextInt(2);

            enemy = new Enemy(i);

            enemy.openFire(shoot, i);
        }

        System.out.println("Total Enemy Created = " + Enemy.getTotalNumber());
        System.out.println("Total Enemy Killed = " + Enemy.getNumberOfEnemyKilled());
        System.out.println("Total Enemy Score = " + Enemy.getEnemyScore());
    }

}

class Enemy{
    private static int enemyScore;
    private static int numberOfEnemyKilled;
    private static int totalNumber;
    private int enemyID;

    public Enemy(int enemyID){
        this.enemyID = enemyID;
        ++totalNumber;
    }

    public void openFire(int shoot, int id){

        if(shoot == 0){
            ++numberOfEnemyKilled;
            System.out.println("Enemy " + id + " shot you!");
            return;
        }
        else if(shoot == 1){
            ++enemyScore;
            System.out.println("You killed enemy " + id);
            return;
        }
    }

    public static int getEnemyScore() {
        return enemyScore;
    }

    public static int getNumberOfEnemyKilled() {
        return numberOfEnemyKilled;
    }

    public static int getTotalNumber() {
        return totalNumber;
    }

    public int getEnemyID() {
        return enemyID;
    }

    public void setEnemyID(int enemyID) {
        this.enemyID = enemyID;
    }


}

