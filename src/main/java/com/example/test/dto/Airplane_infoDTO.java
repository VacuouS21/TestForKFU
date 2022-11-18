package com.example.test.dto;

import com.example.test.entity.TicketsInformation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class Airplane_infoDTO {
    private Long id;

    private String name_airplane;

    private Integer seats_count;

    @JsonIgnore
    private List<TicketsInformation> tickets_informationList;
}
