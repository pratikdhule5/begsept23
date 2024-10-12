package com.pratik.oops_5.demo.good_implementation;

import com.pratik.oops_5.demo.User;
import com.pratik.oops_5.demo.library.MySqldriver;

public class MySqlDBOps implements DBOperations{
    MySqldriver db=new MySqldriver();

    @Override
    public User insert(User user) {
        db.insert(user);
        return user;
    }

    @Override
    public User update(int id, User user) {
        db.update(id, user);
        return user;
    }
}
