/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.User_RoleDAO;
import com.nathanael.utopia.tables.User_Role;
import com.nathanael.utopia.tables.User_Role;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nathanael <Nathanael.Grier at your.org>
 */
@RestController
@RequestMapping("/utopia/api/user_roles")
public class User_RoleController {
    
    @Autowired
    private User_RoleDAO urdao;
    
    @GetMapping()
    public List<User_Role> getAllUser_Role() {
        return urdao.findAll();
    }
    
    @PostMapping()
    public User_Role createUser_Role(@Valid @RequestBody User_Role ur) {
        return urdao.save(ur);
    }
    
    @GetMapping("/{id}")
    public Optional<User_Role> getUser_RoleByID(@PathVariable Integer id) {
        return urdao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteUser_RoleByID(@PathVariable Integer id) {
        urdao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllUser_Role() {
        urdao.deleteAll();
    }
}