package com.my_learnings.exercises;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        try {
            int randNumber, userChoice, chances;

            System.out.println("Welcome to GuessTheNumber Game. You have to guess a number between 0 and 100.");
        

            randNumber = ran.nextInt(101);

            System.out.println("A random number has appeared in the chat. Guess it to eliminate it!");
            
            for(chances = 1; chances <= 5; chances++){
                System.out.print("Guess the Number: ");
                userChoice = sc.nextInt();
                
                if (userChoice < randNumber || userChoice > randNumber){
                    System.out.println("Nope. Try again.");
                }

                else if(userChoice == randNumber){
                    System.out.println("You won");
                    break;
                }
            }
            System.out.println("The number was "+randNumber);
            sc.close();
        } catch (Exception e){
            System.out.println("That doesn't strike me as a number!");
        }
    }
}
