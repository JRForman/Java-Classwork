package com.jrforman;

/**
 * Created by Administrator on 4/16/2016.
 */
public class VipCustomer {

    private String VIPName;
    private double VIPcreditLimit;
    private String VIPemail;

    public VipCustomer() {
        this("BOB", 1000.0, "bob@gmail.com");

    }

    public VipCustomer(String VIPName, double VIPcreditLimit) {
        this(VIPName, VIPcreditLimit, "unknown@email.com");
    }

    public VipCustomer(String VIPName, double VIPcreditLimit, String VIPemail) {
        this.VIPName = VIPName;
        this.VIPcreditLimit = VIPcreditLimit;
        this.VIPemail = VIPemail;
    }

    public String getVIPName() {
        return VIPName;
    }

    public double getVIPcreditLimit() {
        return VIPcreditLimit;
    }


    public String getVIPemail() {
        return VIPemail;
    }
}
