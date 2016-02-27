/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dyalogo.crm.servicios.bd.tablas;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "PreguntaCampo", catalog = "DYALOGOCRM", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Preguntacampo.findAll", query = "SELECT p FROM Preguntacampo p"),
    @NamedQuery(name = "Preguntacampo.findByCAMPOConsInteb", query = "SELECT p FROM Preguntacampo p WHERE p.cAMPOConsInteb = :cAMPOConsInteb"),
    @NamedQuery(name = "Preguntacampo.findByCAMPONombreb", query = "SELECT p FROM Preguntacampo p WHERE p.cAMPONombreb = :cAMPONombreb"),
    @NamedQuery(name = "Preguntacampo.findByCAMPOTipob", query = "SELECT p FROM Preguntacampo p WHERE p.cAMPOTipob = :cAMPOTipob"),
    @NamedQuery(name = "Preguntacampo.findByCAMPOConsIntePREGUNb", query = "SELECT p FROM Preguntacampo p WHERE p.cAMPOConsIntePREGUNb = :cAMPOConsIntePREGUNb"),
    @NamedQuery(name = "Preguntacampo.findByCAMPOIndiRequb", query = "SELECT p FROM Preguntacampo p WHERE p.cAMPOIndiRequb = :cAMPOIndiRequb"),
    @NamedQuery(name = "Preguntacampo.findByCAMPOIndiUnicb", query = "SELECT p FROM Preguntacampo p WHERE p.cAMPOIndiUnicb = :cAMPOIndiUnicb"),
    @NamedQuery(name = "Preguntacampo.findByCAMPOIndTipModb", query = "SELECT p FROM Preguntacampo p WHERE p.cAMPOIndTipModb = :cAMPOIndTipModb"),
    @NamedQuery(name = "Preguntacampo.findByCAMPOIndCamProb", query = "SELECT p FROM Preguntacampo p WHERE p.cAMPOIndCamProb = :cAMPOIndCamProb"),
    @NamedQuery(name = "Preguntacampo.findByCAMPOInCaTiCab", query = "SELECT p FROM Preguntacampo p WHERE p.cAMPOInCaTiCab = :cAMPOInCaTiCab"),
    @NamedQuery(name = "Preguntacampo.findByCAMPOInCaInUnb", query = "SELECT p FROM Preguntacampo p WHERE p.cAMPOInCaInUnb = :cAMPOInCaInUnb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNConsInteb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNConsInteb = :pREGUNConsInteb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNConsInteGUIONb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNConsInteGUIONb = :pREGUNConsInteGUIONb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNCodigob", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNCodigob = :pREGUNCodigob"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNTipob", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNTipob = :pREGUNTipob"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNNumeMinib", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNNumeMinib = :pREGUNNumeMinib"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNNumeMaxib", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNNumeMaxib = :pREGUNNumeMaxib"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNFechMinib", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNFechMinib = :pREGUNFechMinib"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNFechMaxib", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNFechMaxib = :pREGUNFechMaxib"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNHoraMinib", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNHoraMinib = :pREGUNHoraMinib"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNHoraMaxib", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNHoraMaxib = :pREGUNHoraMaxib"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNTexErrValb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNTexErrValb = :pREGUNTexErrValb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNFormTextb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNFormTextb = :pREGUNFormTextb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNConsInteCAMPOb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNConsInteCAMPOb = :pREGUNConsInteCAMPOb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNIndiRequb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNIndiRequb = :pREGUNIndiRequb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNIndiUnicb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNIndiUnicb = :pREGUNIndiUnicb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNNumeRespb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNNumeRespb = :pREGUNNumeRespb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNConsInteSECCIOb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNConsInteSECCIOb = :pREGUNConsInteSECCIOb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNIndTipBolb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNIndTipBolb = :pREGUNIndTipBolb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNOrdePregb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNOrdePregb = :pREGUNOrdePregb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNColTexPreb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNColTexPreb = :pREGUNColTexPreb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNColTexResb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNColTexResb = :pREGUNColTexResb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNColFonResb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNColFonResb = :pREGUNColFonResb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNIndiEncab", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNIndiEncab = :pREGUNIndiEncab"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNIndiBuscb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNIndiBuscb = :pREGUNIndiBuscb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNConsInteGUIONPREB", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNConsInteGUIONPREB = :pREGUNConsInteGUIONPREB"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNConsInteOPCIONB", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNConsInteOPCIONB = :pREGUNConsInteOPCIONB"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNMarcCreab", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNMarcCreab = :pREGUNMarcCreab"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNDefaultb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNDefaultb = :pREGUNDefaultb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNContAcceb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNContAcceb = :pREGUNContAcceb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNDefUniFecb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNDefUniFecb = :pREGUNDefUniFecb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNDefCanFecb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNDefCanFecb = :pREGUNDefCanFecb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNDefaNumeb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNDefaNumeb = :pREGUNDefaNumeb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNDefaTextb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNDefaTextb = :pREGUNDefaTextb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNIndiEncrb", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNIndiEncrb = :pREGUNIndiEncrb"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNFormatob", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNFormatob = :pREGUNFormatob"),
    @NamedQuery(name = "Preguntacampo.findByPREGUNCantDecib", query = "SELECT p FROM Preguntacampo p WHERE p.pREGUNCantDecib = :pREGUNCantDecib")})
public class Preguntacampo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "CAMPO__ConsInte__b", nullable = false)
    private int cAMPOConsInteb;
    @Column(name = "CAMPO__Nombre____b", length = 50)
    private String cAMPONombreb;
    @Column(name = "CAMPO__Tipo______b", length = 50)
    private String cAMPOTipob;
    @Column(name = "CAMPO__ConsInte__PREGUN_b")
    private Integer cAMPOConsIntePREGUNb;
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
    @Basic(optional = false)
    @Column(name = "PREGUN_ConsInte__b", nullable = false)
    @Id
    private int pREGUNConsInteb;
    @Column(name = "PREGUN_ConsInte__GUION__b")
    private Integer pREGUNConsInteGUIONb;
    @Column(name = "PREGUN_Codigo____b", length = 8)
    private String pREGUNCodigob;
    @Basic(optional = false)
    @Lob
    @Column(name = "PREGUN_Texto_____b", nullable = false, length = 2147483647)
    private String pREGUNTextob;
    @Basic(optional = false)
    @Column(name = "PREGUN_Tipo______b", nullable = false)
    private short pREGUNTipob;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PREGUN_NumeMini__b", precision = 22)
    private Double pREGUNNumeMinib;
    @Column(name = "PREGUN_NumeMaxi__b", precision = 22)
    private Double pREGUNNumeMaxib;
    @Column(name = "PREGUN_FechMini__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pREGUNFechMinib;
    @Column(name = "PREGUN_FechMaxi__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pREGUNFechMaxib;
    @Column(name = "PREGUN_HoraMini__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pREGUNHoraMinib;
    @Column(name = "PREGUN_HoraMaxi__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pREGUNHoraMaxib;
    @Column(name = "PREGUN_TexErrVal_b", length = 255)
    private String pREGUNTexErrValb;
    @Column(name = "PREGUN_FormText__b", length = 1)
    private String pREGUNFormTextb;
    @Column(name = "PREGUN_ConsInte__CAMPO__b")
    private Integer pREGUNConsInteCAMPOb;
    @Basic(optional = false)
    @Column(name = "PREGUN_IndiRequ__b", nullable = false)
    private short pREGUNIndiRequb;
    @Basic(optional = false)
    @Column(name = "PREGUN_IndiUnic__b", nullable = false)
    private short pREGUNIndiUnicb;
    @Basic(optional = false)
    @Column(name = "PREGUN_NumeResp__b", nullable = false)
    private short pREGUNNumeRespb;
    @Basic(optional = false)
    @Column(name = "PREGUN_ConsInte__SECCIO_b", nullable = false)
    private int pREGUNConsInteSECCIOb;
    @Column(name = "PREGUN_IndTipBol_b", precision = 22)
    private Double pREGUNIndTipBolb;
    @Column(name = "PREGUN_OrdePreg__b")
    private Short pREGUNOrdePregb;
    @Column(name = "PREGUN_ColTexPre_b")
    private Integer pREGUNColTexPreb;
    @Column(name = "PREGUN_ColTexRes_b")
    private Integer pREGUNColTexResb;
    @Column(name = "PREGUN_ColFonRes_b")
    private Integer pREGUNColFonResb;
    @Basic(optional = false)
    @Column(name = "PREGUN_IndiEnca__b", nullable = false)
    private short pREGUNIndiEncab;
    @Basic(optional = false)
    @Column(name = "PREGUN_IndiBusc__b", nullable = false)
    private short pREGUNIndiBuscb;
    @Column(name = "PREGUN_ConsInte__GUION__PRE_B")
    private Integer pREGUNConsInteGUIONPREB;
    @Column(name = "PREGUN_ConsInte__OPCION_B")
    private Integer pREGUNConsInteOPCIONB;
    @Column(name = "PREGUN_MarcCrea__b", length = 255)
    private String pREGUNMarcCreab;
    @Column(name = "PREGUN_Default___b")
    private Short pREGUNDefaultb;
    @Column(name = "PREGUN_ContAcce__b")
    private Integer pREGUNContAcceb;
    @Column(name = "PREGUN_DefUniFec_b", length = 255)
    private String pREGUNDefUniFecb;
    @Column(name = "PREGUN_DefCanFec_b")
    private Integer pREGUNDefCanFecb;
    @Column(name = "PREGUN_DefaNume__b", precision = 22)
    private Double pREGUNDefaNumeb;
    @Column(name = "PREGUN_DefaText__b", length = 255)
    private String pREGUNDefaTextb;
    @Column(name = "PREGUN_IndiEncr__b")
    private Short pREGUNIndiEncrb;
    @Column(name = "PREGUN_Formato___b")
    private Integer pREGUNFormatob;
    @Column(name = "PREGUN_CantDeci__b")
    private Integer pREGUNCantDecib;

    public Preguntacampo() {
    }

    public int getCAMPOConsInteb() {
        return cAMPOConsInteb;
    }

    public void setCAMPOConsInteb(int cAMPOConsInteb) {
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

    public Integer getCAMPOConsIntePREGUNb() {
        return cAMPOConsIntePREGUNb;
    }

    public void setCAMPOConsIntePREGUNb(Integer cAMPOConsIntePREGUNb) {
        this.cAMPOConsIntePREGUNb = cAMPOConsIntePREGUNb;
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

    public int getPREGUNConsInteb() {
        return pREGUNConsInteb;
    }

    public void setPREGUNConsInteb(int pREGUNConsInteb) {
        this.pREGUNConsInteb = pREGUNConsInteb;
    }

    public Integer getPREGUNConsInteGUIONb() {
        return pREGUNConsInteGUIONb;
    }

    public void setPREGUNConsInteGUIONb(Integer pREGUNConsInteGUIONb) {
        this.pREGUNConsInteGUIONb = pREGUNConsInteGUIONb;
    }

    public String getPREGUNCodigob() {
        return pREGUNCodigob;
    }

    public void setPREGUNCodigob(String pREGUNCodigob) {
        this.pREGUNCodigob = pREGUNCodigob;
    }

    public String getPREGUNTextob() {
        return pREGUNTextob;
    }

    public void setPREGUNTextob(String pREGUNTextob) {
        this.pREGUNTextob = pREGUNTextob;
    }

    public short getPREGUNTipob() {
        return pREGUNTipob;
    }

    public void setPREGUNTipob(short pREGUNTipob) {
        this.pREGUNTipob = pREGUNTipob;
    }

    public Double getPREGUNNumeMinib() {
        return pREGUNNumeMinib;
    }

    public void setPREGUNNumeMinib(Double pREGUNNumeMinib) {
        this.pREGUNNumeMinib = pREGUNNumeMinib;
    }

    public Double getPREGUNNumeMaxib() {
        return pREGUNNumeMaxib;
    }

    public void setPREGUNNumeMaxib(Double pREGUNNumeMaxib) {
        this.pREGUNNumeMaxib = pREGUNNumeMaxib;
    }

    public Date getPREGUNFechMinib() {
        return pREGUNFechMinib;
    }

    public void setPREGUNFechMinib(Date pREGUNFechMinib) {
        this.pREGUNFechMinib = pREGUNFechMinib;
    }

    public Date getPREGUNFechMaxib() {
        return pREGUNFechMaxib;
    }

    public void setPREGUNFechMaxib(Date pREGUNFechMaxib) {
        this.pREGUNFechMaxib = pREGUNFechMaxib;
    }

    public Date getPREGUNHoraMinib() {
        return pREGUNHoraMinib;
    }

    public void setPREGUNHoraMinib(Date pREGUNHoraMinib) {
        this.pREGUNHoraMinib = pREGUNHoraMinib;
    }

    public Date getPREGUNHoraMaxib() {
        return pREGUNHoraMaxib;
    }

    public void setPREGUNHoraMaxib(Date pREGUNHoraMaxib) {
        this.pREGUNHoraMaxib = pREGUNHoraMaxib;
    }

    public String getPREGUNTexErrValb() {
        return pREGUNTexErrValb;
    }

    public void setPREGUNTexErrValb(String pREGUNTexErrValb) {
        this.pREGUNTexErrValb = pREGUNTexErrValb;
    }

    public String getPREGUNFormTextb() {
        return pREGUNFormTextb;
    }

    public void setPREGUNFormTextb(String pREGUNFormTextb) {
        this.pREGUNFormTextb = pREGUNFormTextb;
    }

    public Integer getPREGUNConsInteCAMPOb() {
        return pREGUNConsInteCAMPOb;
    }

    public void setPREGUNConsInteCAMPOb(Integer pREGUNConsInteCAMPOb) {
        this.pREGUNConsInteCAMPOb = pREGUNConsInteCAMPOb;
    }

    public short getPREGUNIndiRequb() {
        return pREGUNIndiRequb;
    }

    public void setPREGUNIndiRequb(short pREGUNIndiRequb) {
        this.pREGUNIndiRequb = pREGUNIndiRequb;
    }

    public short getPREGUNIndiUnicb() {
        return pREGUNIndiUnicb;
    }

    public void setPREGUNIndiUnicb(short pREGUNIndiUnicb) {
        this.pREGUNIndiUnicb = pREGUNIndiUnicb;
    }

    public short getPREGUNNumeRespb() {
        return pREGUNNumeRespb;
    }

    public void setPREGUNNumeRespb(short pREGUNNumeRespb) {
        this.pREGUNNumeRespb = pREGUNNumeRespb;
    }

    public int getPREGUNConsInteSECCIOb() {
        return pREGUNConsInteSECCIOb;
    }

    public void setPREGUNConsInteSECCIOb(int pREGUNConsInteSECCIOb) {
        this.pREGUNConsInteSECCIOb = pREGUNConsInteSECCIOb;
    }

    public Double getPREGUNIndTipBolb() {
        return pREGUNIndTipBolb;
    }

    public void setPREGUNIndTipBolb(Double pREGUNIndTipBolb) {
        this.pREGUNIndTipBolb = pREGUNIndTipBolb;
    }

    public Short getPREGUNOrdePregb() {
        return pREGUNOrdePregb;
    }

    public void setPREGUNOrdePregb(Short pREGUNOrdePregb) {
        this.pREGUNOrdePregb = pREGUNOrdePregb;
    }

    public Integer getPREGUNColTexPreb() {
        return pREGUNColTexPreb;
    }

    public void setPREGUNColTexPreb(Integer pREGUNColTexPreb) {
        this.pREGUNColTexPreb = pREGUNColTexPreb;
    }

    public Integer getPREGUNColTexResb() {
        return pREGUNColTexResb;
    }

    public void setPREGUNColTexResb(Integer pREGUNColTexResb) {
        this.pREGUNColTexResb = pREGUNColTexResb;
    }

    public Integer getPREGUNColFonResb() {
        return pREGUNColFonResb;
    }

    public void setPREGUNColFonResb(Integer pREGUNColFonResb) {
        this.pREGUNColFonResb = pREGUNColFonResb;
    }

    public short getPREGUNIndiEncab() {
        return pREGUNIndiEncab;
    }

    public void setPREGUNIndiEncab(short pREGUNIndiEncab) {
        this.pREGUNIndiEncab = pREGUNIndiEncab;
    }

    public short getPREGUNIndiBuscb() {
        return pREGUNIndiBuscb;
    }

    public void setPREGUNIndiBuscb(short pREGUNIndiBuscb) {
        this.pREGUNIndiBuscb = pREGUNIndiBuscb;
    }

    public Integer getPREGUNConsInteGUIONPREB() {
        return pREGUNConsInteGUIONPREB;
    }

    public void setPREGUNConsInteGUIONPREB(Integer pREGUNConsInteGUIONPREB) {
        this.pREGUNConsInteGUIONPREB = pREGUNConsInteGUIONPREB;
    }

    public Integer getPREGUNConsInteOPCIONB() {
        return pREGUNConsInteOPCIONB;
    }

    public void setPREGUNConsInteOPCIONB(Integer pREGUNConsInteOPCIONB) {
        this.pREGUNConsInteOPCIONB = pREGUNConsInteOPCIONB;
    }

    public String getPREGUNMarcCreab() {
        return pREGUNMarcCreab;
    }

    public void setPREGUNMarcCreab(String pREGUNMarcCreab) {
        this.pREGUNMarcCreab = pREGUNMarcCreab;
    }

    public Short getPREGUNDefaultb() {
        return pREGUNDefaultb;
    }

    public void setPREGUNDefaultb(Short pREGUNDefaultb) {
        this.pREGUNDefaultb = pREGUNDefaultb;
    }

    public Integer getPREGUNContAcceb() {
        return pREGUNContAcceb;
    }

    public void setPREGUNContAcceb(Integer pREGUNContAcceb) {
        this.pREGUNContAcceb = pREGUNContAcceb;
    }

    public String getPREGUNDefUniFecb() {
        return pREGUNDefUniFecb;
    }

    public void setPREGUNDefUniFecb(String pREGUNDefUniFecb) {
        this.pREGUNDefUniFecb = pREGUNDefUniFecb;
    }

    public Integer getPREGUNDefCanFecb() {
        return pREGUNDefCanFecb;
    }

    public void setPREGUNDefCanFecb(Integer pREGUNDefCanFecb) {
        this.pREGUNDefCanFecb = pREGUNDefCanFecb;
    }

    public Double getPREGUNDefaNumeb() {
        return pREGUNDefaNumeb;
    }

    public void setPREGUNDefaNumeb(Double pREGUNDefaNumeb) {
        this.pREGUNDefaNumeb = pREGUNDefaNumeb;
    }

    public String getPREGUNDefaTextb() {
        return pREGUNDefaTextb;
    }

    public void setPREGUNDefaTextb(String pREGUNDefaTextb) {
        this.pREGUNDefaTextb = pREGUNDefaTextb;
    }

    public Short getPREGUNIndiEncrb() {
        return pREGUNIndiEncrb;
    }

    public void setPREGUNIndiEncrb(Short pREGUNIndiEncrb) {
        this.pREGUNIndiEncrb = pREGUNIndiEncrb;
    }

    public Integer getPREGUNFormatob() {
        return pREGUNFormatob;
    }

    public void setPREGUNFormatob(Integer pREGUNFormatob) {
        this.pREGUNFormatob = pREGUNFormatob;
    }

    public Integer getPREGUNCantDecib() {
        return pREGUNCantDecib;
    }

    public void setPREGUNCantDecib(Integer pREGUNCantDecib) {
        this.pREGUNCantDecib = pREGUNCantDecib;
    }

}
