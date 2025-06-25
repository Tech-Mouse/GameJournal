package com.techmouse.gamejournal.dao;

import com.techmouse.gamejournal.model.Admin;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao extends BaseDao<Admin> {

    public AdminDao() {
        super(Admin.class);
    }
}
