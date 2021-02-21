package com.lintao.oauth2autoconfig.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class UserController {

    @GetMapping("/user-resource")
    public Object getUserResource() {
        return SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();
    }

    @GetMapping("/redirect-uri")
    public String redirectUri() {
        return "<h1> This is the redirectUri <h1>";
    }
}
