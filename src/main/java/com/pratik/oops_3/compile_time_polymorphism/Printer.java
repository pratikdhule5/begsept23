package com.pratik.oops_3.compile_time_polymorphism;

public class Printer {
    void print(){
        System.out.println("I am empty");
    }
    void print(String s){
        System.out.println("I am also empty");
    }
//    String print(String sa);{
//        return sa;// we dont condisder diff return type as sign
//    }
}
