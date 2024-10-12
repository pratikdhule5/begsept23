package com.pratik.oops_5.demo.good_implementation;

import com.pratik.oops_5.demo.User;
import com.pratik.oops_5.demo.library.MongoDriver;

public class MongoDBOps implements DBOperations {
        MongoDriver db=new MongoDriver();

    @Override
    public User insert(User user) {
        db.save(user);
        return user;
    }

    @Override
    public User update(int id, User user) {
        db.update(id,user,false);
        return user;
    }
}
