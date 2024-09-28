package com.pratik.oops_1;

public class Student {
    int age;
    float psp;
    String name;

    void changeBatch(){
        System.out.println("Changing Batch");
    }
    void joinClass(){
        System.out.println(name+ "is Joining Class");
    }

    void printDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(psp);
    }
}
