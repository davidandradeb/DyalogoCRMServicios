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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
@Entity
@Table(name = "CAMORD", catalog = "DYALOGOCRM", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Camord.findAll", query = "SELECT c FROM Camord c"),
    @NamedQuery(name = "Camord.findByCamordConsinteB", query = "SELECT c FROM Camord c WHERE c.camordConsinteB = :camordConsinteB"),
    @NamedQuery(name = "Camord.findByCamordConsinteCampanB", query = "SELECT c FROM Camord c WHERE c.camordConsinteCampanB = :camordConsinteCampanB"),
    @NamedQuery(name = "Camord.findByCamordMuespoblB", query = "SELECT c FROM Camord c WHERE c.camordMuespoblB = :camordMuespoblB"),
    @NamedQuery(name = "Camord.findByCamordPoblcampB", query = "SELECT c FROM Camord c WHERE c.camordPoblcampB = :camordPoblcampB"),
    @NamedQuery(name = "Camord.findByCamordMuescampB", query = "SELECT c FROM Camord c WHERE c.camordMuescampB = :camordMuescampB"),
    @NamedQuery(name = "Camord.findByCamordPrioridadB", query = "SELECT c FROM Camord c WHERE c.camordPrioridadB = :camordPrioridadB"),
    @NamedQuery(name = "Camord.findByCamordOrdenB", query = "SELECT c FROM Camord c WHERE c.camordOrdenB = :camordOrdenB")})
public class Camord implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CAMORD_CONSINTE__B", nullable = false)
    private Integer camordConsinteB;
    @Column(name = "CAMORD_CONSINTE__CAMPAN_B")
    private Integer camordConsinteCampanB;
    @Column(name = "CAMORD_MUESPOBL__B", length = 50)
    private String camordMuespoblB;
    @Column(name = "CAMORD_POBLCAMP__B", length = 50)
    private String camordPoblcampB;
    @Column(name = "CAMORD_MUESCAMP__B", length = 50)
    private String camordMuescampB;
    @Column(name = "CAMORD_PRIORIDAD_B")
    private Integer camordPrioridadB;
    @Column(name = "CAMORD_ORDEN_____B", length = 50)
    private String camordOrdenB;

    public Camord() {
    }

    public Camord(Integer camordConsinteB) {
        this.camordConsinteB = camordConsinteB;
    }

    public Integer getCamordConsinteB() {
        return camordConsinteB;
    }

    public void setCamordConsinteB(Integer camordConsinteB) {
        this.camordConsinteB = camordConsinteB;
    }

    public Integer getCamordConsinteCampanB() {
        return camordConsinteCampanB;
    }

    public void setCamordConsinteCampanB(Integer camordConsinteCampanB) {
        this.camordConsinteCampanB = camordConsinteCampanB;
    }

    public String getCamordMuespoblB() {
        return camordMuespoblB;
    }

    public void setCamordMuespoblB(String camordMuespoblB) {
        this.camordMuespoblB = camordMuespoblB;
    }

    public String getCamordPoblcampB() {
        return camordPoblcampB;
    }

    public void setCamordPoblcampB(String camordPoblcampB) {
        this.camordPoblcampB = camordPoblcampB;
    }

    public String getCamordMuescampB() {
        return camordMuescampB;
    }

    public void setCamordMuescampB(String camordMuescampB) {
        this.camordMuescampB = camordMuescampB;
    }

    public Integer getCamordPrioridadB() {
        return camordPrioridadB;
    }

    public void setCamordPrioridadB(Integer camordPrioridadB) {
        this.camordPrioridadB = camordPrioridadB;
    }

    public String getCamordOrdenB() {
        return camordOrdenB;
    }

    public void setCamordOrdenB(String camordOrdenB) {
        this.camordOrdenB = camordOrdenB;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (camordConsinteB != null ? camordConsinteB.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camord)) {
            return false;
        }
        Camord other = (Camord) object;
        if ((this.camordConsinteB == null && other.camordConsinteB != null) || (this.camordConsinteB != null && !this.camordConsinteB.equals(other.camordConsinteB))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicios.bd.tablas.Camord[ camordConsinteB=" + camordConsinteB + " ]";
    }

}
