package com.example.student.web;

import com.example.student.model.UserService;
import com.example.student.model.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // Aggregate root

    @GetMapping("/users")
    List<User> all() {
        return this.userService.findAll();
    }

    @PostMapping("/users")
    User newUser(@RequestBody User newUser) {
        return this.userService.save(newUser);
    }

    @GetMapping("/users/{id}")
    User getUser(@PathVariable Long id) {

        return this.userService.getUserById(id);
    }

    @PutMapping("/users/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return this.userService.updateUser(newUser, id);
    }

    @DeleteMapping("/Users/{id}")
    void deleteUser(@PathVariable Long id) {
        this.userService.deleteById(id);
    }
}
