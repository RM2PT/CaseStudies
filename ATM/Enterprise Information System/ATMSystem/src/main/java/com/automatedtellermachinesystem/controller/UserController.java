package com.automatedtellermachinesystem.controller;

import com.automatedtellermachinesystem.controller.generic.GenericController;
import com.automatedtellermachinesystem.controller.generic.response.GenericResponse;
import com.automatedtellermachinesystem.service.ManageUserCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user",
        produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController extends GenericController {

    private final ManageUserCRUDService manageUserCRUDService;

    @Autowired
    public UserController(ManageUserCRUDService manageUserCRUDService) {
        this.manageUserCRUDService = manageUserCRUDService;
    }

    @PostMapping("/create")
    public @ResponseBody
    GenericResponse createUser(@RequestParam int userId,
                               @RequestParam String name,
                               @RequestParam String address) {
        manageUserCRUDService.createUser(userId, name, address);
        return createSuccessResponse("User created!");
    }

    @GetMapping("/queryUser")
    public @ResponseBody
    GenericResponse queryUser(@RequestParam int userId) {
        return createSuccessResponse(manageUserCRUDService.queryUser(userId));
    }

    @PostMapping("/delete")
    public @ResponseBody
    GenericResponse deleteUser(@RequestParam int userId) {
        return createSuccessResponse(manageUserCRUDService.deleteUser(userId));
    }
}