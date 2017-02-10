package com.jrforman;

/**
 * Created by Administrator on 5/10/2016.
 */
public class EnhancedPlayer {

    private String name;
    private int hitpoint =100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health <= 100) {
            this.hitpoint = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitpoint = this.hitpoint - damage;
        if(this.hitpoint <=0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHitpoint() {
        return hitpoint;
    }
}
