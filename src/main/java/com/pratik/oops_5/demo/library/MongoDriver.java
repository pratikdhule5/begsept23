package com.pratik.oops_5.demo.library;

import com.pratik.oops_5.demo.User;

public class MongoDriver {
    public void save(User u){
        System.out.println("saving to mongo");
    }
    public void update(int id, User u, boolean upsert){
        System.out.println("updating to mongo with user id "+id+"with upsert "+upsert);
    }
}
