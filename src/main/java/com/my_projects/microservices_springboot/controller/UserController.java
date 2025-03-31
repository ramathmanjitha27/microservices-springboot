package com.my_projects.microservices_springboot.controller;

import com.my_projects.microservices_springboot.dto.UserDTO;
import com.my_projects.microservices_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/api/v1/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("addUser")
    public UserDTO addUser(@RequestBody UserDTO userDto){
        return userService.addUser(userDto);
    }

}
