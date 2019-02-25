package com.codingnomads.part_03;


import java.lang.management.PlatformLoggingMXBean;
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
        int computerHand = (int)Math.random()* (3);

        //call the getHand method for the playerHand
        getHand(playerHand);

        //call the getHand method for the computerHand
        getHand(computerHand);

        //create an String variable "winner" by calling the determineWinner() method with parameters computerHand and playerHand
        String winner = determineWinner(computerHand,playerHand);

        //print out the player hand and computer hand
        System.out.println("player: " + playerHand + "; computer: " + computerHand);

        //print out the winner
        System.out.println(winner);

    }

    // getHand method
    public static String getHand(int hand){

        // create a switch statement to determine each players hand - return the String, ie "scissor" that goes with the int "hand"
        // 0 = scissor, 1 = rock, 2 = paper
        switch(hand){
            case 0:
                return "0 - scissor";

            case 1:
                return "1 - rock";

            default:
                return "2 - paper";
        }

    }

    //determineWinner method returns a String such as "You won!" or "You lost :(" or "You tied!"
    public static String determineWinner(int computer, int player) {

        String status = "Idle";

        // determine if the game is a tie
        if(computer == player){
            status = "You tied!";
        } else {
            // if it is not a tie, use a switch statement and a turnery operator to determine the winner
           switch(computer){
               case 0:
                  status = (player == 1) ? "You win!" : "You lose..";
                  break;

               case 1:
                   status = (player == 1) ? "You win!" : "You lose";
                   break;

               default:
                   status = (player == 1) ? "You lose.." : "You win!";
           }
        }
        return status;

    }
}





