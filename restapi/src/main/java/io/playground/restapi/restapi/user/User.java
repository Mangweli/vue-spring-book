package io.playground.restapi.restapi.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class User {
    @Id
    @GeneratedValue

    public int Id;
    public String name;
    public String email;
    public String password;
}
