/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dyalogo.crm.servicios.bd.tablas;

import com.dyalogo.crm.servicios.bd.dao_general.ImpEntidadBase;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
@Entity
@Table(name = "ASIDIM", catalog = "DYALOGOCRM", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asidim.findAll", query = "SELECT a FROM Asidim a"),
    @NamedQuery(name = "Asidim.findByASIDIMConsInteb", query = "SELECT a FROM Asidim a WHERE a.aSIDIMConsInteb = :aSIDIMConsInteb"),
    @NamedQuery(name = "Asidim.findByASIDIMConsInteGUIONPobb", query = "SELECT a FROM Asidim a WHERE a.aSIDIMConsInteGUIONPobb = :aSIDIMConsInteGUIONPobb"),
    @NamedQuery(name = "Asidim.findByASIDIMConsInteMUESTRb", query = "SELECT a FROM Asidim a WHERE a.aSIDIMConsInteMUESTRb = :aSIDIMConsInteMUESTRb"),
    @NamedQuery(name = "Asidim.findByASIDIMConsInteUSUARIb", query = "SELECT a FROM Asidim a WHERE a.aSIDIMConsInteUSUARIb = :aSIDIMConsInteUSUARIb"),
    @NamedQuery(name = "Asidim.findByASIDIMEstaAsigb", query = "SELECT a FROM Asidim a WHERE a.aSIDIMEstaAsigb = :aSIDIMEstaAsigb"),
    @NamedQuery(name = "Asidim.findByASIDIMConsInteCAMPANb", query = "SELECT a FROM Asidim a WHERE a.aSIDIMConsInteCAMPANb = :aSIDIMConsInteCAMPANb")})
public class Asidim extends ImpEntidadBase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ASIDIM_ConsInte__b")
    private Integer aSIDIMConsInteb;
    @Column(name = "ASIDIM_ConsInte__GUION__Pob_b")
    private Integer aSIDIMConsInteGUIONPobb;
    @Column(name = "ASIDIM_ConsInte__MUESTR_b")
    private Integer aSIDIMConsInteMUESTRb;
    @Column(name = "ASIDIM_ConsInte__USUARI_b")
    private Integer aSIDIMConsInteUSUARIb;
    @Column(name = "ASIDIM_EstaAsig__b")
    private Integer aSIDIMEstaAsigb;
    @Column(name = "ASIDIM_ConsInte__CAMPAN_b")
    private Integer aSIDIMConsInteCAMPANb;

    public Asidim() {
    }

    public Asidim(Integer aSIDIMConsInteb) {
        this.aSIDIMConsInteb = aSIDIMConsInteb;
    }

    public Integer getASIDIMConsInteb() {
        return aSIDIMConsInteb;
    }

    public void setASIDIMConsInteb(Integer aSIDIMConsInteb) {
        this.aSIDIMConsInteb = aSIDIMConsInteb;
    }

    public Integer getASIDIMConsInteGUIONPobb() {
        return aSIDIMConsInteGUIONPobb;
    }

    public void setASIDIMConsInteGUIONPobb(Integer aSIDIMConsInteGUIONPobb) {
        this.aSIDIMConsInteGUIONPobb = aSIDIMConsInteGUIONPobb;
    }

    public Integer getASIDIMConsInteMUESTRb() {
        return aSIDIMConsInteMUESTRb;
    }

    public void setASIDIMConsInteMUESTRb(Integer aSIDIMConsInteMUESTRb) {
        this.aSIDIMConsInteMUESTRb = aSIDIMConsInteMUESTRb;
    }

    public Integer getASIDIMConsInteUSUARIb() {
        return aSIDIMConsInteUSUARIb;
    }

    public void setASIDIMConsInteUSUARIb(Integer aSIDIMConsInteUSUARIb) {
        this.aSIDIMConsInteUSUARIb = aSIDIMConsInteUSUARIb;
    }

    public Integer getASIDIMEstaAsigb() {
        return aSIDIMEstaAsigb;
    }

    public void setASIDIMEstaAsigb(Integer aSIDIMEstaAsigb) {
        this.aSIDIMEstaAsigb = aSIDIMEstaAsigb;
    }

    public Integer getASIDIMConsInteCAMPANb() {
        return aSIDIMConsInteCAMPANb;
    }

    public void setASIDIMConsInteCAMPANb(Integer aSIDIMConsInteCAMPANb) {
        this.aSIDIMConsInteCAMPANb = aSIDIMConsInteCAMPANb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aSIDIMConsInteb != null ? aSIDIMConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asidim)) {
            return false;
        }
        Asidim other = (Asidim) object;
        if ((this.aSIDIMConsInteb == null && other.aSIDIMConsInteb != null) || (this.aSIDIMConsInteb != null && !this.aSIDIMConsInteb.equals(other.aSIDIMConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicio.ejemplo.Asidim[ aSIDIMConsInteb=" + aSIDIMConsInteb + " ]";
    }

}
