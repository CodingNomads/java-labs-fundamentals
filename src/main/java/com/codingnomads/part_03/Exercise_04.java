package com.codingnomads.part_03;


import java.util.Scanner;
import java.util.Random;

/**

 Code a "Rock Paper Scissors" Game

 */
//class
public class Exercise_04 {

    //main method
    public static void main(String[] strings) throws java.io.IOException {

        //scanner to enter a number 0-2

        //create int variable "playerHand" that takes user input

        //create int variable "computerHand" that generates a random number 0-2

        //call the getHand method for the playerHand

        //call the getHand method for the computerHand

        //create an String variable "winner" by calling the determineWinner() method with parameters computerHand and playerHand

        //print out the player hand and computer hand

        //print out the winner

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");

        int playerHand = input.nextInt();

        int computerHand = random.nextInt(3);

        while(playerHand < 0 || playerHand > 2) {
            System.out.println("Wrong Number\nEnter 0 for scissor, 1 for rock, 2 for paper:  ");
            playerHand = input.nextInt();
        }


        String winner = determineWinner(computerHand, playerHand);

        System.out.println("You:" + getHand(playerHand) + "\nComputer:" + getHand(computerHand));
        System.out.println(winner);

    }

    // getHand method
    public static String getHand(int hand){

        // create a switch statement to determine each players hand - return the String, ie "scissor" that goes with the int "hand"
        // 0 = scissor, 1 = rock, 2 = paper
        String result = "";

        switch (hand){
            case 0:
                result = "scissor";
                break;
            case 1:
                result = "rock";
                break;
            case 2:
                result = "paper";
        }

        //this is a temporary return statement to squash error - you'll need to update
        return result;
    }

    //determineWinner method returns a String such as "You won!" or "You lost :(" or "You tied!"
    public static String determineWinner(int computer, int player) {

        String status = "";

        // determine if the game is a tie

        // if it is not a tie, use a switch statement and a turnery operator to determine the winner

        if (computer == player) {
            status = "You tied";
            return status;
        }

        status = player - computer == 1 || player - computer == -2 ? "You won!" : "You lost";

        return status;
    }
}





