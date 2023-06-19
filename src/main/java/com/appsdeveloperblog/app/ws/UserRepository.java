package com.appsdeveloperblog.app.ws;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<Users, Long> {
    public void create(Users user) {
        persistAndFlush(user);
    }

}