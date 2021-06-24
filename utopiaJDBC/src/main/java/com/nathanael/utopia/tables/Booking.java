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
@Table(name = "booking")
public class Booking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "is_active")
    private int isActive;//likely to be boolean
    @Column(name = "confirmation_code")
    private String confirmCode;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode;
    }
    
}
