/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.UserDAO;
import com.nathanael.utopia.tables.User;
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
@RequestMapping("/utopia/api/users")
public class UserController {
    
    @Autowired
    private UserDAO udao;
    
    @GetMapping()
    public List<User> getAllUser() {
        return udao.findAll();
    }
    
    @PostMapping()
    public User createUser(@Valid @RequestBody User u) {
        return udao.save(u);
    }
    
    @GetMapping("/{id}")
    public Optional<User> getUserByID(@PathVariable Integer id) {
        return udao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteUserByID(@PathVariable Integer id) {
        udao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllUser() {
        udao.deleteAll();
    }
}