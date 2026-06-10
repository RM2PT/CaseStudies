package com.lms.librarymanagment.controller;


import com.lms.librarymanagment.domain.UsersDomain;
import com.lms.librarymanagment.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//localhost:8080/api/v1
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<UsersDomain> getUsers (){
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public UsersDomain getUser (@PathVariable Long id){
        return userService.getSingleUser(id);
    }
    @PostMapping("/users")
    public UsersDomain saveUser(@RequestBody UsersDomain usersDomain){
        return userService.saveUsers(usersDomain);
    }
    @PutMapping("/users/{id}")
    public UsersDomain updateUser(@RequestBody UsersDomain usersDomain,@PathVariable Long id) {
        usersDomain.setId(id);
        return userService.updateUsers(usersDomain);

    }
    //localhost:808/users?id=34
    @DeleteMapping("/users")
    public void deleteUsers(@RequestParam Long id){
        userService.deleteUser(id);

    }


    }
