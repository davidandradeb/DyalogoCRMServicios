/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyalogo.crm.servicios.config;

import com.dyalogo.crm.servicios.general.UtilidadesArchivos;
import com.dyalogo.crm.servicios.seguridad.EncriptadorPropio;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
public final class Configuracion {

    //CAMBIAR
    public String IP_BASE_DATOS = "";
    public String DRIVER = "";
    public String USUARIO_BD = "";
    public String PASSWORD_BD = "";
    public String CATALOGO_BD = "";
    public int PUERTO_BD = 1433;
    
    private final Class clasePrograma;

    public Configuracion(Class clasePrograma) throws Exception {
        this.clasePrograma = clasePrograma;
        leerConfiguracion();
    }
    
    

    public void leerConfiguracion() throws Exception {
        try {

            EncriptadorPropio seguridad = new EncriptadorPropio();
            Properties proConfigura_t;

            String strContenidoArchivo_t = seguridad.decrypt(UtilidadesArchivos.contenidoArchivo(UtilidadesArchivos.pathAplicacion(clasePrograma) + "/cfg.properties"));
            proConfigura_t = new Properties();
            proConfigura_t.load(new ByteArrayInputStream(strContenidoArchivo_t.getBytes()));

            //Obtencion de parametros CAMBIAR
            IP_BASE_DATOS = proConfigura_t.getProperty("ipbd");
            USUARIO_BD = proConfigura_t.getProperty("user");
            PASSWORD_BD = proConfigura_t.getProperty("pwd");
            PUERTO_BD = Integer.parseInt(proConfigura_t.getProperty("puerto"));
            DRIVER = proConfigura_t.getProperty("driver");
            CATALOGO_BD = proConfigura_t.getProperty("catalogo");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

    public String getIP_BASE_DATOS() {
        return IP_BASE_DATOS;
    }

    public void setIP_BASE_DATOS(String IP_BASE_DATOS) {
        this.IP_BASE_DATOS = IP_BASE_DATOS;
    }

    public String getUSUARIO_BD() {
        return USUARIO_BD;
    }

    public void setUSUARIO_BD(String USUARIO_BD) {
        this.USUARIO_BD = USUARIO_BD;
    }

    public String getPASSWORD_BD() {
        return PASSWORD_BD;
    }

    public void setPASSWORD_BD(String PASSWORD_BD) {
        this.PASSWORD_BD = PASSWORD_BD;
    }

    public int getPUERTO_BD() {
        return PUERTO_BD;
    }

    public void setPUERTO_BD(int PUERTO_BD) {
        this.PUERTO_BD = PUERTO_BD;
    }

    public String getDRIVER() {
        return DRIVER;
    }

    public void setDRIVER(String DRIVER) {
        this.DRIVER = DRIVER;
    }

    public String getCATALOGO_BD() {
        return CATALOGO_BD;
    }

    public void setCATALOGO_BD(String CATALOGO_BD) {
        this.CATALOGO_BD = CATALOGO_BD;
    }

}
