/*
 * Filename: Homework1
 * Author: Khoger Dosky 
 * Date: 01/25/2020
 * Brief purpose of the program: To calculate the input entered by the user 
 */

//Java classes 
import java.util.Scanner;
import java.text.DecimalFormat;

public class Homework1 {

        public static void main(String[] args){

        //class for scanner
        Scanner input= new Scanner(System.in);
            
        //class for decimal format 
        DecimalFormat df = new DecimalFormat(".0");
                
        //variables listed below 
        int emplId, ageInMonths, ageInYears;
        double quiz1, quiz2, quiz3, quizAverage, tempInCelcius, tempInFahrenheit;
        
        //Promts the user to enter EMPLID
        System.out.print("Enter your Student EMPLID (0-999999):");
        emplId=input.nextInt();
        if(emplId<0||emplId>999999) {
        do {
            System.out.println("Your EMPLID has to be between \"0-999999\".");
            System.out.print("Re-enter your EMPLID:");
            emplId=input.nextInt();
            }
        while (emplId<0||emplId>999999);
        }
        
        //Prompts the user to enter quiz1 percentage score
        System.out.printf("Enter your Quiz 1 percentage score (0.0-100.0):");
        quiz1=input.nextDouble();
        if (quiz1<0.0||quiz1>100.0) {
        do {
            System.out.println("Your Quiz 1 percentage has to be between \"0.0-100.0\".");
            System.out.print("Re-enter your Quiz 1 percentage:");
            quiz1=input.nextDouble();
           }
        while(quiz1<0.0||quiz1>100.0);
        }
        
        //Prompts the user to enter quiz2 percentage score
        System.out.print("Enter your Quiz 2 percentage score (0.0-100.0):");
        quiz2=input.nextDouble();
        if (quiz2<0.0||quiz2>100.0) {
        do {
            System.out.println("Your Quiz 2 percentage has to be between \"0.0-100.0\".");
            System.out.print("Re-enter your Quiz 2 percentage:");
            quiz2=input.nextDouble();
           }
        while(quiz2<0.0||quiz2>100.0);
        }
        
        //Prompts the user to enter quiz3 percentage score
         System.out.print("Enter your Quiz 3 percentage score (0.0-100.0):");
        quiz3=input.nextDouble();
            if (quiz3<0.0||quiz3>100.0) {
        do {
            System.out.println("Your Quiz 3 percentage has to be between \"0.0-100.0\".");
            System.out.print("Re-enter your Quiz 3 percentage:");
            quiz3=input.nextDouble();
           }
        while(quiz3<0.0||quiz3>100.0);
        }
        
        //Propmts the user to enter thier age in months 
        System.out.print("Enter your age in months (0-1440):");
        ageInMonths=input.nextInt();
        if((ageInMonths<0)||(ageInMonths>1440)) {
        do {
            System.out.println("Your age in months has to be between \"0-1440\" months.");
            System.out.print("Re-enter your age in months:");
            ageInMonths=input.nextInt();
            }
        while((ageInMonths<0)||(ageInMonths>1440));
        }
        
        //Promts the user to enter temprature in degrees celsius
        System.out.print("Enter the current Temperature in degrees Celsius:");
        tempInCelcius=input.nextDouble();

        //This formula calcuates the average for all three quizs, adds input and divides it by 3
        quizAverage=(quiz1+quiz2+quiz3)/3.0;
       
        //This formula converts the temprature from celcius to fahrenheit 
        tempInFahrenheit=(tempInCelcius*1.8+32);
	
        //Converts the users age in months into years, divides the input by 12 
        ageInYears=(ageInMonths/12);
        
        //All output print lines 
        System.out.println("\n***Thank You***");
        System.out.println("Student EMPLID:" + emplId);
        System.out.println("Quiz 1 Score:" + quiz1);
        System.out.println("Quiz 2 Score:" + quiz2);
        System.out.println("Quiz 3 Score:" + quiz3);
	System.out.println("Average quiz score:" + df.format(quizAverage));
        System.out.println("Age in months:" + ageInMonths);
        System.out.println("Age in years:" + ageInYears);
        System.out.printf("Temperature in Celsius: %4.1f\u00b0%n",tempInCelcius);
        System.out.printf("Temperature in Fahrenheit: %4.1f\u00b0%n",tempInFahrenheit);
        }
}