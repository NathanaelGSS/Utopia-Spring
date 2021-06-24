/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nathanael.utopia.dao;

import com.nathanael.utopia.tables.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Nathanael <Nathanael.Grier at your.org>
 */
@Repository
public interface RouteDAO extends JpaRepository<Route, Integer> {
    
}
