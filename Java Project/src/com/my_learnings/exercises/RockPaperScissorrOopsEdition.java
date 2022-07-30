package com.my_learnings.exercises;

import java.util.Scanner;

import java.util.Random;

class RockPaperScissorrs {
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    
    private int chances, userPoints, compPoints;
    private String userChoice, compChoice;
    private String [] rockPaperScissor = {"Rock","Paper", "Scissor"};

    public void startGame(){
        System.out.print("Enter the number of times you want to play the game: ");
        chances = sc.nextInt();
        for (int i = 1; i <= chances; i++){
            System.out.print("Enter R for Rock, P for Paper, S for Scissor: ");
            userChoice = sc.next().toLowerCase();

            switch (userChoice) {
                case "r":
                    userChoice = "Rock";
                    break;
                case "p":
                    userChoice = "Paper";
                    break;
                case "s":
                    userChoice = "Scissor";
                    break;
            
                default:
                System.out.println("You didn't enter R, P or S!");
                    break;
            }
            compChoice = rockPaperScissor[ran.nextInt(3)];

            if ((userChoice == "Rock" && compChoice == "Scissor") || (userChoice == "Paper" && compChoice == "Rock") || (userChoice == "Scissor" && compChoice == "Paper")){
                System.out.printf("You chose: %s\nComputer chose: %s\nYou won 1 point\n", userChoice, compChoice);
                userPoints += 1;
            }
            else if (userChoice == compChoice){
                System.out.println("It was a tie");
            }

            else {
                System.out.printf("You chose: %s\nComputer chose: %s\nComputer won 1 point\n", userChoice, compChoice);
                compPoints += 1;
            }
        }
        if (userPoints < compPoints){
            System.out.printf("Your points: %d\nComputer's Point: %d\nComputer Won!\n", userPoints, compPoints);
        }

        else if (userPoints == compPoints){
            System.out.println("It was a tie!");
        }
        else {
            System.out.printf("Your points: %d\nComputer's Point: %d\nYou Won!\n", userPoints, compPoints);
        }
    }

}

public class RockPaperScissorrOopsEdition{
    public static void main(String[] args) {
        RockPaperScissorrs game = new RockPaperScissorrs();
        try {
            game.startGame();
        } catch (Exception e){
            System.out.println("Invalid Input!");
        }
    }
}