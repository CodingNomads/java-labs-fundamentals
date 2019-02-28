package com.codingnomads.part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class Controller {
    public static void main(String[] args) {

        // Initialising Poker Variant Texas Hold'em

        PokerGames texasHoldem = new PokerGames();
        texasHoldem.setName("Texas Holdem"); // Setting game name
        texasHoldem.setGameType("Community card"); //Setting game type

        GameAttributes texasHoldemAttributes = new GameAttributes(); //Setting texas holdem game attributes
        texasHoldemAttributes.setNumberOfPlayers(10);
        texasHoldemAttributes.setNumberOfDecks(1);
        texasHoldemAttributes.setHiLo("Hi");

        System.out.println(texasHoldem.toString());
        System.out.println();
        System.out.println(texasHoldemAttributes.toString());
    }
}

class PokerGames {

    private String name;
    private String gameType;

    @Override
    public String toString() {
        return "Poker Game Name: " + name + '\n' + "Game Type: " + gameType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}

class GameAttributes {

    private int numberOfPlayers;
    private int numberOfDecks;
    private String hiLo;

    @Override
    public String toString() {
        return "Game Attributes" + "\n" + "Number of Players: " + numberOfPlayers + "\n" + "Number of Decks: " + numberOfDecks + "\n" + "Hand Ranking: " + hiLo;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    public void setHiLo(String hiLo) {
        this.hiLo = hiLo;
    }
}