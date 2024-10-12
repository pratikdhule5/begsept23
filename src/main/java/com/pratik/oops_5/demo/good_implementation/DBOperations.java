package com.pratik.oops_5.demo.good_implementation;

import com.pratik.oops_5.demo.User;

public interface DBOperations {
    User insert(User user);
    User update(int id, User user);
}
