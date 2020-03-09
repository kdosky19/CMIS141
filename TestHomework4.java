/*
* File: TestHomework4.java
* Author: Khoger Dosky 
* Date: 02/25/2020
* Purpose: Java program that displays the State bird and flower by user input and a summary report 
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestHomework4 {
    
    private static String[][] stateList;
    
    public static void main(String[] args) {
        Homework4 hw4 = new Homework4();
        stateList = hw4.getStateList();
        Scanner userInput = new Scanner(System.in);
        List<String> userSelected = new ArrayList<>();
    
    	//while loop 
        while (true) {           
            System.out.println("Enter a State or None to exit:");
            String stateName = userInput.nextLine();
			
            if (stateName.trim().equalsIgnoreCase("None")) {
                System.out.println("**** Thank you ***** \nA summary report for each State, Bird, and Flower is:");
                for(int i=0; i < userSelected.size(); i++){
                    System.out.println(userSelected.get(i));
                }
                System.out.println("Please visit our site again!");
            } else {
                if (!stateName.equals("")) {
                    String stateBird = getBird(stateName);
                    String stateFlower = getFlower(stateName);
                    System.out.println("Bird: " + stateBird);
                    System.out.println("Flower: " + stateFlower);
                    if(stateBird.equals("") || stateFlower.equals("")){
                        System.out.println("Could not find a match.");
                    }else{
                        userSelected.add(stateName + ", "+stateBird+", "+stateFlower);
                    }
                    
                } else {
                    System.out.println("Please try again. ***Check the spelling of State name***");
                }
            }
        }
    }

    	
    private static String getFlower(String stateName) {
	//flower pulled from statelist 
        String stateFlower = "";
        for(int i=0; i < stateList.length; i++){
            if(stateList[i][0].equals(stateName)){
                stateFlower = stateList[i][2];
                break;
            }
        }
        return stateFlower;
    }

    private static String getBird(String stateName) {
        String stateBird = "";
        //bird name pulled from statelist 
        for(int i=0; i < stateList.length; i++){
            if(stateList[i][0].equals(stateName)){
                stateBird = stateList[i][1];
                break;
            }
        }
        return stateBird;
    }

    private static String getFlowerName(int x, String[][] StateName) {
        return StateName[x][2];
    }
}