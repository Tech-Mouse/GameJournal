package com.techmouse.gamejournal.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Platform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "platforms")
    private List<Game> games;

    @OneToMany(mappedBy = "platform")
    private List<GameInstance> gameInstances;

    @OneToMany(mappedBy = "platform")
    private List<PlayedGame> playedGames;
}
