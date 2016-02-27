/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dyalogo.crm.servicios.bd.tablas;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
@Entity
@Table(name = "PROYEC", catalog = "DYALOGOCRM", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyec.findAll", query = "SELECT p FROM Proyec p"),
    @NamedQuery(name = "Proyec.findByPROYECConsInteb", query = "SELECT p FROM Proyec p WHERE p.pROYECConsInteb = :pROYECConsInteb"),
    @NamedQuery(name = "Proyec.findByPROYECNomProyecb", query = "SELECT p FROM Proyec p WHERE p.pROYECNomProyecb = :pROYECNomProyecb"),
    @NamedQuery(name = "Proyec.findByPROYECComentariob", query = "SELECT p FROM Proyec p WHERE p.pROYECComentariob = :pROYECComentariob"),
    @NamedQuery(name = "Proyec.findByPROYECFechCreab", query = "SELECT p FROM Proyec p WHERE p.pROYECFechCreab = :pROYECFechCreab"),
    @NamedQuery(name = "Proyec.findByPROYECUsuaCreab", query = "SELECT p FROM Proyec p WHERE p.pROYECUsuaCreab = :pROYECUsuaCreab")})
public class Proyec implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PROYEC_ConsInte__b", nullable = false)
    private Integer pROYECConsInteb;
    @Column(name = "PROYEC_NomProyec_b", length = 253)
    private String pROYECNomProyecb;
    @Column(name = "PROYEC_Comentario_b", length = 253)
    private String pROYECComentariob;
    @Column(name = "PROYEC_FechCrea__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pROYECFechCreab;
    @Column(name = "PROYEC_UsuaCrea__b", length = 253)
    private String pROYECUsuaCreab;
    @OneToMany(mappedBy = "gUIONConsIntePROYECb")
    private List<Guion> guionList;
    @OneToMany(mappedBy = "uSUARIConsIntePROYECb")
    private List<Usuari> usuariList;
    @OneToMany(mappedBy = "cAMPANConsIntePROYECb")
    private List<Campan> campanList;

    public Proyec() {
    }

    public Proyec(Integer pROYECConsInteb) {
        this.pROYECConsInteb = pROYECConsInteb;
    }

    public Integer getPROYECConsInteb() {
        return pROYECConsInteb;
    }

    public void setPROYECConsInteb(Integer pROYECConsInteb) {
        this.pROYECConsInteb = pROYECConsInteb;
    }

    public String getPROYECNomProyecb() {
        return pROYECNomProyecb;
    }

    public void setPROYECNomProyecb(String pROYECNomProyecb) {
        this.pROYECNomProyecb = pROYECNomProyecb;
    }

    public String getPROYECComentariob() {
        return pROYECComentariob;
    }

    public void setPROYECComentariob(String pROYECComentariob) {
        this.pROYECComentariob = pROYECComentariob;
    }

    public Date getPROYECFechCreab() {
        return pROYECFechCreab;
    }

    public void setPROYECFechCreab(Date pROYECFechCreab) {
        this.pROYECFechCreab = pROYECFechCreab;
    }

    public String getPROYECUsuaCreab() {
        return pROYECUsuaCreab;
    }

    public void setPROYECUsuaCreab(String pROYECUsuaCreab) {
        this.pROYECUsuaCreab = pROYECUsuaCreab;
    }

    @XmlTransient
    public List<Guion> getGuionList() {
        return guionList;
    }

    public void setGuionList(List<Guion> guionList) {
        this.guionList = guionList;
    }

    @XmlTransient
    public List<Usuari> getUsuariList() {
        return usuariList;
    }

    public void setUsuariList(List<Usuari> usuariList) {
        this.usuariList = usuariList;
    }

    @XmlTransient
    public List<Campan> getCampanList() {
        return campanList;
    }

    public void setCampanList(List<Campan> campanList) {
        this.campanList = campanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pROYECConsInteb != null ? pROYECConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyec)) {
            return false;
        }
        Proyec other = (Proyec) object;
        if ((this.pROYECConsInteb == null && other.pROYECConsInteb != null) || (this.pROYECConsInteb != null && !this.pROYECConsInteb.equals(other.pROYECConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicios.bd.tablas.Proyec[ pROYECConsInteb=" + pROYECConsInteb + " ]";
    }

}
