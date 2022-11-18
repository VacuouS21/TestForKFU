package com.example.test.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="airport", schema="public")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Airport {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private Long id;

    @Column(name="city")
    private String city;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true,mappedBy = "airportFrom")
    private List<TicketsInformation> ticketsInformationListFrom;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true,mappedBy = "airportWhere")
    private List<TicketsInformation> ticketsInformationListWhere;

}