package com.techmouse.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer releaseYear;

    @ManyToMany
    private List<Franchise> franchises;

    @ManyToMany
    private List<Platform> platforms;


}
