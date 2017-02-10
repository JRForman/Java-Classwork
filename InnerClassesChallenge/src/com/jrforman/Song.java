package com.jrforman;

/**
 * Created by jason on 6/23/2016.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
