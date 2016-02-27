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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
@Table(name = "usuari", catalog = "DYALOGOCRM", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"USUARI_Codigo____b"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuari.findAll", query = "SELECT u FROM Usuari u"),
    @NamedQuery(name = "Usuari.findByUSUARIConsInteb", query = "SELECT u FROM Usuari u WHERE u.uSUARIConsInteb = :uSUARIConsInteb"),
    @NamedQuery(name = "Usuari.findByUSUARICodigob", query = "SELECT u FROM Usuari u WHERE u.uSUARICodigob = :uSUARICodigob"),
    @NamedQuery(name = "Usuari.findByUSUARIClaveb", query = "SELECT u FROM Usuari u WHERE u.uSUARIClaveb = :uSUARIClaveb"),
    @NamedQuery(name = "Usuari.findByUSUARINombreb", query = "SELECT u FROM Usuari u WHERE u.uSUARINombreb = :uSUARINombreb"),
    @NamedQuery(name = "Usuari.findByUSUARICargob", query = "SELECT u FROM Usuari u WHERE u.uSUARICargob = :uSUARICargob"),
    @NamedQuery(name = "Usuari.findByUSUARIConsIntePERUSUb", query = "SELECT u FROM Usuari u WHERE u.uSUARIConsIntePERUSUb = :uSUARIConsIntePERUSUb"),
    @NamedQuery(name = "Usuari.findByUSUARIInMoCoPab", query = "SELECT u FROM Usuari u WHERE u.uSUARIInMoCoPab = :uSUARIInMoCoPab"),
    @NamedQuery(name = "Usuari.findByUSUARIInPeToGub", query = "SELECT u FROM Usuari u WHERE u.uSUARIInPeToGub = :uSUARIInPeToGub"),
    @NamedQuery(name = "Usuari.findByUSUARIIndPerCapb", query = "SELECT u FROM Usuari u WHERE u.uSUARIIndPerCapb = :uSUARIIndPerCapb"),
    @NamedQuery(name = "Usuari.findByUSUARIIndPerRepb", query = "SELECT u FROM Usuari u WHERE u.uSUARIIndPerRepb = :uSUARIIndPerRepb"),
    @NamedQuery(name = "Usuari.findByUSUARIInPeMoPob", query = "SELECT u FROM Usuari u WHERE u.uSUARIInPeMoPob = :uSUARIInPeMoPob"),
    @NamedQuery(name = "Usuari.findByUSUARIIdentificb", query = "SELECT u FROM Usuari u WHERE u.uSUARIIdentificb = :uSUARIIdentificb"),
    @NamedQuery(name = "Usuari.findByUSUARIUsuaTeleb", query = "SELECT u FROM Usuari u WHERE u.uSUARIUsuaTeleb = :uSUARIUsuaTeleb"),
    @NamedQuery(name = "Usuari.findByUSUARIClavTeleb", query = "SELECT u FROM Usuari u WHERE u.uSUARIClavTeleb = :uSUARIClavTeleb"),
    @NamedQuery(name = "Usuari.findByUSUARIConsInteTURNOSb", query = "SELECT u FROM Usuari u WHERE u.uSUARIConsInteTURNOSb = :uSUARIConsInteTURNOSb"),
    @NamedQuery(name = "Usuari.findByUSUARIClaSalLlab", query = "SELECT u FROM Usuari u WHERE u.uSUARIClaSalLlab = :uSUARIClaSalLlab"),
    @NamedQuery(name = "Usuari.findByUSUARILlavExteb", query = "SELECT u FROM Usuari u WHERE u.uSUARILlavExteb = :uSUARILlavExteb"),
    @NamedQuery(name = "Usuari.findByUSUARIIndiActib", query = "SELECT u FROM Usuari u WHERE u.uSUARIIndiActib = :uSUARIIndiActib"),
    @NamedQuery(name = "Usuari.findByUSUARINaciAnnob", query = "SELECT u FROM Usuari u WHERE u.uSUARINaciAnnob = :uSUARINaciAnnob"),
    @NamedQuery(name = "Usuari.findByUSUARINaciMesb", query = "SELECT u FROM Usuari u WHERE u.uSUARINaciMesb = :uSUARINaciMesb"),
    @NamedQuery(name = "Usuari.findByUSUARINaciDiab", query = "SELECT u FROM Usuari u WHERE u.uSUARINaciDiab = :uSUARINaciDiab"),
    @NamedQuery(name = "Usuari.findByUSUARISegConVenb", query = "SELECT u FROM Usuari u WHERE u.uSUARISegConVenb = :uSUARISegConVenb"),
    @NamedQuery(name = "Usuari.findByUSUARISegDiaVenb", query = "SELECT u FROM Usuari u WHERE u.uSUARISegDiaVenb = :uSUARISegDiaVenb"),
    @NamedQuery(name = "Usuari.findByUSUARILonMinConb", query = "SELECT u FROM Usuari u WHERE u.uSUARILonMinConb = :uSUARILonMinConb"),
    @NamedQuery(name = "Usuari.findByUSUARIRepConDiab", query = "SELECT u FROM Usuari u WHERE u.uSUARIRepConDiab = :uSUARIRepConDiab"),
    @NamedQuery(name = "Usuari.findByUSUARISegFecConb", query = "SELECT u FROM Usuari u WHERE u.uSUARISegFecConb = :uSUARISegFecConb"),
    @NamedQuery(name = "Usuari.findByUSUARIBloqueadob", query = "SELECT u FROM Usuari u WHERE u.uSUARIBloqueadob = :uSUARIBloqueadob"),
    @NamedQuery(name = "Usuari.findByUSUARIFechCreab", query = "SELECT u FROM Usuari u WHERE u.uSUARIFechCreab = :uSUARIFechCreab"),
    @NamedQuery(name = "Usuari.findByUSUARIUsuaCreab", query = "SELECT u FROM Usuari u WHERE u.uSUARIUsuaCreab = :uSUARIUsuaCreab")})
public class Usuari implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "USUARI_ConsInte__b", nullable = false)
    private Integer uSUARIConsInteb;
    @Basic(optional = false)
    @Column(name = "USUARI_Codigo____b", nullable = false, length = 50)
    private String uSUARICodigob;
    @Basic(optional = false)
    @Column(name = "USUARI_Clave_____b", nullable = false, length = 253)
    private String uSUARIClaveb;
    @Basic(optional = false)
    @Column(name = "USUARI_Nombre____b", nullable = false, length = 253)
    private String uSUARINombreb;
    @Column(name = "USUARI_Cargo_____b", length = 253)
    private String uSUARICargob;
    @Column(name = "USUARI_ConsInte__PERUSU_b")
    private Integer uSUARIConsIntePERUSUb;
    @Basic(optional = false)
    @Column(name = "USUARI_InMoCoPa__b", nullable = false)
    private short uSUARIInMoCoPab;
    @Basic(optional = false)
    @Column(name = "USUARI_InPeToGu__b", nullable = false)
    private short uSUARIInPeToGub;
    @Basic(optional = false)
    @Column(name = "USUARI_IndPerCap_b", nullable = false)
    private short uSUARIIndPerCapb;
    @Basic(optional = false)
    @Column(name = "USUARI_IndPerRep_b", nullable = false)
    private short uSUARIIndPerRepb;
    @Basic(optional = false)
    @Column(name = "USUARI_InPeMoPo__b", nullable = false)
    private short uSUARIInPeMoPob;
    @Column(name = "USUARI_Identific_b", length = 50)
    private String uSUARIIdentificb;
    @Column(name = "USUARI_UsuaTele__b", length = 50)
    private String uSUARIUsuaTeleb;
    @Column(name = "USUARI_ClavTele__b", length = 50)
    private String uSUARIClavTeleb;
    @Column(name = "USUARI_ConsInte__TURNOS_b")
    private Integer uSUARIConsInteTURNOSb;
    @Column(name = "USUARI_ClaSalLla_b", length = 50)
    private String uSUARIClaSalLlab;
    @Column(name = "USUARI_LlavExte__b", length = 50)
    private String uSUARILlavExteb;
    @Column(name = "USUARI_IndiActi__b")
    private Short uSUARIIndiActib;
    @Column(name = "USUARI_NaciAnno__b")
    private Integer uSUARINaciAnnob;
    @Column(name = "USUARI_NaciMes___b")
    private Integer uSUARINaciMesb;
    @Column(name = "USUARI_NaciDia___b")
    private Integer uSUARINaciDiab;
    @Column(name = "USUARI_SegConVen_b")
    private Short uSUARISegConVenb;
    @Column(name = "USUARI_SegDiaVen_b")
    private Integer uSUARISegDiaVenb;
    @Column(name = "USUARI_LonMinCon_b")
    private Integer uSUARILonMinConb;
    @Column(name = "USUARI_RepConDia_b")
    private Integer uSUARIRepConDiab;
    @Column(name = "USUARI_SegFecCon_b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uSUARISegFecConb;
    @Column(name = "USUARI_Bloqueado_b")
    private Short uSUARIBloqueadob;
    @Column(name = "USUARI_FechCrea__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uSUARIFechCreab;
    @Column(name = "USUARI_UsuaCrea__b", length = 253)
    private String uSUARIUsuaCreab;
    @Lob
    @Column(name = "USUARI_Foto______b")
    private byte[] uSUARIFotob;
    @ManyToMany(mappedBy = "usuariList")
    private List<Campan> campanList;
    @JoinColumn(name = "USUARI_ConsInte__PROYEC_b", referencedColumnName = "PROYEC_ConsInte__b")
    @ManyToOne
    private Proyec uSUARIConsIntePROYECb;
    @OneToMany(mappedBy = "aGENDAConsInteUSUARIb")
    private List<Agenda> agendaList;

    public Usuari() {
    }

    public Usuari(Integer uSUARIConsInteb) {
        this.uSUARIConsInteb = uSUARIConsInteb;
    }

    public Usuari(Integer uSUARIConsInteb, String uSUARICodigob, String uSUARIClaveb, String uSUARINombreb, short uSUARIInMoCoPab, short uSUARIInPeToGub, short uSUARIIndPerCapb, short uSUARIIndPerRepb, short uSUARIInPeMoPob) {
        this.uSUARIConsInteb = uSUARIConsInteb;
        this.uSUARICodigob = uSUARICodigob;
        this.uSUARIClaveb = uSUARIClaveb;
        this.uSUARINombreb = uSUARINombreb;
        this.uSUARIInMoCoPab = uSUARIInMoCoPab;
        this.uSUARIInPeToGub = uSUARIInPeToGub;
        this.uSUARIIndPerCapb = uSUARIIndPerCapb;
        this.uSUARIIndPerRepb = uSUARIIndPerRepb;
        this.uSUARIInPeMoPob = uSUARIInPeMoPob;
    }

    public Integer getUSUARIConsInteb() {
        return uSUARIConsInteb;
    }

    public void setUSUARIConsInteb(Integer uSUARIConsInteb) {
        this.uSUARIConsInteb = uSUARIConsInteb;
    }

    public String getUSUARICodigob() {
        return uSUARICodigob;
    }

    public void setUSUARICodigob(String uSUARICodigob) {
        this.uSUARICodigob = uSUARICodigob;
    }

    public String getUSUARIClaveb() {
        return uSUARIClaveb;
    }

    public void setUSUARIClaveb(String uSUARIClaveb) {
        this.uSUARIClaveb = uSUARIClaveb;
    }

    public String getUSUARINombreb() {
        return uSUARINombreb;
    }

    public void setUSUARINombreb(String uSUARINombreb) {
        this.uSUARINombreb = uSUARINombreb;
    }

    public String getUSUARICargob() {
        return uSUARICargob;
    }

    public void setUSUARICargob(String uSUARICargob) {
        this.uSUARICargob = uSUARICargob;
    }

    public Integer getUSUARIConsIntePERUSUb() {
        return uSUARIConsIntePERUSUb;
    }

    public void setUSUARIConsIntePERUSUb(Integer uSUARIConsIntePERUSUb) {
        this.uSUARIConsIntePERUSUb = uSUARIConsIntePERUSUb;
    }

    public short getUSUARIInMoCoPab() {
        return uSUARIInMoCoPab;
    }

    public void setUSUARIInMoCoPab(short uSUARIInMoCoPab) {
        this.uSUARIInMoCoPab = uSUARIInMoCoPab;
    }

    public short getUSUARIInPeToGub() {
        return uSUARIInPeToGub;
    }

    public void setUSUARIInPeToGub(short uSUARIInPeToGub) {
        this.uSUARIInPeToGub = uSUARIInPeToGub;
    }

    public short getUSUARIIndPerCapb() {
        return uSUARIIndPerCapb;
    }

    public void setUSUARIIndPerCapb(short uSUARIIndPerCapb) {
        this.uSUARIIndPerCapb = uSUARIIndPerCapb;
    }

    public short getUSUARIIndPerRepb() {
        return uSUARIIndPerRepb;
    }

    public void setUSUARIIndPerRepb(short uSUARIIndPerRepb) {
        this.uSUARIIndPerRepb = uSUARIIndPerRepb;
    }

    public short getUSUARIInPeMoPob() {
        return uSUARIInPeMoPob;
    }

    public void setUSUARIInPeMoPob(short uSUARIInPeMoPob) {
        this.uSUARIInPeMoPob = uSUARIInPeMoPob;
    }

    public String getUSUARIIdentificb() {
        return uSUARIIdentificb;
    }

    public void setUSUARIIdentificb(String uSUARIIdentificb) {
        this.uSUARIIdentificb = uSUARIIdentificb;
    }

    public String getUSUARIUsuaTeleb() {
        return uSUARIUsuaTeleb;
    }

    public void setUSUARIUsuaTeleb(String uSUARIUsuaTeleb) {
        this.uSUARIUsuaTeleb = uSUARIUsuaTeleb;
    }

    public String getUSUARIClavTeleb() {
        return uSUARIClavTeleb;
    }

    public void setUSUARIClavTeleb(String uSUARIClavTeleb) {
        this.uSUARIClavTeleb = uSUARIClavTeleb;
    }

    public Integer getUSUARIConsInteTURNOSb() {
        return uSUARIConsInteTURNOSb;
    }

    public void setUSUARIConsInteTURNOSb(Integer uSUARIConsInteTURNOSb) {
        this.uSUARIConsInteTURNOSb = uSUARIConsInteTURNOSb;
    }

    public String getUSUARIClaSalLlab() {
        return uSUARIClaSalLlab;
    }

    public void setUSUARIClaSalLlab(String uSUARIClaSalLlab) {
        this.uSUARIClaSalLlab = uSUARIClaSalLlab;
    }

    public String getUSUARILlavExteb() {
        return uSUARILlavExteb;
    }

    public void setUSUARILlavExteb(String uSUARILlavExteb) {
        this.uSUARILlavExteb = uSUARILlavExteb;
    }

    public Short getUSUARIIndiActib() {
        return uSUARIIndiActib;
    }

    public void setUSUARIIndiActib(Short uSUARIIndiActib) {
        this.uSUARIIndiActib = uSUARIIndiActib;
    }

    public Integer getUSUARINaciAnnob() {
        return uSUARINaciAnnob;
    }

    public void setUSUARINaciAnnob(Integer uSUARINaciAnnob) {
        this.uSUARINaciAnnob = uSUARINaciAnnob;
    }

    public Integer getUSUARINaciMesb() {
        return uSUARINaciMesb;
    }

    public void setUSUARINaciMesb(Integer uSUARINaciMesb) {
        this.uSUARINaciMesb = uSUARINaciMesb;
    }

    public Integer getUSUARINaciDiab() {
        return uSUARINaciDiab;
    }

    public void setUSUARINaciDiab(Integer uSUARINaciDiab) {
        this.uSUARINaciDiab = uSUARINaciDiab;
    }

    public Short getUSUARISegConVenb() {
        return uSUARISegConVenb;
    }

    public void setUSUARISegConVenb(Short uSUARISegConVenb) {
        this.uSUARISegConVenb = uSUARISegConVenb;
    }

    public Integer getUSUARISegDiaVenb() {
        return uSUARISegDiaVenb;
    }

    public void setUSUARISegDiaVenb(Integer uSUARISegDiaVenb) {
        this.uSUARISegDiaVenb = uSUARISegDiaVenb;
    }

    public Integer getUSUARILonMinConb() {
        return uSUARILonMinConb;
    }

    public void setUSUARILonMinConb(Integer uSUARILonMinConb) {
        this.uSUARILonMinConb = uSUARILonMinConb;
    }

    public Integer getUSUARIRepConDiab() {
        return uSUARIRepConDiab;
    }

    public void setUSUARIRepConDiab(Integer uSUARIRepConDiab) {
        this.uSUARIRepConDiab = uSUARIRepConDiab;
    }

    public Date getUSUARISegFecConb() {
        return uSUARISegFecConb;
    }

    public void setUSUARISegFecConb(Date uSUARISegFecConb) {
        this.uSUARISegFecConb = uSUARISegFecConb;
    }

    public Short getUSUARIBloqueadob() {
        return uSUARIBloqueadob;
    }

    public void setUSUARIBloqueadob(Short uSUARIBloqueadob) {
        this.uSUARIBloqueadob = uSUARIBloqueadob;
    }

    public Date getUSUARIFechCreab() {
        return uSUARIFechCreab;
    }

    public void setUSUARIFechCreab(Date uSUARIFechCreab) {
        this.uSUARIFechCreab = uSUARIFechCreab;
    }

    public String getUSUARIUsuaCreab() {
        return uSUARIUsuaCreab;
    }

    public void setUSUARIUsuaCreab(String uSUARIUsuaCreab) {
        this.uSUARIUsuaCreab = uSUARIUsuaCreab;
    }

    public byte[] getUSUARIFotob() {
        return uSUARIFotob;
    }

    public void setUSUARIFotob(byte[] uSUARIFotob) {
        this.uSUARIFotob = uSUARIFotob;
    }

    @XmlTransient
    public List<Campan> getCampanList() {
        return campanList;
    }

    public void setCampanList(List<Campan> campanList) {
        this.campanList = campanList;
    }

    public Proyec getUSUARIConsIntePROYECb() {
        return uSUARIConsIntePROYECb;
    }

    public void setUSUARIConsIntePROYECb(Proyec uSUARIConsIntePROYECb) {
        this.uSUARIConsIntePROYECb = uSUARIConsIntePROYECb;
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
        hash += (uSUARIConsInteb != null ? uSUARIConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuari)) {
            return false;
        }
        Usuari other = (Usuari) object;
        if ((this.uSUARIConsInteb == null && other.uSUARIConsInteb != null) || (this.uSUARIConsInteb != null && !this.uSUARIConsInteb.equals(other.uSUARIConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicios.bd.tablas.Usuari[ uSUARIConsInteb=" + uSUARIConsInteb + " ]";
    }

}
