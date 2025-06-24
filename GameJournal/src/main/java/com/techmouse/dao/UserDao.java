package com.techmouse.dao;

import com.techmouse.model.User;

public class UserDao extends BaseDao<User> {

    public UserDao() {
        super(User.class);
    }
}
