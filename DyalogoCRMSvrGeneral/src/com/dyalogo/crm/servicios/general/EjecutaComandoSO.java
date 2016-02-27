/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dyalogo.crm.servicios.general;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
public class EjecutaComandoSO {

    public static String ejecutar(String comando) throws IOException, InterruptedException {
        Scanner objScaResPin_t;
        Process objProCmdPin_t;
        String strLineaResp_t = "";

        try {
            objProCmdPin_t = Runtime.getRuntime().exec(comando);
            objProCmdPin_t.waitFor();
            objScaResPin_t = new Scanner(objProCmdPin_t.getInputStream());

            while (objScaResPin_t.hasNextLine()) {
                strLineaResp_t += objScaResPin_t.nextLine() + "\n";
            }
            objScaResPin_t.close();
        } finally {
            objScaResPin_t = null;
            objProCmdPin_t = null;
        }

        return strLineaResp_t;
    }

}
