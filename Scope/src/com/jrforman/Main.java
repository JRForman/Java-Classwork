package com.jrforman;

public class Main {

    public static void main(String[] args) {
	    String privateVar = "This is private to main()";

        ScopeCheck scopeOne = new ScopeCheck();
        System.out.println("scopeOne privateVar is " + scopeOne.getVarOne());
        System.out.println(privateVar);
        scopeOne.timesTwo();

        ScopeCheck.InnerClass innerClass = scopeOne.new InnerClass();
        innerClass.timesTwo();
    }
}
