package com.appsdeveloperblog.app.ws.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")                  //dat ten trong db
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")                          //https://axon.udemy.com/course/quarkus-accessing-relational-databases-with-quarkus/learn/lecture/27225788#overview
    private String username;

    @Column(name = "password")
    private String password;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
