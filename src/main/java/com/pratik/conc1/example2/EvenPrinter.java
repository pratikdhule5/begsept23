package com.pratik.conc1.example2;

public class EvenPrinter implements Runnable{
    public void run() {
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println("Even Thread: "+i);
            }
        }
    }
}
