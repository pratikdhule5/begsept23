package com.pratik.conc1.example2;

import com.pratik.conc1.example1.BasicThread;

public class Main {
    public static void main(String[] args) {
        OddPrinter op = new OddPrinter();
        EvenPrinter ep = new EvenPrinter();

        Thread oddPrinter = new Thread(op);
        Thread evenPrinter = new Thread(ep);
        oddPrinter.run();
        evenPrinter.run();

    }
}
