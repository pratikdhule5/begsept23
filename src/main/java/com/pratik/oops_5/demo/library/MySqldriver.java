package com.pratik.oops_5.demo.library;

import com.pratik.oops_5.demo.User;

public class MySqldriver {
    public void insert(User u){
        System.out.println("Inserting into mysql db");
    }

    public void update(int id, User updated){
        System.out.println("Updating mysql user with id" + id);
    }
}
