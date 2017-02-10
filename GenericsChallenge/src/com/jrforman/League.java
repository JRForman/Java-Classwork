package com.jrforman;

import java.util.ArrayList;

/**
 * Created by Jason on 7/12/2016.
 */
public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<T>();
}
