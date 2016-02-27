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
import javax.persistence.Lob;
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
@Table(name = "guion_", catalog = "DYALOGOCRM", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"GUION__Nombre____b"}),
    @UniqueConstraint(columnNames = {"GUION__ConsInte__b"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guion.findAll", query = "SELECT g FROM Guion g"),
    @NamedQuery(name = "Guion.findByGUIONConsInteb", query = "SELECT g FROM Guion g WHERE g.gUIONConsInteb = :gUIONConsInteb"),
    @NamedQuery(name = "Guion.findByGUIONNombreb", query = "SELECT g FROM Guion g WHERE g.gUIONNombreb = :gUIONNombreb"),
    @NamedQuery(name = "Guion.findByGUIONDescripcib", query = "SELECT g FROM Guion g WHERE g.gUIONDescripcib = :gUIONDescripcib"),
    @NamedQuery(name = "Guion.findByGUIONIndGuiNueb", query = "SELECT g FROM Guion g WHERE g.gUIONIndGuiNueb = :gUIONIndGuiNueb"),
    @NamedQuery(name = "Guion.findByGUIONColoFondb", query = "SELECT g FROM Guion g WHERE g.gUIONColoFondb = :gUIONColoFondb"),
    @NamedQuery(name = "Guion.findByGUIONIndiSistb", query = "SELECT g FROM Guion g WHERE g.gUIONIndiSistb = :gUIONIndiSistb"),
    @NamedQuery(name = "Guion.findByGUIONIndiMaesb", query = "SELECT g FROM Guion g WHERE g.gUIONIndiMaesb = :gUIONIndiMaesb"),
    @NamedQuery(name = "Guion.findByGUIONTipoPresb", query = "SELECT g FROM Guion g WHERE g.gUIONTipoPresb = :gUIONTipoPresb"),
    @NamedQuery(name = "Guion.findByGUIONIndWorFlob", query = "SELECT g FROM Guion g WHERE g.gUIONIndWorFlob = :gUIONIndWorFlob"),
    @NamedQuery(name = "Guion.findByGUIONMarcCreab", query = "SELECT g FROM Guion g WHERE g.gUIONMarcCreab = :gUIONMarcCreab"),
    @NamedQuery(name = "Guion.findByGUIONIndSinExtb", query = "SELECT g FROM Guion g WHERE g.gUIONIndSinExtb = :gUIONIndSinExtb"),
    @NamedQuery(name = "Guion.findByGUIONDSNSinExtb", query = "SELECT g FROM Guion g WHERE g.gUIONDSNSinExtb = :gUIONDSNSinExtb"),
    @NamedQuery(name = "Guion.findByGUIONUsuSinExtb", query = "SELECT g FROM Guion g WHERE g.gUIONUsuSinExtb = :gUIONUsuSinExtb"),
    @NamedQuery(name = "Guion.findByGUIONPasSinExtb", query = "SELECT g FROM Guion g WHERE g.gUIONPasSinExtb = :gUIONPasSinExtb"),
    @NamedQuery(name = "Guion.findByGUIONTabSinExtb", query = "SELECT g FROM Guion g WHERE g.gUIONTabSinExtb = :gUIONTabSinExtb"),
    @NamedQuery(name = "Guion.findByGUIONEstadoWfb", query = "SELECT g FROM Guion g WHERE g.gUIONEstadoWfb = :gUIONEstadoWfb"),
    @NamedQuery(name = "Guion.findByGUIONViFoPpDeb", query = "SELECT g FROM Guion g WHERE g.gUIONViFoPpDeb = :gUIONViFoPpDeb"),
    @NamedQuery(name = "Guion.findByGUIONViFoSeDeb", query = "SELECT g FROM Guion g WHERE g.gUIONViFoSeDeb = :gUIONViFoSeDeb"),
    @NamedQuery(name = "Guion.findByGUIONViFoImDeb", query = "SELECT g FROM Guion g WHERE g.gUIONViFoImDeb = :gUIONViFoImDeb"),
    @NamedQuery(name = "Guion.findByGUIONVisLisOrdb", query = "SELECT g FROM Guion g WHERE g.gUIONVisLisOrdb = :gUIONVisLisOrdb"),
    @NamedQuery(name = "Guion.findByGUIONViLiSeOrb", query = "SELECT g FROM Guion g WHERE g.gUIONViLiSeOrb = :gUIONViLiSeOrb"),
    @NamedQuery(name = "Guion.findByGUIONViHoTiEdb", query = "SELECT g FROM Guion g WHERE g.gUIONViHoTiEdb = :gUIONViHoTiEdb"),
    @NamedQuery(name = "Guion.findByGUIONTipob", query = "SELECT g FROM Guion g WHERE g.gUIONTipob = :gUIONTipob"),
    @NamedQuery(name = "Guion.findByGUIONFechCreab", query = "SELECT g FROM Guion g WHERE g.gUIONFechCreab = :gUIONFechCreab"),
    @NamedQuery(name = "Guion.findByGUIONUsuaCreab", query = "SELECT g FROM Guion g WHERE g.gUIONUsuaCreab = :gUIONUsuaCreab"),
    @NamedQuery(name = "Guion.findByGUIONConsIntePREGUNAgeb", query = "SELECT g FROM Guion g WHERE g.gUIONConsIntePREGUNAgeb = :gUIONConsIntePREGUNAgeb"),
    @NamedQuery(name = "Guion.findByGUIONConsIntePREGUNFecb", query = "SELECT g FROM Guion g WHERE g.gUIONConsIntePREGUNFecb = :gUIONConsIntePREGUNFecb"),
    @NamedQuery(name = "Guion.findByGUIONConsIntePREGUNHorb", query = "SELECT g FROM Guion g WHERE g.gUIONConsIntePREGUNHorb = :gUIONConsIntePREGUNHorb"),
    @NamedQuery(name = "Guion.findByGUIONConsIntePREGUNTipb", query = "SELECT g FROM Guion g WHERE g.gUIONConsIntePREGUNTipb = :gUIONConsIntePREGUNTipb"),
    @NamedQuery(name = "Guion.findByGUIONConsIntePREGUNRepb", query = "SELECT g FROM Guion g WHERE g.gUIONConsIntePREGUNRepb = :gUIONConsIntePREGUNRepb"),
    @NamedQuery(name = "Guion.findByGUIONConsIntePREGUNFagb", query = "SELECT g FROM Guion g WHERE g.gUIONConsIntePREGUNFagb = :gUIONConsIntePREGUNFagb"),
    @NamedQuery(name = "Guion.findByGUIONConsIntePREGUNHagb", query = "SELECT g FROM Guion g WHERE g.gUIONConsIntePREGUNHagb = :gUIONConsIntePREGUNHagb"),
    @NamedQuery(name = "Guion.findByGUIONConsIntePREGUNComb", query = "SELECT g FROM Guion g WHERE g.gUIONConsIntePREGUNComb = :gUIONConsIntePREGUNComb"),
    @NamedQuery(name = "Guion.findByGUIONConsIntePREGUNCamb", query = "SELECT g FROM Guion g WHERE g.gUIONConsIntePREGUNCamb = :gUIONConsIntePREGUNCamb")})
public class Guion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GUION__ConsInte__b", nullable = false)
    private Integer gUIONConsInteb;
    @Basic(optional = false)
    @Column(name = "GUION__Nombre____b", nullable = false, length = 255)
    private String gUIONNombreb;
    @Column(name = "GUION__Descripci_b", length = 255)
    private String gUIONDescripcib;
    @Lob
    @Column(name = "GUION__Observaci_b", length = 2147483647)
    private String gUIONObservacib;
    @Basic(optional = false)
    @Column(name = "GUION__IndGuiNue_b", nullable = false)
    private short gUIONIndGuiNueb;
    @Basic(optional = false)
    @Column(name = "GUION__ColoFond__b", nullable = false)
    private int gUIONColoFondb;
    @Basic(optional = false)
    @Column(name = "GUION__IndiSist__b", nullable = false)
    private short gUIONIndiSistb;
    @Basic(optional = false)
    @Column(name = "GUION__IndiMaes__b", nullable = false)
    private short gUIONIndiMaesb;
    @Basic(optional = false)
    @Column(name = "GUION__TipoPres__b", nullable = false)
    private int gUIONTipoPresb;
    @Basic(optional = false)
    @Column(name = "GUION__IndWorFlo_b", nullable = false)
    private short gUIONIndWorFlob;
    @Column(name = "GUION__MarcCrea__b", length = 255)
    private String gUIONMarcCreab;
    @Column(name = "GUION__IndSinExt_b")
    private Short gUIONIndSinExtb;
    @Lob
    @Column(name = "GUION__ConSinExt_b", length = 2147483647)
    private String gUIONConSinExtb;
    @Column(name = "GUION__DSNSinExt_b", length = 253)
    private String gUIONDSNSinExtb;
    @Column(name = "GUION__UsuSinExt_b", length = 253)
    private String gUIONUsuSinExtb;
    @Column(name = "GUION__PasSinExt_b", length = 253)
    private String gUIONPasSinExtb;
    @Column(name = "GUION__TabSinExt_b", length = 253)
    private String gUIONTabSinExtb;
    @Column(name = "GUION__EstadoWf__b")
    private Integer gUIONEstadoWfb;
    @Column(name = "GUION__ViFoPpDe__b")
    private Integer gUIONViFoPpDeb;
    @Column(name = "GUION__ViFoSeDe__b")
    private Integer gUIONViFoSeDeb;
    @Column(name = "GUION__ViFoImDe__b")
    private Integer gUIONViFoImDeb;
    @Column(name = "GUION__VisLisOrd_b")
    private Integer gUIONVisLisOrdb;
    @Column(name = "GUION__ViLiSeOr__b")
    private Integer gUIONViLiSeOrb;
    @Column(name = "GUION__ViHoTiEd__b")
    private Integer gUIONViHoTiEdb;
    @Column(name = "GUION__Tipo______b")
    private Integer gUIONTipob;
    @Column(name = "GUION__FechCrea__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gUIONFechCreab;
    @Column(name = "GUION__UsuaCrea__b", length = 253)
    private String gUIONUsuaCreab;
    @Column(name = "GUION__ConsInte__PREGUN_Age_b")
    private Integer gUIONConsIntePREGUNAgeb;
    @Column(name = "GUION__ConsInte__PREGUN_Fec_b")
    private Integer gUIONConsIntePREGUNFecb;
    @Column(name = "GUION__ConsInte__PREGUN_Hor_b")
    private Integer gUIONConsIntePREGUNHorb;
    @Column(name = "GUION__ConsInte__PREGUN_Tip_b")
    private Integer gUIONConsIntePREGUNTipb;
    @Column(name = "GUION__ConsInte__PREGUN_Rep_b")
    private Integer gUIONConsIntePREGUNRepb;
    @Column(name = "GUION__ConsInte__PREGUN_Fag_b")
    private Integer gUIONConsIntePREGUNFagb;
    @Column(name = "GUION__ConsInte__PREGUN_Hag_b")
    private Integer gUIONConsIntePREGUNHagb;
    @Column(name = "GUION__ConsInte__PREGUN_Com_b")
    private Integer gUIONConsIntePREGUNComb;
    @Column(name = "GUION__ConsInte__PREGUN_Cam_b")
    private Integer gUIONConsIntePREGUNCamb;
    @JoinColumn(name = "GUION__ConsInte__PROYEC_b", referencedColumnName = "PROYEC_ConsInte__b")
    @ManyToOne
    private Proyec gUIONConsIntePROYECb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mUESTRConsInteGUIONb")
    private List<Muestr> muestrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cAMPANConsInteGUIONGuib")
    private List<Campan> campanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cAMPANConsInteGUIONPobb")
    private List<Campan> campanList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "guion")
    private List<Agenda> agendaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "guion1")
    private List<Agenda> agendaList1;

    public Guion() {
    }

    public Guion(Integer gUIONConsInteb) {
        this.gUIONConsInteb = gUIONConsInteb;
    }

    public Guion(Integer gUIONConsInteb, String gUIONNombreb, short gUIONIndGuiNueb, int gUIONColoFondb, short gUIONIndiSistb, short gUIONIndiMaesb, int gUIONTipoPresb, short gUIONIndWorFlob) {
        this.gUIONConsInteb = gUIONConsInteb;
        this.gUIONNombreb = gUIONNombreb;
        this.gUIONIndGuiNueb = gUIONIndGuiNueb;
        this.gUIONColoFondb = gUIONColoFondb;
        this.gUIONIndiSistb = gUIONIndiSistb;
        this.gUIONIndiMaesb = gUIONIndiMaesb;
        this.gUIONTipoPresb = gUIONTipoPresb;
        this.gUIONIndWorFlob = gUIONIndWorFlob;
    }

    public Integer getGUIONConsInteb() {
        return gUIONConsInteb;
    }

    public void setGUIONConsInteb(Integer gUIONConsInteb) {
        this.gUIONConsInteb = gUIONConsInteb;
    }

    public String getGUIONNombreb() {
        return gUIONNombreb;
    }

    public void setGUIONNombreb(String gUIONNombreb) {
        this.gUIONNombreb = gUIONNombreb;
    }

    public String getGUIONDescripcib() {
        return gUIONDescripcib;
    }

    public void setGUIONDescripcib(String gUIONDescripcib) {
        this.gUIONDescripcib = gUIONDescripcib;
    }

    public String getGUIONObservacib() {
        return gUIONObservacib;
    }

    public void setGUIONObservacib(String gUIONObservacib) {
        this.gUIONObservacib = gUIONObservacib;
    }

    public short getGUIONIndGuiNueb() {
        return gUIONIndGuiNueb;
    }

    public void setGUIONIndGuiNueb(short gUIONIndGuiNueb) {
        this.gUIONIndGuiNueb = gUIONIndGuiNueb;
    }

    public int getGUIONColoFondb() {
        return gUIONColoFondb;
    }

    public void setGUIONColoFondb(int gUIONColoFondb) {
        this.gUIONColoFondb = gUIONColoFondb;
    }

    public short getGUIONIndiSistb() {
        return gUIONIndiSistb;
    }

    public void setGUIONIndiSistb(short gUIONIndiSistb) {
        this.gUIONIndiSistb = gUIONIndiSistb;
    }

    public short getGUIONIndiMaesb() {
        return gUIONIndiMaesb;
    }

    public void setGUIONIndiMaesb(short gUIONIndiMaesb) {
        this.gUIONIndiMaesb = gUIONIndiMaesb;
    }

    public int getGUIONTipoPresb() {
        return gUIONTipoPresb;
    }

    public void setGUIONTipoPresb(int gUIONTipoPresb) {
        this.gUIONTipoPresb = gUIONTipoPresb;
    }

    public short getGUIONIndWorFlob() {
        return gUIONIndWorFlob;
    }

    public void setGUIONIndWorFlob(short gUIONIndWorFlob) {
        this.gUIONIndWorFlob = gUIONIndWorFlob;
    }

    public String getGUIONMarcCreab() {
        return gUIONMarcCreab;
    }

    public void setGUIONMarcCreab(String gUIONMarcCreab) {
        this.gUIONMarcCreab = gUIONMarcCreab;
    }

    public Short getGUIONIndSinExtb() {
        return gUIONIndSinExtb;
    }

    public void setGUIONIndSinExtb(Short gUIONIndSinExtb) {
        this.gUIONIndSinExtb = gUIONIndSinExtb;
    }

    public String getGUIONConSinExtb() {
        return gUIONConSinExtb;
    }

    public void setGUIONConSinExtb(String gUIONConSinExtb) {
        this.gUIONConSinExtb = gUIONConSinExtb;
    }

    public String getGUIONDSNSinExtb() {
        return gUIONDSNSinExtb;
    }

    public void setGUIONDSNSinExtb(String gUIONDSNSinExtb) {
        this.gUIONDSNSinExtb = gUIONDSNSinExtb;
    }

    public String getGUIONUsuSinExtb() {
        return gUIONUsuSinExtb;
    }

    public void setGUIONUsuSinExtb(String gUIONUsuSinExtb) {
        this.gUIONUsuSinExtb = gUIONUsuSinExtb;
    }

    public String getGUIONPasSinExtb() {
        return gUIONPasSinExtb;
    }

    public void setGUIONPasSinExtb(String gUIONPasSinExtb) {
        this.gUIONPasSinExtb = gUIONPasSinExtb;
    }

    public String getGUIONTabSinExtb() {
        return gUIONTabSinExtb;
    }

    public void setGUIONTabSinExtb(String gUIONTabSinExtb) {
        this.gUIONTabSinExtb = gUIONTabSinExtb;
    }

    public Integer getGUIONEstadoWfb() {
        return gUIONEstadoWfb;
    }

    public void setGUIONEstadoWfb(Integer gUIONEstadoWfb) {
        this.gUIONEstadoWfb = gUIONEstadoWfb;
    }

    public Integer getGUIONViFoPpDeb() {
        return gUIONViFoPpDeb;
    }

    public void setGUIONViFoPpDeb(Integer gUIONViFoPpDeb) {
        this.gUIONViFoPpDeb = gUIONViFoPpDeb;
    }

    public Integer getGUIONViFoSeDeb() {
        return gUIONViFoSeDeb;
    }

    public void setGUIONViFoSeDeb(Integer gUIONViFoSeDeb) {
        this.gUIONViFoSeDeb = gUIONViFoSeDeb;
    }

    public Integer getGUIONViFoImDeb() {
        return gUIONViFoImDeb;
    }

    public void setGUIONViFoImDeb(Integer gUIONViFoImDeb) {
        this.gUIONViFoImDeb = gUIONViFoImDeb;
    }

    public Integer getGUIONVisLisOrdb() {
        return gUIONVisLisOrdb;
    }

    public void setGUIONVisLisOrdb(Integer gUIONVisLisOrdb) {
        this.gUIONVisLisOrdb = gUIONVisLisOrdb;
    }

    public Integer getGUIONViLiSeOrb() {
        return gUIONViLiSeOrb;
    }

    public void setGUIONViLiSeOrb(Integer gUIONViLiSeOrb) {
        this.gUIONViLiSeOrb = gUIONViLiSeOrb;
    }

    public Integer getGUIONViHoTiEdb() {
        return gUIONViHoTiEdb;
    }

    public void setGUIONViHoTiEdb(Integer gUIONViHoTiEdb) {
        this.gUIONViHoTiEdb = gUIONViHoTiEdb;
    }

    public Integer getGUIONTipob() {
        return gUIONTipob;
    }

    public void setGUIONTipob(Integer gUIONTipob) {
        this.gUIONTipob = gUIONTipob;
    }

    public Date getGUIONFechCreab() {
        return gUIONFechCreab;
    }

    public void setGUIONFechCreab(Date gUIONFechCreab) {
        this.gUIONFechCreab = gUIONFechCreab;
    }

    public String getGUIONUsuaCreab() {
        return gUIONUsuaCreab;
    }

    public void setGUIONUsuaCreab(String gUIONUsuaCreab) {
        this.gUIONUsuaCreab = gUIONUsuaCreab;
    }

    public Integer getGUIONConsIntePREGUNAgeb() {
        return gUIONConsIntePREGUNAgeb;
    }

    public void setGUIONConsIntePREGUNAgeb(Integer gUIONConsIntePREGUNAgeb) {
        this.gUIONConsIntePREGUNAgeb = gUIONConsIntePREGUNAgeb;
    }

    public Integer getGUIONConsIntePREGUNFecb() {
        return gUIONConsIntePREGUNFecb;
    }

    public void setGUIONConsIntePREGUNFecb(Integer gUIONConsIntePREGUNFecb) {
        this.gUIONConsIntePREGUNFecb = gUIONConsIntePREGUNFecb;
    }

    public Integer getGUIONConsIntePREGUNHorb() {
        return gUIONConsIntePREGUNHorb;
    }

    public void setGUIONConsIntePREGUNHorb(Integer gUIONConsIntePREGUNHorb) {
        this.gUIONConsIntePREGUNHorb = gUIONConsIntePREGUNHorb;
    }

    public Integer getGUIONConsIntePREGUNTipb() {
        return gUIONConsIntePREGUNTipb;
    }

    public void setGUIONConsIntePREGUNTipb(Integer gUIONConsIntePREGUNTipb) {
        this.gUIONConsIntePREGUNTipb = gUIONConsIntePREGUNTipb;
    }

    public Integer getGUIONConsIntePREGUNRepb() {
        return gUIONConsIntePREGUNRepb;
    }

    public void setGUIONConsIntePREGUNRepb(Integer gUIONConsIntePREGUNRepb) {
        this.gUIONConsIntePREGUNRepb = gUIONConsIntePREGUNRepb;
    }

    public Integer getGUIONConsIntePREGUNFagb() {
        return gUIONConsIntePREGUNFagb;
    }

    public void setGUIONConsIntePREGUNFagb(Integer gUIONConsIntePREGUNFagb) {
        this.gUIONConsIntePREGUNFagb = gUIONConsIntePREGUNFagb;
    }

    public Integer getGUIONConsIntePREGUNHagb() {
        return gUIONConsIntePREGUNHagb;
    }

    public void setGUIONConsIntePREGUNHagb(Integer gUIONConsIntePREGUNHagb) {
        this.gUIONConsIntePREGUNHagb = gUIONConsIntePREGUNHagb;
    }

    public Integer getGUIONConsIntePREGUNComb() {
        return gUIONConsIntePREGUNComb;
    }

    public void setGUIONConsIntePREGUNComb(Integer gUIONConsIntePREGUNComb) {
        this.gUIONConsIntePREGUNComb = gUIONConsIntePREGUNComb;
    }

    public Integer getGUIONConsIntePREGUNCamb() {
        return gUIONConsIntePREGUNCamb;
    }

    public void setGUIONConsIntePREGUNCamb(Integer gUIONConsIntePREGUNCamb) {
        this.gUIONConsIntePREGUNCamb = gUIONConsIntePREGUNCamb;
    }

    public Proyec getGUIONConsIntePROYECb() {
        return gUIONConsIntePROYECb;
    }

    public void setGUIONConsIntePROYECb(Proyec gUIONConsIntePROYECb) {
        this.gUIONConsIntePROYECb = gUIONConsIntePROYECb;
    }

    @XmlTransient
    public List<Muestr> getMuestrList() {
        return muestrList;
    }

    public void setMuestrList(List<Muestr> muestrList) {
        this.muestrList = muestrList;
    }

    @XmlTransient
    public List<Campan> getCampanList() {
        return campanList;
    }

    public void setCampanList(List<Campan> campanList) {
        this.campanList = campanList;
    }

    @XmlTransient
    public List<Campan> getCampanList1() {
        return campanList1;
    }

    public void setCampanList1(List<Campan> campanList1) {
        this.campanList1 = campanList1;
    }

    @XmlTransient
    public List<Agenda> getAgendaList() {
        return agendaList;
    }

    public void setAgendaList(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    @XmlTransient
    public List<Agenda> getAgendaList1() {
        return agendaList1;
    }

    public void setAgendaList1(List<Agenda> agendaList1) {
        this.agendaList1 = agendaList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gUIONConsInteb != null ? gUIONConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guion)) {
            return false;
        }
        Guion other = (Guion) object;
        if ((this.gUIONConsInteb == null && other.gUIONConsInteb != null) || (this.gUIONConsInteb != null && !this.gUIONConsInteb.equals(other.gUIONConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicios.bd.tablas.Guion[ gUIONConsInteb=" + gUIONConsInteb + " ]";
    }

}
