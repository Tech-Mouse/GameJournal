package com.techmouse.gamejournal.dao;

import com.techmouse.gamejournal.model.GameInstance;
import org.springframework.stereotype.Repository;

@Repository
public class GameInstanceDao extends BaseDao<GameInstance> {

    public GameInstanceDao() {
        super(GameInstance.class);
    }
}
