package com.techmouse.gamejournal.dao;

import com.techmouse.gamejournal.model.NormalUser;
import org.springframework.stereotype.Repository;

@Repository
public class NormalUserDao extends BaseDao<NormalUser> {
    public NormalUserDao() {
        super(NormalUser.class);
    }
}
