package com.jrforman;

/**
 * Created by Administrator on 5/9/2016.
 */
public class Room {
    public Chair theChair;
    public Table theTable;
    public TV theTV;

    public Room(Chair theChair, Table theTable, TV theTV) {
        this.theChair = theChair;
        this.theTable = theTable;
        this.theTV = theTV;
    }

  public void tvON(){
      theTV.pressPower();
  }


}
