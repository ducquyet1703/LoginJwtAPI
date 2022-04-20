package com.dts.loginjwtapi.users;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "login")
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
}
