package com.example.test.service;

import com.example.test.entity.Privilege;
import com.example.test.entity.TicketsInformation;
import com.example.test.entity.User;
import com.example.test.exeptions.ResouceNotFoundException;
import com.example.test.models.UserUpdateRM;
import com.example.test.repos.PrivilegeRep;
import com.example.test.repos.UserRep;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    UserRep repository;

    @Autowired
    PrivilegeRep privilegeRep;

    public User save(UserUpdateRM userUpdate) {
        User user=mappingUser(userUpdate);
        System.out.println(user.getPrivilegeId().getName());
        return repository.save(user);
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getFromId(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new ResouceNotFoundException(id));
    }

    @Override
    public User delete(Long id) {
        User user=repository.findById(id).orElseThrow(
                () -> new ResouceNotFoundException(id));
        repository.delete(user);
        return user;
    }

    @Override
    public User update(User userFromDb, UserUpdateRM userUpdate) {
        //BeanUtils.copyProperties(userUpdate,userFromDb,"id");
        User user=mappingUser(userFromDb.getId(),userUpdate);
        repository.save(user);
        return user;
    }

    private User mappingUser(UserUpdateRM userNew){
        Privilege privilege=privilegeRep.findById(userNew.getPrivilegeId()).orElseThrow(
                () -> new ResouceNotFoundException(userNew.getPrivilegeId()));
        User user=new User();
        user.setId(null);
        user.setFio(userNew.getFio());
        user.setUserLogin(userNew.getUserLogin());
        user.setUserPassword(userNew.getUserPassword());
        user.setPrivilegeId(privilege);
       /* privilege.addUser(user);
        privilegeRep.save(privilege);*/
        return user;
    }
    private User mappingUser(Long id,UserUpdateRM userNew){
        Privilege privilege=privilegeRep.findById(userNew.getPrivilegeId()).orElseThrow(
                () -> new ResouceNotFoundException(userNew.getPrivilegeId()));
        User user=new User();
        user.setId(id);
        user.setFio(userNew.getFio());
        user.setUserLogin(userNew.getUserLogin());
        user.setUserPassword(userNew.getUserPassword());
        user.setPrivilegeId(privilege);
       /* privilege.addUser(user);
        privilegeRep.save(privilege);*/
        return user;
    }
}
