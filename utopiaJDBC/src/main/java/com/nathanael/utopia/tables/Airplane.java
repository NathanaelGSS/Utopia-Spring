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
@Table(name = "airplane")
public class Airplane {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "type_id")
    private int typeID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }
    
}
