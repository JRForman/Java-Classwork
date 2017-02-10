package com.jrforman;

/**
 * Created by Administrator on 4/24/2016.
 */
public class Vehicle {
    private String name;
    private int steering;
    private int gears;
    private int speed;

    public Vehicle(String name, int steering, int gears, int speed) {
        this.name = name;
        this.steering = steering;
        this.gears = gears;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSteering() {
        return steering;
    }

    public int getGears() {
        return gears;
    }

    public int getSpeed() {
        return speed;
    }
}
