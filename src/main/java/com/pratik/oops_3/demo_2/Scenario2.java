package com.pratik.oops_3.demo_2;

public class Scenario2 {
    public static void main(String[] args) {
        CC cc=new CC();
    }
}
class AA{
    public AA(){
        System.out.println("AA");
    }
}
class BB extends AA{
    public BB(){
        System.out.println("BB");
    }
}
class CC extends BB{
    public CC(){
        System.out.println("CC");//There is no parameterless constructor available in 'com.pratik.oops_3.demo_2.BB'
    }
}
