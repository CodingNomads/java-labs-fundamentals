package com.codingnomads.part_03;


import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */
//class
public class Exercise_04 {

    //main method
    public static void main(String[] strings) throws java.io.IOException {

        //scanner to enter a number 0-2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");

        //create int variable "playerHand" that takes user input
        int playerHand = input.nextInt();

        //create int variable "computerHand" that generates a random number 0-2
        int computerHand = 1 + (int) (Math.random() * ((2 - 1) + 1));

        //call the getHand method for the playerHand


        //call the getHand method for the computerHand


        //create an String variable "winner" by calling the determineWinner() method with parameters computerHand and playerHand
        String winner = determineWinner(computerHand, playerHand);

        //print out the player hand and computer hand
        System.out.println("The player hand was: " + getHand(playerHand) + " and the computer hand was: "
                + getHand(computerHand));

        //print out the winner
        System.out.println(winner);


    }

    // getHand method
    public static String getHand(int hand){

        String textHand = "";
        // create a switch statement to determine each players hand - return the String, ie "scissor" that goes with the int "hand"
        // 0 = scissor, 1 = rock, 2 = paper
        switch (hand) {
            case 0:
                textHand = "scissor";
                break;
            case 1:
                textHand = "rock";
                break;
            case 2:
                textHand = "paper";
                break;
        }
        //this is a temporary return statement to squash error - you'll need to update
        return textHand;
    }

    //determineWinner method returns a String such as "You won!" or "You lost :(" or "You tied!"
    public static String determineWinner(int computer, int player) {

        // determine if the game is a tie
        String status;
        if (player == computer) {
            return status = "You tied";
        } else {
            return status = ((player + 1) % 3 == computer) ? "Computer Wins! :(" : "You Win!";
        }

        // if it is not a tie, use a switch statement and a turnery operator to determine the winner



    }
}





