package com.techmouse.gamejournal.dao;

import com.techmouse.gamejournal.model.PlayedGame;
import org.springframework.stereotype.Repository;

@Repository
public class PlayedGameDao extends BaseDao<PlayedGame> {

    public PlayedGameDao() {
        super(PlayedGame.class);
    }
}
