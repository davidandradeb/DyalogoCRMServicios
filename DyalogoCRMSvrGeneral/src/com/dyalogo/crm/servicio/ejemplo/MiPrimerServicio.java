/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyalogo.crm.servicio.ejemplo;

import com.dyalogo.crm.servicios.bd.dao_general.ExcepcionBd;
import com.dyalogo.crm.servicios.bd.tablas.Asidim;
import com.dyalogo.crm.servicios.bd.tablas.Emarec;
import com.dyalogo.crm.servicios.config.Configuracion;
import com.dyalogo.crm.servicios.dao.DAOAsidim;
import com.dyalogo.crm.servicios.dao.DAOEmarec;
import com.dyalogo.crm.servicios.general.Constantes;
import java.util.List;
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

        log.info("Hilo principal iniciado");

        ///ACA VA EL ARRANQUE DEL HILO DE LOS METODOS DE LA APLICACION
    }

    public static void main(String[] args) throws InterruptedException, ExcepcionBd {
        MiPrimerServicio servicio = new MiPrimerServicio();
        DAOEmarec daoEmarec_t = new DAOEmarec();
        DAOAsidim daoAsidim_t = new DAOAsidim();
        List<Object> lstMuestra_t;
        Object[] objFila_t;

        try {
            Constantes.CONFIGURACION_C = new Configuracion(MiPrimerServicio.class);
        } catch (Exception e) {
            log.error("", e);
        }

        while (true) {
            try {

//                try {
//                    lstMuestra_t = daoEmarec_t.getDatosConsultaNativa("SELECT * FROM G192_M115");
//
//                    for (Object fila : lstMuestra_t) {
//                        objFila_t = (Object[]) fila;
//
//                        System.out.println("Consinte: " + objFila_t[0]);
//                    }
//                } catch (ExcepcionBd e) {
//                    log.error("");
//                }
                for (Asidim asignacion : daoAsidim_t.getTodos()) {
                    System.out.println("Consinte: " + asignacion.getASIDIMConsInteb());
                }

                sleep(Constantes.ESPERA_PRINCIPAL_C);
            } catch (InterruptedException ex) {
                log.error("", ex);
            }
        }

    }

}
