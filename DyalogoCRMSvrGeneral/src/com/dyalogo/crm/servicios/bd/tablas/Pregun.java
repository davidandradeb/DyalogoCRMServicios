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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DYALOGOSAS.davidandrade
 */
@Entity
@Table(name = "PREGUN", catalog = "DYALOGOCRM", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pregun.findAll", query = "SELECT p FROM Pregun p"),
    @NamedQuery(name = "Pregun.findByPREGUNConsInteb", query = "SELECT p FROM Pregun p WHERE p.pREGUNConsInteb = :pREGUNConsInteb"),
    @NamedQuery(name = "Pregun.findByPREGUNConsInteGUIONb", query = "SELECT p FROM Pregun p WHERE p.pREGUNConsInteGUIONb = :pREGUNConsInteGUIONb"),
    @NamedQuery(name = "Pregun.findByPREGUNCodigob", query = "SELECT p FROM Pregun p WHERE p.pREGUNCodigob = :pREGUNCodigob"),
    @NamedQuery(name = "Pregun.findByPREGUNTipob", query = "SELECT p FROM Pregun p WHERE p.pREGUNTipob = :pREGUNTipob"),
    @NamedQuery(name = "Pregun.findByPREGUNNumeMinib", query = "SELECT p FROM Pregun p WHERE p.pREGUNNumeMinib = :pREGUNNumeMinib"),
    @NamedQuery(name = "Pregun.findByPREGUNNumeMaxib", query = "SELECT p FROM Pregun p WHERE p.pREGUNNumeMaxib = :pREGUNNumeMaxib"),
    @NamedQuery(name = "Pregun.findByPREGUNFechMinib", query = "SELECT p FROM Pregun p WHERE p.pREGUNFechMinib = :pREGUNFechMinib"),
    @NamedQuery(name = "Pregun.findByPREGUNFechMaxib", query = "SELECT p FROM Pregun p WHERE p.pREGUNFechMaxib = :pREGUNFechMaxib"),
    @NamedQuery(name = "Pregun.findByPREGUNHoraMinib", query = "SELECT p FROM Pregun p WHERE p.pREGUNHoraMinib = :pREGUNHoraMinib"),
    @NamedQuery(name = "Pregun.findByPREGUNHoraMaxib", query = "SELECT p FROM Pregun p WHERE p.pREGUNHoraMaxib = :pREGUNHoraMaxib"),
    @NamedQuery(name = "Pregun.findByPREGUNTexErrValb", query = "SELECT p FROM Pregun p WHERE p.pREGUNTexErrValb = :pREGUNTexErrValb"),
    @NamedQuery(name = "Pregun.findByPREGUNFormTextb", query = "SELECT p FROM Pregun p WHERE p.pREGUNFormTextb = :pREGUNFormTextb"),
    @NamedQuery(name = "Pregun.findByPREGUNConsInteCAMPOb", query = "SELECT p FROM Pregun p WHERE p.pREGUNConsInteCAMPOb = :pREGUNConsInteCAMPOb"),
    @NamedQuery(name = "Pregun.findByPREGUNIndiRequb", query = "SELECT p FROM Pregun p WHERE p.pREGUNIndiRequb = :pREGUNIndiRequb"),
    @NamedQuery(name = "Pregun.findByPREGUNIndiUnicb", query = "SELECT p FROM Pregun p WHERE p.pREGUNIndiUnicb = :pREGUNIndiUnicb"),
    @NamedQuery(name = "Pregun.findByPREGUNNumeRespb", query = "SELECT p FROM Pregun p WHERE p.pREGUNNumeRespb = :pREGUNNumeRespb"),
    @NamedQuery(name = "Pregun.findByPREGUNConsInteSECCIOb", query = "SELECT p FROM Pregun p WHERE p.pREGUNConsInteSECCIOb = :pREGUNConsInteSECCIOb"),
    @NamedQuery(name = "Pregun.findByPREGUNIndTipBolb", query = "SELECT p FROM Pregun p WHERE p.pREGUNIndTipBolb = :pREGUNIndTipBolb"),
    @NamedQuery(name = "Pregun.findByPREGUNOrdePregb", query = "SELECT p FROM Pregun p WHERE p.pREGUNOrdePregb = :pREGUNOrdePregb"),
    @NamedQuery(name = "Pregun.findByPREGUNColTexPreb", query = "SELECT p FROM Pregun p WHERE p.pREGUNColTexPreb = :pREGUNColTexPreb"),
    @NamedQuery(name = "Pregun.findByPREGUNColTexResb", query = "SELECT p FROM Pregun p WHERE p.pREGUNColTexResb = :pREGUNColTexResb"),
    @NamedQuery(name = "Pregun.findByPREGUNColFonResb", query = "SELECT p FROM Pregun p WHERE p.pREGUNColFonResb = :pREGUNColFonResb"),
    @NamedQuery(name = "Pregun.findByPREGUNIndiEncab", query = "SELECT p FROM Pregun p WHERE p.pREGUNIndiEncab = :pREGUNIndiEncab"),
    @NamedQuery(name = "Pregun.findByPREGUNIndiBuscb", query = "SELECT p FROM Pregun p WHERE p.pREGUNIndiBuscb = :pREGUNIndiBuscb"),
    @NamedQuery(name = "Pregun.findByPREGUNConsInteGUIONPREB", query = "SELECT p FROM Pregun p WHERE p.pREGUNConsInteGUIONPREB = :pREGUNConsInteGUIONPREB"),
    @NamedQuery(name = "Pregun.findByPREGUNConsInteOPCIONB", query = "SELECT p FROM Pregun p WHERE p.pREGUNConsInteOPCIONB = :pREGUNConsInteOPCIONB"),
    @NamedQuery(name = "Pregun.findByPREGUNMarcCreab", query = "SELECT p FROM Pregun p WHERE p.pREGUNMarcCreab = :pREGUNMarcCreab"),
    @NamedQuery(name = "Pregun.findByPREGUNDefaultb", query = "SELECT p FROM Pregun p WHERE p.pREGUNDefaultb = :pREGUNDefaultb"),
    @NamedQuery(name = "Pregun.findByPREGUNContAcceb", query = "SELECT p FROM Pregun p WHERE p.pREGUNContAcceb = :pREGUNContAcceb"),
    @NamedQuery(name = "Pregun.findByPREGUNDefUniFecb", query = "SELECT p FROM Pregun p WHERE p.pREGUNDefUniFecb = :pREGUNDefUniFecb"),
    @NamedQuery(name = "Pregun.findByPREGUNDefCanFecb", query = "SELECT p FROM Pregun p WHERE p.pREGUNDefCanFecb = :pREGUNDefCanFecb"),
    @NamedQuery(name = "Pregun.findByPREGUNDefaNumeb", query = "SELECT p FROM Pregun p WHERE p.pREGUNDefaNumeb = :pREGUNDefaNumeb"),
    @NamedQuery(name = "Pregun.findByPREGUNDefaTextb", query = "SELECT p FROM Pregun p WHERE p.pREGUNDefaTextb = :pREGUNDefaTextb"),
    @NamedQuery(name = "Pregun.findByPREGUNIndiEncrb", query = "SELECT p FROM Pregun p WHERE p.pREGUNIndiEncrb = :pREGUNIndiEncrb"),
    @NamedQuery(name = "Pregun.findByPREGUNFormatob", query = "SELECT p FROM Pregun p WHERE p.pREGUNFormatob = :pREGUNFormatob"),
    @NamedQuery(name = "Pregun.findByPREGUNCantDecib", query = "SELECT p FROM Pregun p WHERE p.pREGUNCantDecib = :pREGUNCantDecib")})
public class Pregun implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PREGUN_ConsInte__b", nullable = false)
    private Integer pREGUNConsInteb;
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
    @OneToOne(mappedBy = "cAMPOConsIntePREGUNb")
    private Campo campo;

    public Pregun() {
    }

    public Pregun(Integer pREGUNConsInteb) {
        this.pREGUNConsInteb = pREGUNConsInteb;
    }

    public Pregun(Integer pREGUNConsInteb, String pREGUNTextob, short pREGUNTipob, short pREGUNIndiRequb, short pREGUNIndiUnicb, short pREGUNNumeRespb, int pREGUNConsInteSECCIOb, short pREGUNIndiEncab, short pREGUNIndiBuscb) {
        this.pREGUNConsInteb = pREGUNConsInteb;
        this.pREGUNTextob = pREGUNTextob;
        this.pREGUNTipob = pREGUNTipob;
        this.pREGUNIndiRequb = pREGUNIndiRequb;
        this.pREGUNIndiUnicb = pREGUNIndiUnicb;
        this.pREGUNNumeRespb = pREGUNNumeRespb;
        this.pREGUNConsInteSECCIOb = pREGUNConsInteSECCIOb;
        this.pREGUNIndiEncab = pREGUNIndiEncab;
        this.pREGUNIndiBuscb = pREGUNIndiBuscb;
    }

    public Integer getPREGUNConsInteb() {
        return pREGUNConsInteb;
    }

    public void setPREGUNConsInteb(Integer pREGUNConsInteb) {
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

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pREGUNConsInteb != null ? pREGUNConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pregun)) {
            return false;
        }
        Pregun other = (Pregun) object;
        if ((this.pREGUNConsInteb == null && other.pREGUNConsInteb != null) || (this.pREGUNConsInteb != null && !this.pREGUNConsInteb.equals(other.pREGUNConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicios.bd.tablas.Pregun[ pREGUNConsInteb=" + pREGUNConsInteb + " ]";
    }

}
