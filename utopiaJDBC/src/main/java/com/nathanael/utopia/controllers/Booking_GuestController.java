/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.Booking_GuestDAO;
import com.nathanael.utopia.tables.Booking_Agent;
import com.nathanael.utopia.tables.Booking_Guest;
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
@RequestMapping("/utopia/api/booking_guests")
public class Booking_GuestController {
    
    @Autowired
    private Booking_GuestDAO bgdao;
    
    @GetMapping()
    public List<Booking_Guest> getAllBooking_Guest() {
        return bgdao.findAll();
    }
    
    @PostMapping()
    public Booking_Guest createBooking_Guest(@Valid @RequestBody Booking_Guest bg) {
        return bgdao.save(bg);
    }
    
    @GetMapping("/{id}")
    public Optional<Booking_Guest> getBooking_GuestByID(@PathVariable Integer id) {
        return bgdao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteBooking_GuestByID(@PathVariable Integer id) {
        bgdao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllBooking_Guest() {
        bgdao.deleteAll();
    }
}
