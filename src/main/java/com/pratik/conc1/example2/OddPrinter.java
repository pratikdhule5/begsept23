package com.pratik.conc1.example2;


public class OddPrinter implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd Thread: "+i);
            }
        }
    }
}
