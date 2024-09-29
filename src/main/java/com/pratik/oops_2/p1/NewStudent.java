package com.pratik.oops_2.p1;

public class NewStudent {
    private int age;
    float psp;
    protected String name;
    public String email;

    public NewStudent(){//no args constructor
        this.age = 20;
        this.name = "John Doe";
        this.email = "john@doe.com";
    }

    public NewStudent(int age, float psp, String name, String email){//para constructor
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.email = email;
    }

    void NewStudent(){
        System.out.println("New Student");//we can create method with same name as class name
    }

    void changeBatch() {
        System.out.println("Changing Batch");
        age++;
        printDetails();//age & printdetails() can be accessed inside class

    }

    void joinClass() {
        System.out.println(name + "is Joining Class");
    }

    protected void pauseCourse(){
        System.out.println(name+" Pausing Course");
    }

    private void printDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(psp);
    }
}