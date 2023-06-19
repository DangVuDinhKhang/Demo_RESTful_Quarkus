package com.appsdeveloperblog.app.ws.service;

import java.util.List;

import com.appsdeveloperblog.app.ws.model.Users;

public interface UserService {
    public void createUser(Users users);

    public List<Users> getAllUsers();

}
