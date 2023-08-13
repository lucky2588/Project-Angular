package com.example.projectangular.controller;

import com.example.projectangular.entity.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class AuthController {
    @GetMapping("basicAuth")
    public Account getSeccess(){
        return
                new Account("Thang","123");
    }

}
