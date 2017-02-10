package com.jrforman;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Account bobsAccount = new Account(); //"12345", 0.00, "Bob Brown", "myemail@bob.com", "012 123 3211");
//
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.depoit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.depoit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
//
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        VipCustomer bob = new VipCustomer("Bob Gordon", 1000, "bobgordon@gmail.com");
        System.out.println("Name: " + bob.getVIPName() + "\nCredit Limit: " + bob.getVIPcreditLimit() +
        "\nEmail: " + bob.getVIPemail());
    }
}
