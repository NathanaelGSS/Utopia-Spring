/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.AirportDAO;
import com.nathanael.utopia.tables.Airport;
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
@RequestMapping("/utopia/api/airports")
public class AirportController {
    
    @Autowired
    private AirportDAO apdao;
    
    @GetMapping()
    public List<Airport> getAllAirport() {
        return apdao.findAll();
    }
    
    @PostMapping()
    public Airport createAirport(@Valid @RequestBody Airport ap) {
        return apdao.save(ap);
    }
    
    @GetMapping("/{id}")
    public Optional<Airport> getAirportByID(@PathVariable String id) {
        return apdao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteAirportByID(@PathVariable String id) {
        apdao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllAirport() {
        apdao.deleteAll();
    }
}