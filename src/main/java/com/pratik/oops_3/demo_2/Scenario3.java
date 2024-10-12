package com.pratik.oops_3.demo_2;

public class Scenario3 {
    public static void main(String[] args) {
        CCC ccc=new CCC();
    }
}
class AAA{
    public AAA(){
        System.out.println("AA");
    }
}
class BBB extends AAA{
    public BBB(String s){
        System.out.println("BB");
    }
}
class CCC extends BBB{
    public CCC(){
        super("hello");
        System.out.println("CC");//There is no parameterless constructor available in 'com.pratik.oops_3.demo_2.BB'
    }
}

