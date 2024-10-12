package com.pratik.oops_5.demo.bad_implementation;

import com.pratik.oops_5.demo.User;
import com.pratik.oops_5.demo.library.MongoDriver;

public class BadUserServicewithmongo {
    MongoDriver db;
    public User saveUser(User u){
        db.save(u);
        return u;
    }

    public User update(int id,User updated){
        db.update(id, updated, false);
        return updated;
    }
}
