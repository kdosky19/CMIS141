/*
* File: TestHeadPhones.java
* Author: Khoger Dosky 
* Date: 02/20/2020
* Purpose: This TestHeadPhones.java file represents a headphone set
*/

class TestHeadPhone {
    public static void main(String[] args) {
        HeadPhone hp1 = new HeadPhone();
        
        //print out of toString for headphone 1
        System.out.println("\nHeadPhone 1 is: " + hp1.toString());
        
        HeadPhone hp2 = new HeadPhone();
            hp2.setPluggedIn(true);
            hp2.setVolume(2);
            hp2.setManufacturer("Audeze");
            hp2.setHeadPhoneColor("Blue");
            hp2.setHeadPhoneModel("Mobius");
            
        //printout of toString for headphone 2        
        System.out.println("\nHeadPhone 2 is: " + hp2.toString());
        hp2.changeVolume(3);//changeVolume method 
        System.out.println ("****Change Volume****");
        System.out.println("HeadPhone 2 is: " + hp2.toString());
 
        HeadPhone hp3 = new HeadPhone();
            hp3.setPluggedIn(true);
            hp3.setVolume(2);
            hp3.setManufacturer("HyperX");
            hp3.setHeadPhoneColor("White");
            hp3.setHeadPhoneModel("Cloud MIX");
        
        //printout of toString for headphone 3
        System.out.println("\nHeadPhone 3 is: " + hp3.toString());
        hp3.changeVolume(1);//changeVolume method 
        System.out.println ("****Change Volume****");
        System.out.println("HeadPhone 3 is: " + hp3.toString());
    }
}