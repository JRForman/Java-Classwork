package com.jrforman;

import static com.jrforman.ThreadColor.ANSI_RED;

/**
 * Created by Administrator on 9/3/2016.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from my runnables!!");
    }
}
