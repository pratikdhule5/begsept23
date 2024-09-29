package com.pratik.oops_2.p2;

import com.pratik.oops_2.p1.NewStudent;

public class NewIntStudent extends NewStudent {

    public void print(){
        System.out.println(name);
        //System.out.println(age);//'age' has private access in 'com.pratik.oops_2.p1.NewStudent'
        //System.out.println(psp);//'psp' is not public in 'com.pratik.oops_2.p1.NewStudent'. Cannot be accessed from outside package

        pauseCourse();
        //printDetails();//'printDetails()' has private access in 'com.pratik.oops_2.p1.NewStudent'
        System.out.println(email);
    }


}
