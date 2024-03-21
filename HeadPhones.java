/*
* File: HeadPhones.java
* Author: Khoger Dosky 
* Date: 02/20/2020
* Purpose: This HeadPhones.java file represents a headphone set
*/

class HeadPhone {
    //Three constants named LOW, MEDIUM and HIGH with values of 1, 2 and 3 to denote the headphone volume
    public static final int LOW  = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    //private data fields 
    private int volume = MEDIUM;
    private boolean pluggedIn = false;
    private String manufacturer;
    private String headPhoneColor; 
    private String headPhoneModel;
    
    //default headphone
    public HeadPhone() {
        manufacturer = "JBL"; 
        headPhoneColor = "Black";
        headPhoneModel = "Tune 500BT"; 
    }
 
    public HeadPhone(boolean pluggedIn, int volume, String manufacturer, String headPhoneColor, String headPhoneModel) {
        this.pluggedIn = pluggedIn;
        this.volume = volume;
        this.manufacturer = manufacturer;
        this.headPhoneColor = headPhoneColor;
        this.headPhoneModel = headPhoneModel; 
    }
    //getter methods for all data fields.
    public boolean getPluggedIn() {
        return pluggedIn;
    }
 
    public int getVolume(){
        return volume;
    }
 
    public String getManufacturer() {
        return manufacturer;
    }
    
    public String getHeadPhoneColor() {
        return headPhoneColor;
    }
 
    public String getHeadPhoneModel() {
        return headPhoneModel;
    }
    //setter methods for all data fields.
    public void setPluggedIn (boolean newPluggedIn) {
        pluggedIn = newPluggedIn;
    }
 
    public void setVolume(int newVolume) {
        volume = newVolume;
    }
 
    public void setManufacturer(String newManufacturer) {
        manufacturer = newManufacturer;
    }
 
    public void setHeadPhoneColor(String newHeadPhoneColor) {
        headPhoneColor = newHeadPhoneColor;
    }
    
    public void setHeadPhoneModel(String newHeadPhoneModel) {
        headPhoneModel = newHeadPhoneModel;
    }
    
    //toString() method that returns a string describing the current field values of the headphones.
    public String toString() {
        return "(" + pluggedIn + ", "+ volume + ", " + manufacturer + ", " + headPhoneColor + ", " + headPhoneModel + ")";
    }
    
    //changeVolume() method 
    public void changeVolume(int volume) {
        setVolume(volume);
    }
}

