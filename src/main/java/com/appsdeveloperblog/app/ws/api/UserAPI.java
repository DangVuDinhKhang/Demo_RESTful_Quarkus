package com.appsdeveloperblog.app.ws.api;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import com.appsdeveloperblog.app.ws.model.Users;
import com.appsdeveloperblog.app.ws.service.UserService;
import com.appsdeveloperblog.app.ws.service.UserServiceImpl;

@Path("/users")
public class UserAPI {

    UserService userService = new UserServiceImpl();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Users> getUsers() {
        return userService.getAllUsers();
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(Users user) {
        userService.createUser(user);
        return Response.status(Response.Status.CREATED).entity(user).build();
    }
}
