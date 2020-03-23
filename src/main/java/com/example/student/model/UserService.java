package com.example.student.model;

import com.example.student.model.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User save(User newUser);

    void deleteById(Long id);

    User updateUser(User newUser, Long id);

    User getUserById(Long id);
}
