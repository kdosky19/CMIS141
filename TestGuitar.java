/*
 * Filenames: Guitar.java and TestGuitar.java
 * Author: Khoger Dosky 
 * Date: 02/09/2020
 * Brief purpose of the program: Homework 2 – java class for a guitar 
 */

import javafx.scene.paint.Color;


public class TestGuitar extends Guitar{
    

    public static void main(String[] args) {
        Guitar guitarOne = new Guitar();
        System.out.println(guitarOne.toString());
        System.out.println("getNumStrings: " + guitarOne.getNumStrings());
        System.out.println("getGuitarLength: " + guitarOne.getGuitarLength());
        System.out.println("getGuitarManufacturer: " + guitarOne.getGuitarManufacturer());
        System.out.println("getGuitarColor: " + guitarOne.getGuitarColor());
        System.out.println("playGuitar: " + guitarOne.playGuitar());
    }
}