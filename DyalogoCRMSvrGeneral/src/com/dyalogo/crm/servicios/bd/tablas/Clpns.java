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
@Table(name = "CLPNS_", catalog = "DYALOGOCRM", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clpns.findAll", query = "SELECT c FROM Clpns c"),
    @NamedQuery(name = "Clpns.findByCLPNSConsInteb", query = "SELECT c FROM Clpns c WHERE c.cLPNSConsInteb = :cLPNSConsInteb"),
    @NamedQuery(name = "Clpns.findByCLPNSIdeTipLicb", query = "SELECT c FROM Clpns c WHERE c.cLPNSIdeTipLicb = :cLPNSIdeTipLicb"),
    @NamedQuery(name = "Clpns.findByCLPNSNoInApReb", query = "SELECT c FROM Clpns c WHERE c.cLPNSNoInApReb = :cLPNSNoInApReb"),
    @NamedQuery(name = "Clpns.findByCLPNSNomAplRegb", query = "SELECT c FROM Clpns c WHERE c.cLPNSNomAplRegb = :cLPNSNomAplRegb"),
    @NamedQuery(name = "Clpns.findByCLPNSVerAplRegb", query = "SELECT c FROM Clpns c WHERE c.cLPNSVerAplRegb = :cLPNSVerAplRegb"),
    @NamedQuery(name = "Clpns.findByCLPNSTipLicAplb", query = "SELECT c FROM Clpns c WHERE c.cLPNSTipLicAplb = :cLPNSTipLicAplb"),
    @NamedQuery(name = "Clpns.findByCLPNSAnVeLiApb", query = "SELECT c FROM Clpns c WHERE c.cLPNSAnVeLiApb = :cLPNSAnVeLiApb"),
    @NamedQuery(name = "Clpns.findByCLPNSMeVeLiApb", query = "SELECT c FROM Clpns c WHERE c.cLPNSMeVeLiApb = :cLPNSMeVeLiApb"),
    @NamedQuery(name = "Clpns.findByCLPNSDiVeLiApb", query = "SELECT c FROM Clpns c WHERE c.cLPNSDiVeLiApb = :cLPNSDiVeLiApb"),
    @NamedQuery(name = "Clpns.findByCLPNSLiRePaApb", query = "SELECT c FROM Clpns c WHERE c.cLPNSLiRePaApb = :cLPNSLiRePaApb"),
    @NamedQuery(name = "Clpns.findByCLPNSMaRePaLib", query = "SELECT c FROM Clpns c WHERE c.cLPNSMaRePaLib = :cLPNSMaRePaLib"),
    @NamedQuery(name = "Clpns.findByCLPNSMaRePaSeb", query = "SELECT c FROM Clpns c WHERE c.cLPNSMaRePaSeb = :cLPNSMaRePaSeb"),
    @NamedQuery(name = "Clpns.findByCLPNSNoClDeLib", query = "SELECT c FROM Clpns c WHERE c.cLPNSNoClDeLib = :cLPNSNoClDeLib")})
public class Clpns extends ImpEntidadBase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CLPNS__ConsInte__b")
    private Integer cLPNSConsInteb;
    @Basic(optional = false)
    @Column(name = "CLPNS__IdeTipLic_b")
    private int cLPNSIdeTipLicb;
    @Column(name = "CLPNS__NoInApRe__b")
    private String cLPNSNoInApReb;
    @Column(name = "CLPNS__NomAplReg_b")
    private String cLPNSNomAplRegb;
    @Column(name = "CLPNS__VerAplReg_b")
    private String cLPNSVerAplRegb;
    @Column(name = "CLPNS__TipLicApl_b")
    private String cLPNSTipLicAplb;
    @Column(name = "CLPNS__AnVeLiAp__b")
    private String cLPNSAnVeLiApb;
    @Column(name = "CLPNS__MeVeLiAp__b")
    private String cLPNSMeVeLiApb;
    @Column(name = "CLPNS__DiVeLiAp__b")
    private String cLPNSDiVeLiApb;
    @Column(name = "CLPNS__LiRePaAp__b")
    private String cLPNSLiRePaApb;
    @Column(name = "CLPNS__MaRePaLi__b")
    private String cLPNSMaRePaLib;
    @Column(name = "CLPNS__MaRePaSe__b")
    private String cLPNSMaRePaSeb;
    @Column(name = "CLPNS__NoClDeLi__b")
    private String cLPNSNoClDeLib;

    public Clpns() {
    }

    public Clpns(Integer cLPNSConsInteb) {
        this.cLPNSConsInteb = cLPNSConsInteb;
    }

    public Clpns(Integer cLPNSConsInteb, int cLPNSIdeTipLicb) {
        this.cLPNSConsInteb = cLPNSConsInteb;
        this.cLPNSIdeTipLicb = cLPNSIdeTipLicb;
    }

    public Integer getCLPNSConsInteb() {
        return cLPNSConsInteb;
    }

    public void setCLPNSConsInteb(Integer cLPNSConsInteb) {
        this.cLPNSConsInteb = cLPNSConsInteb;
    }

    public int getCLPNSIdeTipLicb() {
        return cLPNSIdeTipLicb;
    }

    public void setCLPNSIdeTipLicb(int cLPNSIdeTipLicb) {
        this.cLPNSIdeTipLicb = cLPNSIdeTipLicb;
    }

    public String getCLPNSNoInApReb() {
        return cLPNSNoInApReb;
    }

    public void setCLPNSNoInApReb(String cLPNSNoInApReb) {
        this.cLPNSNoInApReb = cLPNSNoInApReb;
    }

    public String getCLPNSNomAplRegb() {
        return cLPNSNomAplRegb;
    }

    public void setCLPNSNomAplRegb(String cLPNSNomAplRegb) {
        this.cLPNSNomAplRegb = cLPNSNomAplRegb;
    }

    public String getCLPNSVerAplRegb() {
        return cLPNSVerAplRegb;
    }

    public void setCLPNSVerAplRegb(String cLPNSVerAplRegb) {
        this.cLPNSVerAplRegb = cLPNSVerAplRegb;
    }

    public String getCLPNSTipLicAplb() {
        return cLPNSTipLicAplb;
    }

    public void setCLPNSTipLicAplb(String cLPNSTipLicAplb) {
        this.cLPNSTipLicAplb = cLPNSTipLicAplb;
    }

    public String getCLPNSAnVeLiApb() {
        return cLPNSAnVeLiApb;
    }

    public void setCLPNSAnVeLiApb(String cLPNSAnVeLiApb) {
        this.cLPNSAnVeLiApb = cLPNSAnVeLiApb;
    }

    public String getCLPNSMeVeLiApb() {
        return cLPNSMeVeLiApb;
    }

    public void setCLPNSMeVeLiApb(String cLPNSMeVeLiApb) {
        this.cLPNSMeVeLiApb = cLPNSMeVeLiApb;
    }

    public String getCLPNSDiVeLiApb() {
        return cLPNSDiVeLiApb;
    }

    public void setCLPNSDiVeLiApb(String cLPNSDiVeLiApb) {
        this.cLPNSDiVeLiApb = cLPNSDiVeLiApb;
    }

    public String getCLPNSLiRePaApb() {
        return cLPNSLiRePaApb;
    }

    public void setCLPNSLiRePaApb(String cLPNSLiRePaApb) {
        this.cLPNSLiRePaApb = cLPNSLiRePaApb;
    }

    public String getCLPNSMaRePaLib() {
        return cLPNSMaRePaLib;
    }

    public void setCLPNSMaRePaLib(String cLPNSMaRePaLib) {
        this.cLPNSMaRePaLib = cLPNSMaRePaLib;
    }

    public String getCLPNSMaRePaSeb() {
        return cLPNSMaRePaSeb;
    }

    public void setCLPNSMaRePaSeb(String cLPNSMaRePaSeb) {
        this.cLPNSMaRePaSeb = cLPNSMaRePaSeb;
    }

    public String getCLPNSNoClDeLib() {
        return cLPNSNoClDeLib;
    }

    public void setCLPNSNoClDeLib(String cLPNSNoClDeLib) {
        this.cLPNSNoClDeLib = cLPNSNoClDeLib;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cLPNSConsInteb != null ? cLPNSConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clpns)) {
            return false;
        }
        Clpns other = (Clpns) object;
        if ((this.cLPNSConsInteb == null && other.cLPNSConsInteb != null) || (this.cLPNSConsInteb != null && !this.cLPNSConsInteb.equals(other.cLPNSConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicio.ejemplo.Clpns[ cLPNSConsInteb=" + cLPNSConsInteb + " ]";
    }

}
