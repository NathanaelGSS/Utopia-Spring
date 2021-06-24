/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.Booking_UserDAO;
import com.nathanael.utopia.tables.Booking_User;
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
@RequestMapping("/utopia/api/booking_users")
public class Booking_UserController {
    
    @Autowired
    private Booking_UserDAO budao;
    
    @GetMapping()
    public List<Booking_User> getAllBooking_User() {
        return budao.findAll();
    }
    
    @PostMapping()
    public Booking_User createBooking_User(@Valid @RequestBody Booking_User bu) {
        return budao.save(bu);
    }
    
    @GetMapping("/{id}")
    public Optional<Booking_User> getBooking_UserByID(@PathVariable Integer id) {
        return budao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteBooking_UserByID(@PathVariable Integer id) {
        budao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllBooking_User() {
        budao.deleteAll();
    }
}