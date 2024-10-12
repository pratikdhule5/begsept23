package com.pratik.oops_5.abstract_class;

public class Main {
    public static void main(String[] args) {
       // Animal a=new Animal();//'Animal' is abstract; cannot be instantiated
        //Cat c=new Cat();//'Cat' is abstract; cannot be instantiated
        Animal d=new Dog();
        d.walk();

    }
}
