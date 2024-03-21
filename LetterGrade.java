/*
* File: LetterGrade.java
* Author: Khoger Dosky
* Date: January 21, 2020
* Purpose: This program will generate a letter grade based on one test score
*/

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        // Variables to hold values
        int testScore;
        char grade = 'F'; // Default to 'F', will be overridden if score is higher

        // Create a Scanner object for input
        Scanner scannerIn = new Scanner(System.in);
        
        // Prompt user to enter test score to see letter grade     
        System.out.print("Enter your test score to see your letter grade: ");
        testScore = scannerIn.nextInt();
        
        // Close the scanner
        scannerIn.close();

        // Determine the grade
        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } // No need for the 'F' condition as it's the default

        // Validate score range
        if (testScore < 0 || testScore > 100) {
            System.out.println("Invalid test score. Please enter a score between 0 and 100.");
        } else {
            System.out.println("Your grade is: " + grade);
        }
    }
}
