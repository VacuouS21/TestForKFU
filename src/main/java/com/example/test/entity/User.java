package com.example.test.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
@Data
@Table(name="users", schema="public")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class User {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private Long id;

    @Column(name="fio")
    private String fio;

    @Column(name="user_login")
    private String userLogin;

    @Column(name="user_password")
    private String userPassword;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="privilege_id")
    private Privilege privilegeId;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "myUser", orphanRemoval = true)
    private List<TicketsInformation> tickets;

}
