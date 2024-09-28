package com.pratik.oops_1;

import javax.swing.text.StyledDocument;

public class Main {
    public static void main(String[] args) {
         Student s1 = new Student();
         s1.name="pratik";
         s1.age=22;
         s1.psp=96;
         s1.changeBatch();
         s1.joinClass();
         s1.printDetails();

        Student s2 = new Student();
        s2.name="pratik2";
        s2.age=23;
        s2.psp=98;
        s2.printDetails();
    }
}
