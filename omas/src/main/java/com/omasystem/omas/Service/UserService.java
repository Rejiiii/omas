package com.omasystem.omas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.omasystem.omas.Entity.tbl_user;
import com.omasystem.omas.Repo.tbl_userRepo;

@Service
public class UserService {
    
    @Autowired
    private tbl_userRepo tbl_userRepo;

    public List<tbl_user> getAllUsers() {
        return tbl_userRepo.findAll();
    }
}