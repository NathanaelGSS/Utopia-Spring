/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.PassengerDAO;
import com.nathanael.utopia.tables.Passenger;
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
@RequestMapping("/utopia/api/passengers")
public class PassengerController {
    
    @Autowired
    private PassengerDAO pdao;
    
    @GetMapping()
    public List<Passenger> getAllPassenger()  {
        return pdao.findAll();
    }
    
    @PostMapping()
    public Passenger createPassenger(@Valid @RequestBody Passenger p) {
        return pdao.save(p);
    }
    
    @GetMapping("/{id}")
    public Optional<Passenger> getPassengerByID(@PathVariable Integer id) {
        return pdao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deletePassengerByID(@PathVariable Integer id) {
        pdao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllPassenger() {
        pdao.deleteAll();
    }
}