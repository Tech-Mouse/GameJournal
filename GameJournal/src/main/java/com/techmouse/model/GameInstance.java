package com.techmouse.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class GameInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String splashArt;
    private Double rating;
    private Long totalVotes;

    @ManyToOne
    private Platform platform;
}
