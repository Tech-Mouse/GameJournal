package com.techmouse.gamejournal.model;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {

    public Admin() {
        super();
        role = "ROLE_ADMIN";
    }
}
