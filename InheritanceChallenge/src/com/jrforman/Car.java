package com.jrforman;

/**
 * Created by Administrator on 4/24/2016.
 */
public class Car extends Vehicle {

    private int clutch;
    private int engine;

    public Car(String name, int steering, int gears, int speed, int clutch, int engine) {
        super(name, steering, gears, speed);
        this.clutch = clutch;
        this.engine = engine;
    }

    public int getClutch() {
        return clutch;
    }

    public int getEngine() {
        return engine;
    }
}
