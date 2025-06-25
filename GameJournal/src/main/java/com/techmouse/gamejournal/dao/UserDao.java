package com.techmouse.gamejournal.dao;

import com.techmouse.gamejournal.model.User;

public class UserDao extends BaseDao<User> {

    public UserDao() {
        super(User.class);
    }
}
