/*
* File: LetterGrade.java
* Author: Khoger Dosky
* Date: January 21, 2020
* Purpose: This program will generate a letter grade based one test score
*/

// Import each required Java class
import java.util.Scanner;

public class LetterGrade {
   

    public static void main(String[] args) {
    
    // Variable to hold values
    int testScore;
    char grade;
    Scanner scannerIn = new Scanner(System.in);
        
        // Promt user to enter test score to see letter grade     
        System.out.print("Enter your test score to see your letter grade: ");
        testScore = scannerIn.nextInt();
       
        if (90 <= testScore) {
            grade = 'A';
        }
        else if (80 <= testScore) {
            grade = 'B';
        }
        else if (70 <= testScore) {
            grade = 'C';
        }
        else if (60 <= testScore) {
            grade = 'D';
        }
        else if (0 <= testScore) {
            grade = 'F';
        }
        else {
        System.out.print("Your grade is: " + grade);
        }
    }
}