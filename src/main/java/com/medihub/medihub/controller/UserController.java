package com.medihub.medihub.controller;

import com.medihub.medihub.entity.User;
import com.medihub.medihub.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {

    private UserService userService;
    @PostMapping("add")
    public void addUser(@RequestBody User user){
        userService.save(user);
    }
}
