package com.my_projects.microservices_springboot.controller;

import com.my_projects.microservices_springboot.dto.UserDTO;
import com.my_projects.microservices_springboot.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/api/v1/")
public class UserController {

    private UserService userService;

    @GetMapping("users")
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }
}
