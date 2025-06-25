package com.techmouse.gamejournal.dao;

import com.techmouse.gamejournal.model.Game;
import org.springframework.stereotype.Repository;

@Repository
public class GameDao extends BaseDao<Game> {

    public GameDao() {
        super(Game.class);
    }
}
