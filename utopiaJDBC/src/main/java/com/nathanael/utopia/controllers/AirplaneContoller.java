/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.AirplaneDAO;
import com.nathanael.utopia.tables.Airplane;
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
@RestController//Also tried Service and Component
@RequestMapping("/utopia/api/airplanes")
public class AirplaneContoller {

    @Autowired
    private AirplaneDAO adao;

    @GetMapping()
    public List<Airplane> getAllAirplane() {
        return adao.findAll();
    }

    @PostMapping()
    public Airplane createPlane(@Valid @RequestBody Airplane a) {
        return adao.save(a);
    }
    
    @GetMapping("/{id}")
    public Optional<Airplane> getAirplaneByID(@PathVariable Integer id) {
        return adao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteAirplaneByID(@PathVariable Integer id) {
        adao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllAirplane() {
        adao.deleteAll();
    }

}
