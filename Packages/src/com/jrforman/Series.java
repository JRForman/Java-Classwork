package com.jrforman;

/**
 * Created by jason on 7/13/2016.
 */
public class Series {

    public static long nSum(int n){
        return ((n* (n+1))/2);
    }

    public static long factorial(int n) {
        if (n== 0){
            return 0;
        }
        long fact =1;
        for (int i =1; i <=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static long fib(int n){
        if(n==0){
            return 0;
        }

        long fib =0;
        for (int i = 1; i <=n; i++){
            fib +=i;
        }

        return fib;
    }
}
