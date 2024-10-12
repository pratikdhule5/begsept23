package com.pratik.oops_5.demo.bad_implementation;

import com.pratik.oops_5.demo.User;
import com.pratik.oops_5.demo.library.MySqldriver;

public class BadUserServicewithmysql {
    MySqldriver db;
    public User saveUser(User u){
        db.insert(u);
        return u;
    }

    public User update(int id,User updated) {
        db.update(id, updated);
        return updated;
    }
}
