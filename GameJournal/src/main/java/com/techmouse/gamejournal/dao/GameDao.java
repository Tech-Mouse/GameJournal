package com.techmouse.gamejournal.dao;

import com.techmouse.gamejournal.model.Game;

public class GameDao extends BaseDao<Game> {

    public GameDao() {
        super(Game.class);
    }
}
