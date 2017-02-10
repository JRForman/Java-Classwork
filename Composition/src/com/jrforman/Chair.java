package com.jrforman;

/**
 * Created by Administrator on 5/9/2016.
 */
public class Chair {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Chair(String model, String manufacturer, int width, int height, int depth) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
