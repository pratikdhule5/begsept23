package com.pratik.conc1.example1;

public class Main {
    public static void main(String[] args) {
        BasicThread basicThread = new BasicThread();
        Thread thread = new Thread(basicThread);
        thread.start();
        System.out.println("I am in main thread name is "+ Thread.currentThread().getName());
    }
}
