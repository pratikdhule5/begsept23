package com.pratik.oops_2.p2;

import com.pratik.oops_2.p1.NewStudent;

public class Main {
    public static void main(String[] args) {
        NewIntStudent s3=new NewIntStudent();
        //s3.psp=50;//'psp' is not public in 'com.pratik.oops_2.p1.NewStudent'. Cannot be accessed from outside package
        //s3.joinClass();//'joinClass()' is not public in 'com.pratik.oops_2.p1.NewStudent'. Cannot be accessed from outside package
        s3.email="asass";
    }
}
