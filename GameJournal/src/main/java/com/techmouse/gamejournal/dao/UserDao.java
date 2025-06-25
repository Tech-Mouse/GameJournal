package com.techmouse.gamejournal.dao;

import com.techmouse.gamejournal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    @Override
    Optional<User> findById(Integer id);
}
