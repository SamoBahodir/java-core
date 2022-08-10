package com.example.demo.jwt.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationRecponce {
    private final String jwt;

    public AuthenticationRecponce(String jwt) {
        this.jwt = jwt;
    }
}
