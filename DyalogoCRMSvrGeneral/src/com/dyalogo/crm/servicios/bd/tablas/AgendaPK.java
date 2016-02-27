/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dyalogo.crm.servicios.bd.tablas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
@Embeddable
public class AgendaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "AGENDA_ConsInte__GUION__Gui_b", nullable = false)
    private int aGENDAConsInteGUIONGuib;
    @Basic(optional = false)
    @Column(name = "AGENDA_ConsInte__GUION__Pob_b", nullable = false)
    private int aGENDAConsInteGUIONPobb;
    @Basic(optional = false)
    @Column(name = "AGENDA_ConsInte__MUESTR_b", nullable = false)
    private int aGENDAConsInteMUESTRb;
    @Basic(optional = false)
    @Column(name = "AGENDA_CodiMiem__b", nullable = false)
    private int aGENDACodiMiemb;

    public AgendaPK() {
    }

    public AgendaPK(int aGENDAConsInteGUIONGuib, int aGENDAConsInteGUIONPobb, int aGENDAConsInteMUESTRb, int aGENDACodiMiemb) {
        this.aGENDAConsInteGUIONGuib = aGENDAConsInteGUIONGuib;
        this.aGENDAConsInteGUIONPobb = aGENDAConsInteGUIONPobb;
        this.aGENDAConsInteMUESTRb = aGENDAConsInteMUESTRb;
        this.aGENDACodiMiemb = aGENDACodiMiemb;
    }

    public int getAGENDAConsInteGUIONGuib() {
        return aGENDAConsInteGUIONGuib;
    }

    public void setAGENDAConsInteGUIONGuib(int aGENDAConsInteGUIONGuib) {
        this.aGENDAConsInteGUIONGuib = aGENDAConsInteGUIONGuib;
    }

    public int getAGENDAConsInteGUIONPobb() {
        return aGENDAConsInteGUIONPobb;
    }

    public void setAGENDAConsInteGUIONPobb(int aGENDAConsInteGUIONPobb) {
        this.aGENDAConsInteGUIONPobb = aGENDAConsInteGUIONPobb;
    }

    public int getAGENDAConsInteMUESTRb() {
        return aGENDAConsInteMUESTRb;
    }

    public void setAGENDAConsInteMUESTRb(int aGENDAConsInteMUESTRb) {
        this.aGENDAConsInteMUESTRb = aGENDAConsInteMUESTRb;
    }

    public int getAGENDACodiMiemb() {
        return aGENDACodiMiemb;
    }

    public void setAGENDACodiMiemb(int aGENDACodiMiemb) {
        this.aGENDACodiMiemb = aGENDACodiMiemb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) aGENDAConsInteGUIONGuib;
        hash += (int) aGENDAConsInteGUIONPobb;
        hash += (int) aGENDAConsInteMUESTRb;
        hash += (int) aGENDACodiMiemb;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgendaPK)) {
            return false;
        }
        AgendaPK other = (AgendaPK) object;
        if (this.aGENDAConsInteGUIONGuib != other.aGENDAConsInteGUIONGuib) {
            return false;
        }
        if (this.aGENDAConsInteGUIONPobb != other.aGENDAConsInteGUIONPobb) {
            return false;
        }
        if (this.aGENDAConsInteMUESTRb != other.aGENDAConsInteMUESTRb) {
            return false;
        }
        if (this.aGENDACodiMiemb != other.aGENDACodiMiemb) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicios.bd.tablas.AgendaPK[ aGENDAConsInteGUIONGuib=" + aGENDAConsInteGUIONGuib + ", aGENDAConsInteGUIONPobb=" + aGENDAConsInteGUIONPobb + ", aGENDAConsInteMUESTRb=" + aGENDAConsInteMUESTRb + ", aGENDACodiMiemb=" + aGENDACodiMiemb + " ]";
    }

}
