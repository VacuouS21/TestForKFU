package com.example.test.dto;

import com.example.test.entity.TicketsInformation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data

public class UserDTO {

    private Long id;

    private Long tickets;

    private String fio;

    private String user_login;

    private String user_password;

    @JsonIgnore
    private TicketsInformation tickets_information;

}
