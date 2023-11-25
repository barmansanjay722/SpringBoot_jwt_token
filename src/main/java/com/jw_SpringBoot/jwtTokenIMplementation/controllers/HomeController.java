package com.jw_SpringBoot.jwtTokenIMplementation.controllers;

import com.jw_SpringBoot.jwtTokenIMplementation.models.User;
import com.jw_SpringBoot.jwtTokenIMplementation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUser() {
        System.out.println("getting users");
        return userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedInuser(Principal principal) {
        return principal.getName();
    }
}
