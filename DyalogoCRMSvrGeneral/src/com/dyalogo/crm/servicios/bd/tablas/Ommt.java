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
@Table(name = "OMMT__", catalog = "DYALOGOCRM", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ommt.findAll", query = "SELECT o FROM Ommt o"),
    @NamedQuery(name = "Ommt.findByOMMTConsInteb", query = "SELECT o FROM Ommt o WHERE o.oMMTConsInteb = :oMMTConsInteb"),
    @NamedQuery(name = "Ommt.findByOMMT1b", query = "SELECT o FROM Ommt o WHERE o.oMMT1b = :oMMT1b"),
    @NamedQuery(name = "Ommt.findByOMMT2b", query = "SELECT o FROM Ommt o WHERE o.oMMT2b = :oMMT2b"),
    @NamedQuery(name = "Ommt.findByOMMT3b", query = "SELECT o FROM Ommt o WHERE o.oMMT3b = :oMMT3b"),
    @NamedQuery(name = "Ommt.findByOMMT4b", query = "SELECT o FROM Ommt o WHERE o.oMMT4b = :oMMT4b")})
public class Ommt extends ImpEntidadBase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OMMT___ConsInte__b")
    private Integer oMMTConsInteb;
    @Column(name = "OMMT___1_________b")
    private String oMMT1b;
    @Column(name = "OMMT___2_________b")
    private String oMMT2b;
    @Column(name = "OMMT___3_________b")
    private String oMMT3b;
    @Column(name = "OMMT___4_________b")
    private String oMMT4b;

    public Ommt() {
    }

    public Ommt(Integer oMMTConsInteb) {
        this.oMMTConsInteb = oMMTConsInteb;
    }

    public Integer getOMMTConsInteb() {
        return oMMTConsInteb;
    }

    public void setOMMTConsInteb(Integer oMMTConsInteb) {
        this.oMMTConsInteb = oMMTConsInteb;
    }

    public String getOMMT1b() {
        return oMMT1b;
    }

    public void setOMMT1b(String oMMT1b) {
        this.oMMT1b = oMMT1b;
    }

    public String getOMMT2b() {
        return oMMT2b;
    }

    public void setOMMT2b(String oMMT2b) {
        this.oMMT2b = oMMT2b;
    }

    public String getOMMT3b() {
        return oMMT3b;
    }

    public void setOMMT3b(String oMMT3b) {
        this.oMMT3b = oMMT3b;
    }

    public String getOMMT4b() {
        return oMMT4b;
    }

    public void setOMMT4b(String oMMT4b) {
        this.oMMT4b = oMMT4b;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oMMTConsInteb != null ? oMMTConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ommt)) {
            return false;
        }
        Ommt other = (Ommt) object;
        if ((this.oMMTConsInteb == null && other.oMMTConsInteb != null) || (this.oMMTConsInteb != null && !this.oMMTConsInteb.equals(other.oMMTConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicio.ejemplo.Ommt[ oMMTConsInteb=" + oMMTConsInteb + " ]";
    }

}
