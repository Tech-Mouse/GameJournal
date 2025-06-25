package com.techmouse.gamejournal.dao;

import com.techmouse.gamejournal.model.Franchise;
import org.springframework.stereotype.Repository;

@Repository
public class FranchiseDao extends BaseDao<Franchise> {

    public FranchiseDao() {
        super(Franchise.class);
    }
}
