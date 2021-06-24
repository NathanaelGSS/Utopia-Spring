/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.Booking_AgentDAO;
import com.nathanael.utopia.tables.Booking_Agent;
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
@RequestMapping("/utopia/api/booking_agents")
public class Booking_AgentController {
    
    @Autowired
    private Booking_AgentDAO badao;
    
    @GetMapping()
    public List<Booking_Agent> getAllBooking_Agent() {
        return badao.findAll();
    }
    
    @PostMapping()
    public Booking_Agent createBooking_Agent(@Valid @RequestBody Booking_Agent ba) {
        return badao.save(ba);
    }
    
    @GetMapping("/{id}")
    public Optional<Booking_Agent> getBooking_AgentByID(@PathVariable Integer id) {
        return badao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteBooking_AgentByID(@PathVariable Integer id) {
        badao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllBooking_Agent() {
        badao.deleteAll();
    }
}