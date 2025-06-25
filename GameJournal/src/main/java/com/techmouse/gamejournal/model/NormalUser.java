package com.techmouse.gamejournal.model;

import jakarta.persistence.Entity;

@Entity
public class NormalUser extends User {

    public NormalUser() {
        super();
        role = "ROLE_USER";
    }
}
