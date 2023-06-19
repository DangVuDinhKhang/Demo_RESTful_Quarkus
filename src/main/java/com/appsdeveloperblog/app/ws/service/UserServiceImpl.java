package com.appsdeveloperblog.app.ws.service;

import java.util.List;

import com.appsdeveloperblog.app.ws.dao.UserDAO;
import com.appsdeveloperblog.app.ws.model.Users;

import jakarta.inject.Inject;
import jakarta.ws.rs.InternalServerErrorException;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

public class UserServiceImpl implements UserService{
    @Inject
    UserDAO userDAO = new UserDAO();

    @Override
    public void createUser(Users users){
        try{
            userDAO.createUser(users);
        }
        catch(Exception e){
            throw new InternalServerErrorException(e.getMessage());
        }
    }
    // private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    // @Override
    // public void createUser(Users users){
    //     try {
    //         LOGGER.debug("Creating user: {}", users);
    //         userDAO.createUser(users);
    //     } catch (Exception e) {
    //         LOGGER.error("Error creating user: {}", e.getMessage());
    //         throw new InternalServerErrorException(e.getMessage());
    //     }
    // }

    @Override
    public List<Users> getAllUsers(){
        return userDAO.getAllUsers();
    }
}
