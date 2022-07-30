package com.my_learnings.exercises;

import java.util.Scanner;

public class ExamMarks {
    public static void main(String[] args) {
        // Declarations
        Scanner sc = new Scanner(System.in);
         
        String name; 
        float m1, m2, m3, m4, m5, sum, percentage; // Variables beginning with 'm' will be used to store the marks.

        // Main Code
        try {
            System.out.print("Enter your name: ");
            name = sc.next();
            System.out.print("Enter your marks in English: ");
            m1 = sc.nextFloat();
            System.out.print("Enter your marks in Odia: ");
            m2 = sc.nextFloat();
            System.out.print("Enter your marks in Mathematics: ");
            m3 = sc.nextFloat();
            System.out.print("Enter your marks in Science: ");
            m4 = sc.nextFloat();
            System.out.print("Enter your marks in SST: ");
            m5 = sc.nextFloat();
            sum = m1 + m2 + m3 + m4 + m5;
            percentage = (sum/500)*100;
            System.out.println(name+" has scored a total of "+sum+" marks and "+percentage+"%!");
            sc.close();
        } catch (Exception e) {
            System.out.println("Wrong Input!");
        }
    }
}
