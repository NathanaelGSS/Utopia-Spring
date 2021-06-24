/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.controllers;

import com.nathanael.utopia.dao.Booking_PaymentDAO;
import com.nathanael.utopia.tables.Booking_Payment;
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
@RequestMapping("/utopia/api/booking_payments")
public class Booking_PaymentController {
    
    @Autowired
    private Booking_PaymentDAO bpdao;
    
    @GetMapping()
    public List<Booking_Payment> getAllBooking_Payment()  {
        return bpdao.findAll();
    }
    
    @PostMapping()
    public Booking_Payment createBooking_Payment(@Valid @RequestBody Booking_Payment bp) {
        return bpdao.save(bp);
    }
    
    @GetMapping("/{id}")
    public Optional<Booking_Payment> getBooking_PaymentByID(@PathVariable Integer id) {
        return bpdao.findById(id);
    }
    
    @GetMapping("/remove/{id}")
    public void deleteBooking_PaymentByID(@PathVariable Integer id) {
        bpdao.deleteById(id);
    }
    
    @GetMapping("/truncate")
    public void deleteAllBooking_Payment() {
        bpdao.deleteAll();
    }
}