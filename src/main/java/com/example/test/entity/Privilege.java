package com.example.test.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="privilege", schema="public")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Privilege {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="discount")
    private Integer discount;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true,mappedBy = "privilegeId")
    private List<User> users;

    public void addUser(User user){
        users.add(user);
    }
}

