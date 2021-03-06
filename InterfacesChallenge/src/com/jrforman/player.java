package com.jrforman;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 6/28/2016.
 */
public class player implements ISavable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public player(String name, int hitPoints, int stength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = stength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int stength) {
        this.strength = stength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "player {" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);


        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null & savedValues.size() >0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(4);
        }

    }
}
