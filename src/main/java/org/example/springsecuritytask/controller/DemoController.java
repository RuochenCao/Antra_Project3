package org.example.springsecuritytask.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/protected")
    @PreAuthorize("hasRole('USER')")
    public String getProtectedResource() {
        return "Request successful";
    }
}

