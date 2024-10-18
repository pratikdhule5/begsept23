package com.pratik.conc1.example1;

public class BasicThread implements Runnable {
    @Override
    public void run() {
        System.out.println("I am in new thread its name is " + Thread.currentThread().getName());
    }
}
