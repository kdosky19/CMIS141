/*
 * Filenames: Guitar.java and TestGuitar.java
 * Author: Khoger Dosky 
 * Date: 02/09/2020
 * Brief purpose of the program: Homework 2 – java class for a guitar 
 */

import java.util.Random;
import java.awt.Color;


public class Guitar {

    private final int numStrings; // private defines the number of strings on the guitar
    private final double guitarLength; // private defines the length of the guitar in inches
    private final String guitarManufacturer; // private defines the manufacturer of the guitar
    private final Color guitarColor; // private defines the color of the guitar

    public Guitar(int numStrings, double guitarLength, String guitarManufacturer, Color guitarColor) {

        this.numStrings = numStrings; // defines the number of strings on the guitar
        this.guitarLength = guitarLength; // defines the length of the guitar in inches
        this.guitarManufacturer = guitarManufacturer; // defines the manufacturer of the guitar
        this.guitarColor = guitarColor; // defines the color of the guitar
    }

    public Guitar(){
        numStrings = 6; // default value should set to 6
        guitarLength = 28.2; // default value should set to 28.2
        guitarManufacturer = "Gibson"; // The default value set to Gibson
        guitarColor = Color.RED; // default value set to color Red
    }

    public int getNumStrings() {
        return this.numStrings;
    }

    public double getGuitarLength() {
        return this.guitarLength;
    }

    public String getGuitarManufacturer() {
        return this.guitarManufacturer;
    }

    public String getGuitarColor() {

        final Color BROWN = new Color(165, 42, 42);
        
        String colorName = "Unknown";
        if (this.guitarColor.equals(Color.RED)) colorName = "Red";
        else if (this.guitarColor.equals(Color.BLUE)) colorName = "Blue";
        else if (this.guitarColor.equals(Color.BLACK)) colorName = "Black";
        else if (this.guitarColor.equals(BROWN)) colorName = "Brown";
        else if (this.guitarColor.equals(Color.WHITE)) colorName = "White";
        return colorName;
    }

    //playGuitar method 
    public String playGuitar( ) {
        String play = "[";
        char[] notes = {'A','B','C','D','E','F','G'};
        double[] duration = {0.25,0.5,1,2,4};
        int a;
        int b;
        //random number
        Random rn = new Random();
        //loop to select random notes
        for (int k=0;k<16;k++) {
            a = rn.nextInt(7);
            b = rn.nextInt(5);
            play = play + notes[a] + "(" + String.valueOf(duration[b]) + ")";
            if (k!=15) play = play + ",";
        }
        play = play + ']';
        return play;

    }
    //toString                                              
    public String toString() {
        return "toString(): (numStrings = " + numStrings + ", guitarLength = " + guitarLength + ", guitarManufacturer = " + guitarManufacturer + ", guitarColor = " + getGuitarColor() + ")";
    }
}