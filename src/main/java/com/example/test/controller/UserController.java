package com.example.test.controller;

import com.example.test.entity.User;
import com.example.test.models.UserUpdateRM;
import com.example.test.models.filters.UserPage;
import com.example.test.models.filters.UserSearchCriteria;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/user")
    public User createUser(@RequestBody UserUpdateRM userUpdate) {

        return service.save(userUpdate);
    }

    @GetMapping("/user")
    public List getUsers() {
        return service.getAll();
        /*List<User> entitiesS = userService.getUsers(userPage, userSearchCriteria);
        if (expand != null) {
            return entitiesS;
        }
        return entitiesS.stream() //создали из листа стирим
                .map(mappingUtils::mapToProductDto) //оператором из streamAPI map, использовали для каждого элемента метод mapToProductDto из класса MappingUtils
                .collect(Collectors.toList());
    */}

    @GetMapping("/user/{id}")
    Object getUserFromId(@PathVariable Long id, @RequestParam(required = false) Object expand) {
        return service.getFromId(id);
        /*User entitiesS = userService.getUserFromId(id);
        if (expand != null) {
            return entitiesS;
        }
        return mappingUtils.mapToProductDto(entitiesS);//в метод mapToProductDto
        *///поместили результат поиска по id
        //.orElse(new ProductEntity()) //если ни чего не нашли, то вернем пустой entity

    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable("id") User userFromDb, @Valid @RequestBody UserUpdateRM userUpdate) {
        return service.update(userFromDb,userUpdate);
    }

    @DeleteMapping("/user/{id}")
    public User deleteUser(@PathVariable Long id) {
        return service.delete(id);
    }

}
