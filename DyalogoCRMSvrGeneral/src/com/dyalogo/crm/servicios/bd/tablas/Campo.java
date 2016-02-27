/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dyalogo.crm.servicios.bd.tablas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
@Entity
@Table(name = "campo_", catalog = "DYALOGOCRM", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"CAMPO__ConsInte__PREGUN_b"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campo.findAll", query = "SELECT c FROM Campo c"),
    @NamedQuery(name = "Campo.findByCAMPOConsInteb", query = "SELECT c FROM Campo c WHERE c.cAMPOConsInteb = :cAMPOConsInteb"),
    @NamedQuery(name = "Campo.findByCAMPONombreb", query = "SELECT c FROM Campo c WHERE c.cAMPONombreb = :cAMPONombreb"),
    @NamedQuery(name = "Campo.findByCAMPOTipob", query = "SELECT c FROM Campo c WHERE c.cAMPOTipob = :cAMPOTipob"),
    @NamedQuery(name = "Campo.findByCAMPOIndiRequb", query = "SELECT c FROM Campo c WHERE c.cAMPOIndiRequb = :cAMPOIndiRequb"),
    @NamedQuery(name = "Campo.findByCAMPOIndiUnicb", query = "SELECT c FROM Campo c WHERE c.cAMPOIndiUnicb = :cAMPOIndiUnicb"),
    @NamedQuery(name = "Campo.findByCAMPOIndTipModb", query = "SELECT c FROM Campo c WHERE c.cAMPOIndTipModb = :cAMPOIndTipModb"),
    @NamedQuery(name = "Campo.findByCAMPOIndCamProb", query = "SELECT c FROM Campo c WHERE c.cAMPOIndCamProb = :cAMPOIndCamProb"),
    @NamedQuery(name = "Campo.findByCAMPOInCaTiCab", query = "SELECT c FROM Campo c WHERE c.cAMPOInCaTiCab = :cAMPOInCaTiCab"),
    @NamedQuery(name = "Campo.findByCAMPOInCaInUnb", query = "SELECT c FROM Campo c WHERE c.cAMPOInCaInUnb = :cAMPOInCaInUnb")})
public class Campo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CAMPO__ConsInte__b", nullable = false)
    private Integer cAMPOConsInteb;
    @Column(name = "CAMPO__Nombre____b", length = 50)
    private String cAMPONombreb;
    @Column(name = "CAMPO__Tipo______b", length = 50)
    private String cAMPOTipob;
    @Basic(optional = false)
    @Column(name = "CAMPO__IndiRequ__b", nullable = false)
    private short cAMPOIndiRequb;
    @Basic(optional = false)
    @Column(name = "CAMPO__IndiUnic__b", nullable = false)
    private short cAMPOIndiUnicb;
    @Column(name = "CAMPO__IndTipMod_b")
    private Short cAMPOIndTipModb;
    @Basic(optional = false)
    @Column(name = "CAMPO__IndCamPro_b", nullable = false)
    private short cAMPOIndCamProb;
    @Basic(optional = false)
    @Column(name = "CAMPO__InCaTiCa__b", nullable = false)
    private short cAMPOInCaTiCab;
    @Basic(optional = false)
    @Column(name = "CAMPO__InCaInUn__b", nullable = false)
    private short cAMPOInCaInUnb;
    @JoinColumn(name = "CAMPO__ConsInte__PREGUN_b", referencedColumnName = "PREGUN_ConsInte__b")
    @OneToOne
    private Pregun cAMPOConsIntePREGUNb;

    public Campo() {
    }

    public Campo(Integer cAMPOConsInteb) {
        this.cAMPOConsInteb = cAMPOConsInteb;
    }

    public Campo(Integer cAMPOConsInteb, short cAMPOIndiRequb, short cAMPOIndiUnicb, short cAMPOIndCamProb, short cAMPOInCaTiCab, short cAMPOInCaInUnb) {
        this.cAMPOConsInteb = cAMPOConsInteb;
        this.cAMPOIndiRequb = cAMPOIndiRequb;
        this.cAMPOIndiUnicb = cAMPOIndiUnicb;
        this.cAMPOIndCamProb = cAMPOIndCamProb;
        this.cAMPOInCaTiCab = cAMPOInCaTiCab;
        this.cAMPOInCaInUnb = cAMPOInCaInUnb;
    }

    public Integer getCAMPOConsInteb() {
        return cAMPOConsInteb;
    }

    public void setCAMPOConsInteb(Integer cAMPOConsInteb) {
        this.cAMPOConsInteb = cAMPOConsInteb;
    }

    public String getCAMPONombreb() {
        return cAMPONombreb;
    }

    public void setCAMPONombreb(String cAMPONombreb) {
        this.cAMPONombreb = cAMPONombreb;
    }

    public String getCAMPOTipob() {
        return cAMPOTipob;
    }

    public void setCAMPOTipob(String cAMPOTipob) {
        this.cAMPOTipob = cAMPOTipob;
    }

    public short getCAMPOIndiRequb() {
        return cAMPOIndiRequb;
    }

    public void setCAMPOIndiRequb(short cAMPOIndiRequb) {
        this.cAMPOIndiRequb = cAMPOIndiRequb;
    }

    public short getCAMPOIndiUnicb() {
        return cAMPOIndiUnicb;
    }

    public void setCAMPOIndiUnicb(short cAMPOIndiUnicb) {
        this.cAMPOIndiUnicb = cAMPOIndiUnicb;
    }

    public Short getCAMPOIndTipModb() {
        return cAMPOIndTipModb;
    }

    public void setCAMPOIndTipModb(Short cAMPOIndTipModb) {
        this.cAMPOIndTipModb = cAMPOIndTipModb;
    }

    public short getCAMPOIndCamProb() {
        return cAMPOIndCamProb;
    }

    public void setCAMPOIndCamProb(short cAMPOIndCamProb) {
        this.cAMPOIndCamProb = cAMPOIndCamProb;
    }

    public short getCAMPOInCaTiCab() {
        return cAMPOInCaTiCab;
    }

    public void setCAMPOInCaTiCab(short cAMPOInCaTiCab) {
        this.cAMPOInCaTiCab = cAMPOInCaTiCab;
    }

    public short getCAMPOInCaInUnb() {
        return cAMPOInCaInUnb;
    }

    public void setCAMPOInCaInUnb(short cAMPOInCaInUnb) {
        this.cAMPOInCaInUnb = cAMPOInCaInUnb;
    }

    public Pregun getCAMPOConsIntePREGUNb() {
        return cAMPOConsIntePREGUNb;
    }

    public void setCAMPOConsIntePREGUNb(Pregun cAMPOConsIntePREGUNb) {
        this.cAMPOConsIntePREGUNb = cAMPOConsIntePREGUNb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cAMPOConsInteb != null ? cAMPOConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campo)) {
            return false;
        }
        Campo other = (Campo) object;
        if ((this.cAMPOConsInteb == null && other.cAMPOConsInteb != null) || (this.cAMPOConsInteb != null && !this.cAMPOConsInteb.equals(other.cAMPOConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicios.bd.tablas.Campo[ cAMPOConsInteb=" + cAMPOConsInteb + " ]";
    }

}
