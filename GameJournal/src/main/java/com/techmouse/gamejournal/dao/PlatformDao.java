package com.techmouse.gamejournal.dao;

import com.techmouse.gamejournal.model.Platform;
import org.springframework.stereotype.Repository;

@Repository
public class PlatformDao extends BaseDao<Platform> {
    public PlatformDao() {
        super(Platform.class);
    }
}
