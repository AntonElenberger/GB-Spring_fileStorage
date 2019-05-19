package com.geekbrains.filestorage.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
}
