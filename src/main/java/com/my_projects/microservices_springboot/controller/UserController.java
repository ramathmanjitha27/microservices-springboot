package com.my_projects.microservices_springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value="/api/v1/")
public class UserController {

    @GetMapping("users")
    public String getUsers(){
        return "All Users";
    }

}
