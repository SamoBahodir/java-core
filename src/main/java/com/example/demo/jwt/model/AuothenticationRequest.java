package com.example.demo.jwt.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter@NoArgsConstructor
public class AuothenticationRequest {
    private String username;
    private String password;

}
