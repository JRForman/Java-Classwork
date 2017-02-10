package com.jrforman;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123654);
        timsPhone.powerOn();
        timsPhone.callPhone(123654);
        timsPhone.answer();


        timsPhone = new MobilePhone(23654);
        timsPhone.powerOn();
        timsPhone.callPhone(23654);
        timsPhone.answer();
    }
}
