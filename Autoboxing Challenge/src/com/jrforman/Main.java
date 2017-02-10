package com.jrforman;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("MidFirst");

        bank.addBranch("Mesa");

        bank.addCustomer("Mesa", "Jason", 2000.05);
        bank.addCustomer("Mesa", "Mike", 143.23);
        bank.addCustomer("Mesa", "Tim", 12.12);

        bank.addBranch("Gilbert");
        bank.addCustomer("Gilbert", "Pat", 34234.34);

        bank.addCustomerTransaction("Mesa", "Jason", 1212);
        bank.addCustomerTransaction("Mesa", "Jason", 12.12);
        bank.addCustomerTransaction("Mesa", "Mike", 12.43);

        bank.listCustomers("Mesa", true);
        bank.listCustomers("Gilbert", true);

        if(!bank.addBranch("Mesa")){
            System.out.println("Mesa branch already exists.");
        }


        if(!bank.addCustomerTransaction("Mesa", "Joebob", 232.23)){
            System.out.println("Customer does not exists at branch");
        }
    }
}
