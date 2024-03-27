package com.stabile.gabriel.springbootdemoapi.models;

import lombok.Data;

import java.util.UUID;

@Data()
public class UserModel {
    private UUID id;
    private String name;
    private String email;
    private String password;
}
