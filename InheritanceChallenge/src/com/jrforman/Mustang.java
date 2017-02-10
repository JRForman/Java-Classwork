package com.jrforman;

/**
 * Created by Administrator on 4/24/2016.
 */
public class Mustang extends Car {

    private int hatchback;
    private int gt;

    public Mustang(String name, int steering, int gears, int speed, int clutch, int engine, int hatchback, int gt) {
        super(name, steering, gears, speed, clutch, engine);
        this.hatchback = hatchback;
        this.gt = gt;
    }

    public int getHatchback() {
        return hatchback;
    }

    public int getGt() {
        return gt;
    }
}
