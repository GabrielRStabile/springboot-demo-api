package com.stabile.gabriel.springbootdemoapi.controllers;

import com.stabile.gabriel.springbootdemoapi.models.UserModel;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String getAllUsers() {
        return "All users";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id) {
        return "User by id: " + id;
    }

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user) {
        user.setId(UUID.randomUUID());
        user.setPassword(null);
        return user;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id) {
        return "Update user";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        return "Delete user";
    }
}
