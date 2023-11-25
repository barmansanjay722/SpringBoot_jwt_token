package com.jw_SpringBoot.jwtTokenIMplementation.service;

import com.jw_SpringBoot.jwtTokenIMplementation.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Sanjay","sanjay.barman@mindit"));
        store.add(new User(UUID.randomUUID().toString(),"Ritu","ritu.barman@mindit"));
        store.add(new User(UUID.randomUUID().toString(),"Shivani","shivani.barman@mindit"));
        store.add(new User(UUID.randomUUID().toString(),"Rahul","Rahul.barman@mindit"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}
