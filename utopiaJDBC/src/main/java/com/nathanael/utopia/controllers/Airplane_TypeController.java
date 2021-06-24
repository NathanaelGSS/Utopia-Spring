/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.Airplane_TypeDAO;
import com.nathanael.utopia.tables.Airplane_Type;
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
@RequestMapping("/utopia/api/airplane_types")
public class Airplane_TypeController {
    
    @Autowired
    private Airplane_TypeDAO atdao;
    
    @GetMapping()
    public List<Airplane_Type> getAllAirplane_Type() {
        return atdao.findAll();
    }
    
    @PostMapping()
    public Airplane_Type createAirplane_Type(@Valid @RequestBody Airplane_Type at) {
        return atdao.save(at);
    }
    
    @GetMapping("/{id}")
    public Optional<Airplane_Type> getAirplane_TypeByID(@PathVariable Integer id) {
        return atdao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteAirplane_TypeByID(@PathVariable Integer id) {
        atdao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllAirplane_Type() {
        atdao.deleteAll();
    }
}
    

