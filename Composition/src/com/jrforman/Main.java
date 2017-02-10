package com.jrforman;

import javafx.scene.control.Tab;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220b", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27in beast", "Acer", 27, new Resolution(1900, 1200));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4 , 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        Chair theChair = new Chair("OshKosh", "Lemens", 12,34,23);

        Table theTable = new Table("Zeus", "Stevens", 23,12,32);

        TV theTV = new TV("27a", "Asus", 27);

        Room theRoom = new Room(theChair, theTable, theTV);
        theRoom.theTV.pressPower();
    }
}
