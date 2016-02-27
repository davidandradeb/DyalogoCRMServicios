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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
@Entity
@Table(name = "MUESTR", catalog = "DYALOGOCRM", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"MUESTR_ConsInte__GUION__b", "MUESTR_Nombre____b"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Muestr.findAll", query = "SELECT m FROM Muestr m"),
    @NamedQuery(name = "Muestr.findByMUESTRConsInteb", query = "SELECT m FROM Muestr m WHERE m.mUESTRConsInteb = :mUESTRConsInteb"),
    @NamedQuery(name = "Muestr.findByMUESTRNombreb", query = "SELECT m FROM Muestr m WHERE m.mUESTRNombreb = :mUESTRNombreb"),
    @NamedQuery(name = "Muestr.findByMUESTRSiguMiemb", query = "SELECT m FROM Muestr m WHERE m.mUESTRSiguMiemb = :mUESTRSiguMiemb"),
    @NamedQuery(name = "Muestr.findByMUESTRTipoMuesb", query = "SELECT m FROM Muestr m WHERE m.mUESTRTipoMuesb = :mUESTRTipoMuesb"),
    @NamedQuery(name = "Muestr.findByMUESTRNumeMiemb", query = "SELECT m FROM Muestr m WHERE m.mUESTRNumeMiemb = :mUESTRNumeMiemb"),
    @NamedQuery(name = "Muestr.findByMUESTRConsultab", query = "SELECT m FROM Muestr m WHERE m.mUESTRConsultab = :mUESTRConsultab"),
    @NamedQuery(name = "Muestr.findByMUESTRCamVarDisb", query = "SELECT m FROM Muestr m WHERE m.mUESTRCamVarDisb = :mUESTRCamVarDisb"),
    @NamedQuery(name = "Muestr.findByMUESTRPeriodob", query = "SELECT m FROM Muestr m WHERE m.mUESTRPeriodob = :mUESTRPeriodob"),
    @NamedQuery(name = "Muestr.findByMUESTRFechInicb", query = "SELECT m FROM Muestr m WHERE m.mUESTRFechInicb = :mUESTRFechInicb"),
    @NamedQuery(name = "Muestr.findByMUESTRFechFinab", query = "SELECT m FROM Muestr m WHERE m.mUESTRFechFinab = :mUESTRFechFinab"),
    @NamedQuery(name = "Muestr.findByMUESTRMarcCreab", query = "SELECT m FROM Muestr m WHERE m.mUESTRMarcCreab = :mUESTRMarcCreab"),
    @NamedQuery(name = "Muestr.findByMUESTRFechCreab", query = "SELECT m FROM Muestr m WHERE m.mUESTRFechCreab = :mUESTRFechCreab"),
    @NamedQuery(name = "Muestr.findByMUESTRUsuaCreab", query = "SELECT m FROM Muestr m WHERE m.mUESTRUsuaCreab = :mUESTRUsuaCreab")})
public class Muestr implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MUESTR_ConsInte__b", nullable = false)
    private Integer mUESTRConsInteb;
    @Basic(optional = false)
    @Column(name = "MUESTR_Nombre____b", nullable = false, length = 50)
    private String mUESTRNombreb;
    @Column(name = "MUESTR_SiguMiem__b")
    private Integer mUESTRSiguMiemb;
    @Column(name = "MUESTR_TipoMues__b")
    private Short mUESTRTipoMuesb;
    @Column(name = "MUESTR_NumeMiem__b")
    private Integer mUESTRNumeMiemb;
    @Column(name = "MUESTR_Consulta__b", length = 50)
    private String mUESTRConsultab;
    @Column(name = "MUESTR_CamVarDis_b", length = 255)
    private String mUESTRCamVarDisb;
    @Column(name = "MUESTR_Periodo___b")
    private Short mUESTRPeriodob;
    @Column(name = "MUESTR_FechInic__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mUESTRFechInicb;
    @Column(name = "MUESTR_FechFina__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mUESTRFechFinab;
    @Column(name = "MUESTR_MarcCrea__b", length = 255)
    private String mUESTRMarcCreab;
    @Column(name = "MUESTR_FechCrea__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mUESTRFechCreab;
    @Column(name = "MUESTR_UsuaCrea__b", length = 253)
    private String mUESTRUsuaCreab;
    @JoinColumn(name = "MUESTR_ConsInte__GUION__b", referencedColumnName = "GUION__ConsInte__b", nullable = false)
    @ManyToOne(optional = false)
    private Guion mUESTRConsInteGUIONb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cAMPANConsInteMUESTRb")
    private List<Campan> campanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "muestr")
    private List<Agenda> agendaList;

    public Muestr() {
    }

    public Muestr(Integer mUESTRConsInteb) {
        this.mUESTRConsInteb = mUESTRConsInteb;
    }

    public Muestr(Integer mUESTRConsInteb, String mUESTRNombreb) {
        this.mUESTRConsInteb = mUESTRConsInteb;
        this.mUESTRNombreb = mUESTRNombreb;
    }

    public Integer getMUESTRConsInteb() {
        return mUESTRConsInteb;
    }

    public void setMUESTRConsInteb(Integer mUESTRConsInteb) {
        this.mUESTRConsInteb = mUESTRConsInteb;
    }

    public String getMUESTRNombreb() {
        return mUESTRNombreb;
    }

    public void setMUESTRNombreb(String mUESTRNombreb) {
        this.mUESTRNombreb = mUESTRNombreb;
    }

    public Integer getMUESTRSiguMiemb() {
        return mUESTRSiguMiemb;
    }

    public void setMUESTRSiguMiemb(Integer mUESTRSiguMiemb) {
        this.mUESTRSiguMiemb = mUESTRSiguMiemb;
    }

    public Short getMUESTRTipoMuesb() {
        return mUESTRTipoMuesb;
    }

    public void setMUESTRTipoMuesb(Short mUESTRTipoMuesb) {
        this.mUESTRTipoMuesb = mUESTRTipoMuesb;
    }

    public Integer getMUESTRNumeMiemb() {
        return mUESTRNumeMiemb;
    }

    public void setMUESTRNumeMiemb(Integer mUESTRNumeMiemb) {
        this.mUESTRNumeMiemb = mUESTRNumeMiemb;
    }

    public String getMUESTRConsultab() {
        return mUESTRConsultab;
    }

    public void setMUESTRConsultab(String mUESTRConsultab) {
        this.mUESTRConsultab = mUESTRConsultab;
    }

    public String getMUESTRCamVarDisb() {
        return mUESTRCamVarDisb;
    }

    public void setMUESTRCamVarDisb(String mUESTRCamVarDisb) {
        this.mUESTRCamVarDisb = mUESTRCamVarDisb;
    }

    public Short getMUESTRPeriodob() {
        return mUESTRPeriodob;
    }

    public void setMUESTRPeriodob(Short mUESTRPeriodob) {
        this.mUESTRPeriodob = mUESTRPeriodob;
    }

    public Date getMUESTRFechInicb() {
        return mUESTRFechInicb;
    }

    public void setMUESTRFechInicb(Date mUESTRFechInicb) {
        this.mUESTRFechInicb = mUESTRFechInicb;
    }

    public Date getMUESTRFechFinab() {
        return mUESTRFechFinab;
    }

    public void setMUESTRFechFinab(Date mUESTRFechFinab) {
        this.mUESTRFechFinab = mUESTRFechFinab;
    }

    public String getMUESTRMarcCreab() {
        return mUESTRMarcCreab;
    }

    public void setMUESTRMarcCreab(String mUESTRMarcCreab) {
        this.mUESTRMarcCreab = mUESTRMarcCreab;
    }

    public Date getMUESTRFechCreab() {
        return mUESTRFechCreab;
    }

    public void setMUESTRFechCreab(Date mUESTRFechCreab) {
        this.mUESTRFechCreab = mUESTRFechCreab;
    }

    public String getMUESTRUsuaCreab() {
        return mUESTRUsuaCreab;
    }

    public void setMUESTRUsuaCreab(String mUESTRUsuaCreab) {
        this.mUESTRUsuaCreab = mUESTRUsuaCreab;
    }

    public Guion getMUESTRConsInteGUIONb() {
        return mUESTRConsInteGUIONb;
    }

    public void setMUESTRConsInteGUIONb(Guion mUESTRConsInteGUIONb) {
        this.mUESTRConsInteGUIONb = mUESTRConsInteGUIONb;
    }

    @XmlTransient
    public List<Campan> getCampanList() {
        return campanList;
    }

    public void setCampanList(List<Campan> campanList) {
        this.campanList = campanList;
    }

    @XmlTransient
    public List<Agenda> getAgendaList() {
        return agendaList;
    }

    public void setAgendaList(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mUESTRConsInteb != null ? mUESTRConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Muestr)) {
            return false;
        }
        Muestr other = (Muestr) object;
        if ((this.mUESTRConsInteb == null && other.mUESTRConsInteb != null) || (this.mUESTRConsInteb != null && !this.mUESTRConsInteb.equals(other.mUESTRConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicios.bd.tablas.Muestr[ mUESTRConsInteb=" + mUESTRConsInteb + " ]";
    }

}
