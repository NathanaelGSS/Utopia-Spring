/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.FlightDAO;
import com.nathanael.utopia.tables.Flight;
import com.nathanael.utopia.tables.Flight;
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
@RequestMapping("/utopia/api/flights")
public class FlightController {
    
    @Autowired
    private FlightDAO fdao;
    
    @GetMapping()
    public List<Flight> getAllFlight() {
        return fdao.findAll();
    }
    
    @PostMapping()
    public Flight createFlight(@Valid @RequestBody Flight f) {
        return fdao.save(f);
    }
    
    @GetMapping("/{id}")
    public Optional<Flight> getFlightByID(@PathVariable Integer id) {
        return fdao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteFlightByID(@PathVariable Integer id) {
        fdao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllFlight() {
        fdao.deleteAll();
    }
}