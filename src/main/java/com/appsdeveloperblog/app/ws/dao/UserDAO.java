package com.appsdeveloperblog.app.ws.dao;

import java.util.List;

import com.appsdeveloperblog.app.ws.model.Users;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserDAO implements PanacheRepositoryBase<Users, Long>{
    public UserDAO(){

    }

    public void createUser(Users users){
        try{
            persistAndFlush(users);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public List<Users> getAllUsers(){
        try{
            return listAll();
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
}
