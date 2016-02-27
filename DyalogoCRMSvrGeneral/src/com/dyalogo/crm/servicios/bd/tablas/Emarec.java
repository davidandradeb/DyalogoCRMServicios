/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dyalogo.crm.servicios.bd.tablas;

import com.dyalogo.crm.servicios.bd.dao_general.ImpEntidadBase;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
@Entity
@Table(name = "EMAREC", catalog = "DYALOGOCRM", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emarec.findAll", query = "SELECT e FROM Emarec e"),
    @NamedQuery(name = "Emarec.findByEMARECConsInteb", query = "SELECT e FROM Emarec e WHERE e.eMARECConsInteb = :eMARECConsInteb"),
    @NamedQuery(name = "Emarec.findByEMARECFechRecib", query = "SELECT e FROM Emarec e WHERE e.eMARECFechRecib = :eMARECFechRecib"),
    @NamedQuery(name = "Emarec.findByEMARECDeb", query = "SELECT e FROM Emarec e WHERE e.eMARECDeb = :eMARECDeb"),
    @NamedQuery(name = "Emarec.findByEMARECAsuntob", query = "SELECT e FROM Emarec e WHERE e.eMARECAsuntob = :eMARECAsuntob"),
    @NamedQuery(name = "Emarec.findByEMARECParab", query = "SELECT e FROM Emarec e WHERE e.eMARECParab = :eMARECParab")})
public class Emarec  extends ImpEntidadBase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EMAREC_ConsInte__b")
    private Integer eMARECConsInteb;
    @Column(name = "EMAREC_FechReci__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eMARECFechRecib;
    @Column(name = "EMAREC_De________b")
    private String eMARECDeb;
    @Column(name = "EMAREC_Asunto____b")
    private String eMARECAsuntob;
    @Lob
    @Column(name = "EMAREC_CuerMnsj__b")
    private String eMARECCuerMnsjb;
    @Column(name = "EMAREC_Para______b")
    private String eMARECParab;

    public Emarec() {
    }

    public Emarec(Integer eMARECConsInteb) {
        this.eMARECConsInteb = eMARECConsInteb;
    }

    public Integer getEMARECConsInteb() {
        return eMARECConsInteb;
    }

    public void setEMARECConsInteb(Integer eMARECConsInteb) {
        this.eMARECConsInteb = eMARECConsInteb;
    }

    public Date getEMARECFechRecib() {
        return eMARECFechRecib;
    }

    public void setEMARECFechRecib(Date eMARECFechRecib) {
        this.eMARECFechRecib = eMARECFechRecib;
    }

    public String getEMARECDeb() {
        return eMARECDeb;
    }

    public void setEMARECDeb(String eMARECDeb) {
        this.eMARECDeb = eMARECDeb;
    }

    public String getEMARECAsuntob() {
        return eMARECAsuntob;
    }

    public void setEMARECAsuntob(String eMARECAsuntob) {
        this.eMARECAsuntob = eMARECAsuntob;
    }

    public String getEMARECCuerMnsjb() {
        return eMARECCuerMnsjb;
    }

    public void setEMARECCuerMnsjb(String eMARECCuerMnsjb) {
        this.eMARECCuerMnsjb = eMARECCuerMnsjb;
    }

    public String getEMARECParab() {
        return eMARECParab;
    }

    public void setEMARECParab(String eMARECParab) {
        this.eMARECParab = eMARECParab;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eMARECConsInteb != null ? eMARECConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emarec)) {
            return false;
        }
        Emarec other = (Emarec) object;
        if ((this.eMARECConsInteb == null && other.eMARECConsInteb != null) || (this.eMARECConsInteb != null && !this.eMARECConsInteb.equals(other.eMARECConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicio.ejemplo.Emarec[ eMARECConsInteb=" + eMARECConsInteb + " ]";
    }

}
