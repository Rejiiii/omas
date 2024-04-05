package com.omasystem.omas.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omasystem.omas.Entity.tbl_user;
import com.omasystem.omas.Service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/user")    
public class DemoController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<tbl_user> getAllUsers() {
        return userService.getAllUsers();
    }
}