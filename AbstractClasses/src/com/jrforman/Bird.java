package com.jrforman;

/**
 * Created by Administrator on 7/5/2016.
 */
public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void eat() {
        System.out.println("Breathe in, breathe out, repeat");

    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
