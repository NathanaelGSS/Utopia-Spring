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
@Table(name = "flight")
public class Flight {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;
    @Column(name = "route_id")
    private int routeID;
    @Column(name = "airplane_id")
    private int airplaneID;
    @Column(name = "departure_time")
    private int departureTime;
    @Column(name = "reserved_seats")
    private int reservedSeats;
    @Column(name = "seat_price")
    private float seatPrice;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public int getAirplaneID() {
        return airplaneID;
    }

    public void setAirplaneID(int airplaneID) {
        this.airplaneID = airplaneID;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public float getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(float seatPrice) {
        this.seatPrice = seatPrice;
    }

    @Override
    public String toString() {
        return "Flight{" + "ID=" + ID + ", routeID=" + routeID + ", airplaneID=" + airplaneID + ", departureTime=" + departureTime + ", reservedSeats=" + reservedSeats + ", seatPrice=" + seatPrice + '}';
    }
    
    
}
