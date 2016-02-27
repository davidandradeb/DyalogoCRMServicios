/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyalogo.crm.servicios.bd.conexion;

import com.dyalogo.crm.servicios.general.Constantes;
import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.cfg.AvailableSettings;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
public class PersistenciaBD {

    protected static EntityManagerFactory emf = null;

    public static EntityManagerFactory getEMF() {
        if (emf == null) {
            Properties props = new Properties();
            props.put(AvailableSettings.USER, Constantes.CONFIGURACION_C.USUARIO_BD);
            props.put(AvailableSettings.PASS, Constantes.CONFIGURACION_C.PASSWORD_BD);
            props.put(AvailableSettings.DRIVER, Constantes.CONFIGURACION_C.DRIVER);
            if (Constantes.CONFIGURACION_C.DRIVER.contains("mysql")) {
                props.put(AvailableSettings.URL, "jdbc:mysql://" + Constantes.CONFIGURACION_C.IP_BASE_DATOS + ":"+Constantes.CONFIGURACION_C.PUERTO_BD+"/"+Constantes.CONFIGURACION_C.CATALOGO_BD);
            } else if (Constantes.CONFIGURACION_C.DRIVER.contains("sqlserver")) {
                props.put(AvailableSettings.URL, "jdbc:sqlserver://" + Constantes.CONFIGURACION_C.IP_BASE_DATOS + ":"+Constantes.CONFIGURACION_C.PUERTO_BD+"/"+Constantes.CONFIGURACION_C.CATALOGO_BD);
            }
            
            emf = Persistence.createEntityManagerFactory("DyalogoCRMSvrGeneralPU", props);
        }

        return emf;
    }
    
    public static void cerrarEMF(){
        emf.close();
    }

}
