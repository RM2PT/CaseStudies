package com.lms.librarymanagment.service;

import com.lms.librarymanagment.domain.UsersDomain;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    //list all users
    List <UsersDomain> getUsers();
    //persist users in the database
    UsersDomain saveUsers (UsersDomain usersDomain);
    //get single user from database
    UsersDomain getSingleUser(Long id);
    //delete single user
    void deleteUser(Long id);
    //update user
    UsersDomain updateUsers(UsersDomain usersDomain);
}
