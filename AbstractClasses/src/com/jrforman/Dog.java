package com.jrforman;

/**
 * Created by Administrator on 7/5/2016.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void eat() {
        System.out.println("Breath in, breath out, repeat");
    }
}
