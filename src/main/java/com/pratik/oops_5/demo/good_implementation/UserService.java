package com.pratik.oops_5.demo.good_implementation;

import com.pratik.oops_5.demo.User;

public class UserService {
    static DBOperations db=new MongoDBOps();
    public User saveUser(User u){
        return db.insert(u);
    }
    public User update(int id,User upadted){
        return db.update(id, upadted);
    }

    public static void main(String[] args) {
        db.insert(new User());
        db.update(1,new User());
    }
}
