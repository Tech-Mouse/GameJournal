package com.techmouse.gamejournal.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "GameJournal_User")
@Setter
@Getter
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected String username;
    protected String password;

    protected String role;

    @OneToMany(mappedBy = "user")
    private List<PlayedGame> playedGames;



}
