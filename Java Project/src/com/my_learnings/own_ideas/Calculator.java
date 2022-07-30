package com.my_learnings.own_ideas;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Declarations 
        Scanner sc = new Scanner(System.in);

        double num1, num2;
        char operator;
        
        // Main Code
        try {
            System.out.print("Welcome to Calculator! Enter a number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter '+' for addition, '-' for subtraction, '*' for multiplication, and '/' for division: ");
            operator = sc.next().charAt(0);
            System.out.print("Enter the second number: ");
            num2 = sc.nextDouble();
    
            if (operator == '+') {
                System.out.println(num1+" + "+num2+" = "+(num1 + num2));
            }
            else if (operator == '-') {
                System.out.println(num1+" - "+num2+" = "+(num1 - num2));
            }
            else if (operator == '*') {
                System.out.println(num1+" * "+num2+" = "+(num1 * num2));
            }
            else if (operator == '/') {
                System.out.println(num1+" / "+num2+" = "+(num1 / num2));
            }
        } catch (Exception e) {
            System.out.println("Wrong input!");
        }
        sc.close();
    }
}
