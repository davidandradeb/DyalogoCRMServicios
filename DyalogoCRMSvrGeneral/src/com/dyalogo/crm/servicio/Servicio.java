/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyalogo.crm.servicio;

import com.dyalogo.crm.servicios.general.Constantes;
import org.apache.log4j.Logger;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
public class Servicio extends Thread {
    
    protected static Logger log = Logger.getLogger(Servicio.class.getName());
    private static Boolean booActivo_t = true;
    
    @Override
    public void run() {
        while (booActivo_t) {
            
            try {
                sleep(Constantes.ESPERA_PRINCIPAL_C);
            } catch (Exception errika) {
                log.error("", errika);
            }
        }
    }
    
    public static void detener() {
        booActivo_t = false;
    }
    
}
