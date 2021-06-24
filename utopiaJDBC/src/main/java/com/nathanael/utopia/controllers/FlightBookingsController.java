/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.FlightBookingsDAO;
import com.nathanael.utopia.tables.FlightBookings;
import com.nathanael.utopia.tables.FlightBookings;
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
@RequestMapping("/utopia/api/flightbookings")
public class FlightBookingsController {
    
    @Autowired
    private FlightBookingsDAO fbdao;
    
    @GetMapping()
    public List<FlightBookings> getAllFlightBookings()  {
        return fbdao.findAll();
    }
    
    @PostMapping()
    public FlightBookings createFlightBookings(@Valid @RequestBody FlightBookings fb) {
        return fbdao.save(fb);
    }
    
    @GetMapping("/{id}")
    public Optional<FlightBookings> getFlightBookingsByID(@PathVariable Integer id) {
        return fbdao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteFlightBookingsByID(@PathVariable Integer id) {
        fbdao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllFlightBookings() {
        fbdao.deleteAll();
    }
}