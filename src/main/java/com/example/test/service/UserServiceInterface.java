package com.example.test.service;

import com.example.test.entity.AirplaneInfo;
import com.example.test.entity.User;
import com.example.test.models.UserUpdateRM;

import java.util.List;

public interface UserServiceInterface {
    User save(UserUpdateRM user);
    List<User> getAll();
    User getFromId(Long id);
    User delete(Long id);
    User update(User userFromDb, UserUpdateRM userUpdate);
}
