package com.jrforman;

/**
 * Created by Administrator on 5/9/2016.
 */
public class Table {
    private String model;
    private String manufacturer;
    private int height;
    private int width;
    private int depth;

    public Table(String model, String manufacturer, int height, int width, int depth) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }
}
