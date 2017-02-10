package com.jrforman;

/**
 * Created by jason on 7/13/2016.
 */
public class ScopeCheck {
    public int publicVar = 0;
    private int varOne =1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + "  varOne = " + varOne);
    }

    public int getVarOne(){
        return varOne;
    }

    public void timesTwo(){
        int privateVar = 2;
        for (int i =0; i<10; i++){
            System.out.println(i + " times two is " + i* privateVar);
        }

    }

    public class InnerClass {
  //      public int varOne = 3;

        public InnerClass(){
            System.out.println("InnerClass created, varOne is " + varOne);
        }
        public void timesTwo(){
            int privateVar = 2;
            for (int i =0; i<10; i++){
                System.out.println(i + " times two is " + i* privateVar);
            }

        }
    }
}
