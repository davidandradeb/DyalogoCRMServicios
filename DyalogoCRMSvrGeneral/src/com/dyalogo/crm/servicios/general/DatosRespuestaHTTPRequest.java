/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dyalogo.crm.servicios.general;

import java.util.Date;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
public class DatosRespuestaHTTPRequest {

    private Integer intCodiResp__t;
    private String strResultado_t = "SIN_RESPUESTA";
    private Date datIniLlaHtt_t, datFinLlaHtt_t;

    public Integer getIntCodiResp__t() {
        return intCodiResp__t;
    }

    public void setIntCodiResp__t(Integer intCodiResp__t) {
        this.intCodiResp__t = intCodiResp__t;
    }

    public String getStrResultado_t() {
        return strResultado_t;
    }

    public void setStrResultado_t(String strResultado_t) {
        this.strResultado_t = strResultado_t;
    }

    public Date getDatIniLlaHtt_t() {
        return datIniLlaHtt_t;
    }

    public void setDatIniLlaHtt_t(Date datIniLlaHtt_t) {
        this.datIniLlaHtt_t = datIniLlaHtt_t;
    }

    public Date getDatFinLlaHtt_t() {
        return datFinLlaHtt_t;
    }

    public void setDatFinLlaHtt_t(Date datFinLlaHtt_t) {
        this.datFinLlaHtt_t = datFinLlaHtt_t;
    }
    
    
}
