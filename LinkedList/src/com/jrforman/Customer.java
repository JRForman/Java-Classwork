package com.jrforman;

/**
 * Created by Administrator on 6/22/2016.
 */
public class Customer {
    private String name;
    private double balance;

    public Customer(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
