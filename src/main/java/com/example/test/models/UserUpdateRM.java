package com.example.test.models;

import lombok.Data;

@Data
public class UserUpdateRM {

    String fio;
    String userLogin;
    String userPassword;
    Long privilegeId;
}
