package com.my_learnings.exercises;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        
        try {

            Scanner sc = new Scanner(System.in);
            Random ran = new Random();
    
            String [] rockPaperScissorArray = {"Rock", "Paper", "Scissor"};
            int randNumber, userPoints = 0, compPoints = 0;
            String userChoice, compChoice;
    
            randNumber = ran.nextInt(3);
            compChoice = rockPaperScissorArray[randNumber];
    
            System.out.println("Enter the number of times you want to play the game: ");
            
            for (int i = sc.nextInt(); i >= 1; i--) {
                System.out.println("Enter R for Rock, P for Paper and S for Scissor");
                userChoice = sc.next().toUpperCase();
        
                switch (userChoice){
                    case "R": {
                        userChoice = "Rock";
                        break;
                    }
                    case "P": {
                        userChoice = "Paper";
                        break;
                    }
                    case "S": {
                        userChoice = "Scissor";
                        break;
                    }
                    default: System.out.println("You must enter R, P or S!");
                }
        
                if ((userChoice == "Rock" && compChoice == "Scissor") || (userChoice == "Paper" && compChoice == "Rock") || (userChoice == "Scissor" && compChoice == "Paper")) {
                    System.out.printf("You chose: %s \nCompuer Chose: %s \nYou won 1 point!\n", userChoice, compChoice);
                    userPoints += 1;
                }
        
                else if (userChoice == compChoice){
                    System.out.println("Tie!");
                }
        
                else {
                    System.out.printf("You chose: %s \nCompuer Chose: %s \nComp won 1 point\n", userChoice, compChoice);
                    compPoints += 1;
                }
            }
    
            System.out.printf("Your Points: %s\nComputer Points: %s\n", userPoints, compPoints);
            if (userPoints < compPoints)
            System.out.println("You lose!");
    
            else if(userPoints == compPoints) {
                System.out.println("Tie!");
            }
    
            else {
                System.out.println("You win!");
            }
            sc.close();
        } catch(Exception e){
            System.out.println("Invalid Input!");
        }
    }
}
