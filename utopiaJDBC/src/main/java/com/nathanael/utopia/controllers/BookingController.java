/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.BookingDAO;
import com.nathanael.utopia.tables.Booking;
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
@RequestMapping("/utopia/api/bookings")
public class BookingController {
    
    @Autowired
    private BookingDAO bdao;
    
    @GetMapping()
    public List<Booking> getAllBooking() {
        return bdao.findAll();
    }
    
    @PostMapping()
    public Booking createBooking(@Valid @RequestBody Booking b) {
        return bdao.save(b);
    }
    
    @GetMapping("/{id}")
    public Optional<Booking> getBookingByID(@PathVariable Integer id) {
        return bdao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteBookingByID(@PathVariable Integer id) {
        bdao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllBooking() {
        bdao.deleteAll();
    }
}