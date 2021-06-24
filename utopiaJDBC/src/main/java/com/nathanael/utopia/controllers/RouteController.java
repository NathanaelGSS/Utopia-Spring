/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.RouteDAO;
import com.nathanael.utopia.tables.Route;
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
@RequestMapping("/utopia/api/routes")
public class RouteController {
    
    @Autowired
    private RouteDAO rdao;
    
    @GetMapping()
    public List<Route> getAllRoute()  {
        return rdao.findAll();
    }
    
    @PostMapping()
    public Route createRoute(@Valid @RequestBody Route r) {
        return rdao.save(r);
    }
    
    @GetMapping("/{id}")
    public Optional<Route> getRouteByID(@PathVariable Integer id) {
        return rdao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteRouteByID(@PathVariable Integer id) {
        rdao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllRoute() {
        rdao.deleteAll();
    }
}