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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "AGENDA", catalog = "DYALOGOCRM", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a"),
    @NamedQuery(name = "Agenda.findByAGENDAConsInteGUIONGuib", query = "SELECT a FROM Agenda a WHERE a.agendaPK.aGENDAConsInteGUIONGuib = :aGENDAConsInteGUIONGuib"),
    @NamedQuery(name = "Agenda.findByAGENDAConsInteGUIONPobb", query = "SELECT a FROM Agenda a WHERE a.agendaPK.aGENDAConsInteGUIONPobb = :aGENDAConsInteGUIONPobb"),
    @NamedQuery(name = "Agenda.findByAGENDAConsInteMUESTRb", query = "SELECT a FROM Agenda a WHERE a.agendaPK.aGENDAConsInteMUESTRb = :aGENDAConsInteMUESTRb"),
    @NamedQuery(name = "Agenda.findByAGENDACodiMiemb", query = "SELECT a FROM Agenda a WHERE a.agendaPK.aGENDACodiMiemb = :aGENDACodiMiemb"),
    @NamedQuery(name = "Agenda.findByAGENDAFechab", query = "SELECT a FROM Agenda a WHERE a.aGENDAFechab = :aGENDAFechab"),
    @NamedQuery(name = "Agenda.findByAGENDAHorab", query = "SELECT a FROM Agenda a WHERE a.aGENDAHorab = :aGENDAHorab")})
public class Agenda extends ImpEntidadBase implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgendaPK agendaPK;
    @Basic(optional = false)
    @Column(name = "AGENDA_Fecha_____b", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date aGENDAFechab;
    @Basic(optional = false)
    @Column(name = "AGENDA_Hora______b", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date aGENDAHorab;
    @JoinColumn(name = "AGENDA_ConsInte__MUESTR_b", referencedColumnName = "MUESTR_ConsInte__b", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Muestr muestr;
    @JoinColumn(name = "AGENDA_ConsInte__GUION__Gui_b", referencedColumnName = "GUION__ConsInte__b", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Guion guion;
    @JoinColumn(name = "AGENDA_ConsInte__GUION__Pob_b", referencedColumnName = "GUION__ConsInte__b", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Guion guion1;
    @JoinColumn(name = "AGENDA_ConsInte__USUARI_b", referencedColumnName = "USUARI_ConsInte__b")
    @ManyToOne
    private Usuari aGENDAConsInteUSUARIb;
    @JoinColumn(name = "AGENDA_ConsInte__CAMPAN_b", referencedColumnName = "CAMPAN_ConsInte__b")
    @ManyToOne
    private Campan aGENDAConsInteCAMPANb;

    public Agenda() {
    }

    public Agenda(AgendaPK agendaPK) {
        this.agendaPK = agendaPK;
    }

    public Agenda(AgendaPK agendaPK, Date aGENDAFechab, Date aGENDAHorab) {
        this.agendaPK = agendaPK;
        this.aGENDAFechab = aGENDAFechab;
        this.aGENDAHorab = aGENDAHorab;
    }

    public Agenda(int aGENDAConsInteGUIONGuib, int aGENDAConsInteGUIONPobb, int aGENDAConsInteMUESTRb, int aGENDACodiMiemb) {
        this.agendaPK = new AgendaPK(aGENDAConsInteGUIONGuib, aGENDAConsInteGUIONPobb, aGENDAConsInteMUESTRb, aGENDACodiMiemb);
    }

    public AgendaPK getAgendaPK() {
        return agendaPK;
    }

    public void setAgendaPK(AgendaPK agendaPK) {
        this.agendaPK = agendaPK;
    }

    public Date getAGENDAFechab() {
        return aGENDAFechab;
    }

    public void setAGENDAFechab(Date aGENDAFechab) {
        this.aGENDAFechab = aGENDAFechab;
    }

    public Date getAGENDAHorab() {
        return aGENDAHorab;
    }

    public void setAGENDAHorab(Date aGENDAHorab) {
        this.aGENDAHorab = aGENDAHorab;
    }

    public Muestr getMuestr() {
        return muestr;
    }

    public void setMuestr(Muestr muestr) {
        this.muestr = muestr;
    }

    public Guion getGuion() {
        return guion;
    }

    public void setGuion(Guion guion) {
        this.guion = guion;
    }

    public Guion getGuion1() {
        return guion1;
    }

    public void setGuion1(Guion guion1) {
        this.guion1 = guion1;
    }

    public Usuari getAGENDAConsInteUSUARIb() {
        return aGENDAConsInteUSUARIb;
    }

    public void setAGENDAConsInteUSUARIb(Usuari aGENDAConsInteUSUARIb) {
        this.aGENDAConsInteUSUARIb = aGENDAConsInteUSUARIb;
    }

    public Campan getAGENDAConsInteCAMPANb() {
        return aGENDAConsInteCAMPANb;
    }

    public void setAGENDAConsInteCAMPANb(Campan aGENDAConsInteCAMPANb) {
        this.aGENDAConsInteCAMPANb = aGENDAConsInteCAMPANb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agendaPK != null ? agendaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agenda)) {
            return false;
        }
        Agenda other = (Agenda) object;
        if ((this.agendaPK == null && other.agendaPK != null) || (this.agendaPK != null && !this.agendaPK.equals(other.agendaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicios.bd.tablas.Agenda[ agendaPK=" + agendaPK + " ]";
    }

}
