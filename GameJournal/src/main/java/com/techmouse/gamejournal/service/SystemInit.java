package com.techmouse.gamejournal.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

@Component
public class SystemInit {

    private static final String ADMIN_USERNAME = "admin";
    private final AdminService adminService;
    private final PlatformTransactionManager manager;

    public SystemInit(AdminService adminService, PlatformTransactionManager manager) {
        this.adminService = adminService;
        this.manager = manager;
    }


}
