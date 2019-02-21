package com.codingnomads.part_03;

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

public class Exercise_01 {

    public static void main(String[] args) {

        FootballLeagues EPL = new FootballLeagues("English Premier League","England & Wales", 20);
        FootballLeagues SPL = new FootballLeagues("Scottish Premier League", "Scotland", 12);

    }
}

class FootballLeagues {

    private String leagueName;
    private String leagueLocation;
    private int numberOfTeams;

    FootballLeagues(String leagueName, String leagueLocation, int numberOfTeams){

    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueLocation() {
        return leagueLocation;
    }

    public void setLeagueLocation(String leagueLocation) {
        this.leagueLocation = leagueLocation;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }
}

class FootballTeams {

    private String TeamName;
    private String TeamLocation;
    private int positionLastSeason;

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public String getTeamLocation() {
        return TeamLocation;
    }

    public void setTeamLocation(String teamLocation) {
        TeamLocation = teamLocation;
    }

    public int getPositionLastSeason() {
        return positionLastSeason;
    }

    public void setPositionLastSeason(int positionLastSeason) {
        this.positionLastSeason = positionLastSeason;
    }
}