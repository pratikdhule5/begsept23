package com.pratik.oops_2.p1;

public class Main {
    public static void main(String[] args) {
        NewStudent s1=new NewStudent(20,60,"pratik","pp1@gmail");
        //s1.age=25;//'age' has private access in 'com.pratik.oops_2.p1.NewStudent'
        //s1.printDetails();//'printDetails()' has private access in 'com.pratik.oops_2.p1.NewStudent'
        s1.psp=50;
        System.out.println(s1.psp);
        s1.email="pp@scaler.com";
        //s1.NewStudent();
    }
}
