package com.codingnomads.part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */

class BaseballTeams {

    private String league;
    private char division;
    static int numOfPlayers;

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public static int getNumOfPlayers() {
        return numOfPlayers;
    }

    public static void setNumOfPlayers(int numOfPlayers) {
        BaseballTeams.numOfPlayers = numOfPlayers;
    }
}


class TeamConstructor {

    public static void main(String[] args) {

        // Creating instances of Baseball Teams.

        BaseballTeams blueJays = new BaseballTeams();
        BaseballTeams indians = new BaseballTeams();
        BaseballTeams reds = new BaseballTeams();
        BaseballTeams rockies = new BaseballTeams();

        // Using setter methods to set division and league for Baseball teams (objects) created earlier)
        blueJays.setDivision('E');
        blueJays.setLeague("AL");

        indians.setLeague("AL");
        indians.setDivision('C');

        reds.setLeague("NL");
        reds.setDivision('C');

        rockies.setLeague("NL");
        rockies.setDivision('W');

        BaseballTeams.numOfPlayers=32; // Setting the static instance variable

        System.out.println("The Blue Jays have" + " " + BaseballTeams.numOfPlayers + " " + "players");
        System.out.println("The Blue Jays are in the" + " " + blueJays.getLeague());


    }

}