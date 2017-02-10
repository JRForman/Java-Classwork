package com.jrforman;

/**
 * Created by Administrator on 5/9/2016.
 */
public class TV {
    private String model;
    private String manufacturer;
    private int size;

    public TV(String model, String manufacturer, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void pressPower(){
        System.out.println("TV turning on...");
    }
}
