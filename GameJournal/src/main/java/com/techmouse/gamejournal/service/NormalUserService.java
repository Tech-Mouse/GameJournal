package com.techmouse.gamejournal.service;

import com.techmouse.gamejournal.dao.NormalUserDao;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class NormalUserService {
    private final PasswordEncoder passwordEncoder;
    private final NormalUserDao users;

    public NormalUserService(PasswordEncoder passwordEncoder, NormalUserDao users) {
        this.passwordEncoder = passwordEncoder;
        this.users = users;
    }
}
