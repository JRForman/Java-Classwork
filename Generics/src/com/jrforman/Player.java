package com.jrforman;

/**
 * Created by Administrator on 7/9/2016.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
