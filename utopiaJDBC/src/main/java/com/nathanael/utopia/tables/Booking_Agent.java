/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author Nathanael <Nathanael.Grier at your.org>
 */
@Entity
@Table(name = "booking_agent")
public class Booking_Agent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingID;
    @Column(name = "agent_id")
    private int agentID;

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agenrID) {
        this.agentID = agenrID;
    }
    
}
