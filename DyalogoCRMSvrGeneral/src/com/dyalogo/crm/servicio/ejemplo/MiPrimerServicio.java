/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyalogo.crm.servicio.ejemplo;

import com.dyalogo.crm.servicios.bd.conexion.PersistenciaBD;
import com.dyalogo.crm.servicios.config.Configuracion;
import com.dyalogo.crm.servicios.general.Constantes;
import org.apache.log4j.Logger;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
public class MiPrimerServicio extends Thread {
    
    private static Logger log = Logger.getLogger(MiPrimerServicio.class.getName());
    
    public MiPrimerServicio() {
        start();
    }
    
    @Override
    public void run() {
        try {
            Constantes.CONFIGURACION_C = new Configuracion(MiPrimerServicio.class);
        } catch (Exception e) {
            log.error("", e);
        }
        log.info("Hilo principal iniciado");

        ///ACA VA EL ARRANQUE DEL HILO DE LOS METODOS DE LA APLICACION
    }
    
    public static void main(String[] args) throws InterruptedException {
        MiPrimerServicio servicio = new MiPrimerServicio();
        
        while (true) {
            try {
                sleep(Constantes.ESPERA_PRINCIPAL_C);
            } catch (InterruptedException ex) {
                log.error("", ex);
            }
        }
        
       
    }
    
}
