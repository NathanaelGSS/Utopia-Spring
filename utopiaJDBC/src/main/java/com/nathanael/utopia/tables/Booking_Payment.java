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
@Table(name = "booking_payment")
public class Booking_Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int bookingID;
    @Column(name = "stripe_id")
    private String stripeID;
    @Column(name = "refunded")
    private int refunded;

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getStripeID() {
        return stripeID;
    }

    public void setStripeID(String stripeID) {
        this.stripeID = stripeID;
    }

    public int getRefunded() {
        return refunded;
    }

    public void setRefunded(int refunded) {
        this.refunded = refunded;
    }
    
}
