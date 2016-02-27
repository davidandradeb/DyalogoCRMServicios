/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dyalogo.crm.servicios.dao;

import com.dyalogo.crm.servicios.bd.dao_general.DAOImpOperaciones;
import com.dyalogo.crm.servicios.bd.tablas.Agenda;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
public class DAOAgenda extends DAOImpOperaciones<Agenda>{

    public DAOAgenda() {
        super(Agenda.class);
    }

}
