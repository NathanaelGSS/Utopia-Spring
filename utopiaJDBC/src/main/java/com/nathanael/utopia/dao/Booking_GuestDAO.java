/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.dao;

import com.nathanael.utopia.tables.Booking_Agent;
import com.nathanael.utopia.tables.Booking_Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Nathanael <Nathanael.Grier at your.org>
 */
@Repository
public interface Booking_GuestDAO extends JpaRepository<Booking_Guest, Integer> {
    
}
