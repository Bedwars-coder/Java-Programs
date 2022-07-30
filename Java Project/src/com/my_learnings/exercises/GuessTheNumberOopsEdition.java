package com.my_learnings.exercises;

import java.util.Scanner;
import java.util.Random;

class GuessTheNumberClass {
    Random ran = new Random();
    Scanner sc = new Scanner(System.in);
    
    private int randNumber, userGuess, chances;
    
    public void startGame(){
        System.out.print("Enter the number of times you want to play the game:");
        chances = sc.nextInt();
        randNumber = ran.nextInt(101);
        
        for (int i = 1; i <= chances; i++){
            System.out.print("Guess The Number: ");
            userGuess = sc.nextInt();

            if (userGuess < randNumber){
                System.out.println("You entered a smaller number!");
            }
            else if (userGuess > randNumber) {
                System.out.println("You entered a greater number!");
            }

            else if (userGuess == randNumber){
                System.out.println("You won!");
                break;
            }
            else {
                System.out.println();
            }

        }
        System.out.printf("The number was %d\n", randNumber);
    }
}

public class GuessTheNumberOopsEdition {
    public static void main(String[] args) {
        GuessTheNumberClass game = new GuessTheNumberClass();
        game.startGame();
    }

}
