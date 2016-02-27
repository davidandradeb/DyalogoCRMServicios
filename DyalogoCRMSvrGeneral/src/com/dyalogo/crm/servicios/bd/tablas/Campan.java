/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dyalogo.crm.servicios.bd.tablas;

import com.dyalogo.crm.servicios.bd.dao_general.ImpEntidadBase;
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
import javax.persistence.JoinTable;
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
@Table(name = "CAMPAN", catalog = "DYALOGOCRM", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"CAMPAN_ConsInte__GUION__Gui_b", "CAMPAN_ConsInte__GUION__Pob_b", "CAMPAN_ConsInte__MUESTR_b"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campan.findAll", query = "SELECT c FROM Campan c"),
    @NamedQuery(name = "Campan.findByCAMPANConsInteb", query = "SELECT c FROM Campan c WHERE c.cAMPANConsInteb = :cAMPANConsInteb"),
    @NamedQuery(name = "Campan.findByCAMPANNombreb", query = "SELECT c FROM Campan c WHERE c.cAMPANNombreb = :cAMPANNombreb"),
    @NamedQuery(name = "Campan.findByCAMPANIndiAbieb", query = "SELECT c FROM Campan c WHERE c.cAMPANIndiAbieb = :cAMPANIndiAbieb"),
    @NamedQuery(name = "Campan.findByCAMPANIndManMetb", query = "SELECT c FROM Campan c WHERE c.cAMPANIndManMetb = :cAMPANIndManMetb"),
    @NamedQuery(name = "Campan.findByCAMPANMetConEfeb", query = "SELECT c FROM Campan c WHERE c.cAMPANMetConEfeb = :cAMPANMetConEfeb"),
    @NamedQuery(name = "Campan.findByCAMPANSentPrinb", query = "SELECT c FROM Campan c WHERE c.cAMPANSentPrinb = :cAMPANSentPrinb"),
    @NamedQuery(name = "Campan.findByCAMPANMarcCreab", query = "SELECT c FROM Campan c WHERE c.cAMPANMarcCreab = :cAMPANMarcCreab"),
    @NamedQuery(name = "Campan.findByCAMPANTipoCampb", query = "SELECT c FROM Campan c WHERE c.cAMPANTipoCampb = :cAMPANTipoCampb"),
    @NamedQuery(name = "Campan.findByCAMPANTipFueTelb", query = "SELECT c FROM Campan c WHERE c.cAMPANTipFueTelb = :cAMPANTipFueTelb"),
    @NamedQuery(name = "Campan.findByCAMPANTieLimReib", query = "SELECT c FROM Campan c WHERE c.cAMPANTieLimReib = :cAMPANTieLimReib"),
    @NamedQuery(name = "Campan.findByCAMPANLimiReinb", query = "SELECT c FROM Campan c WHERE c.cAMPANLimiReinb = :cAMPANLimiReinb"),
    @NamedQuery(name = "Campan.findByCAMPANNoReMiDib", query = "SELECT c FROM Campan c WHERE c.cAMPANNoReMiDib = :cAMPANNoReMiDib"),
    @NamedQuery(name = "Campan.findByCAMPANPerAgrPobb", query = "SELECT c FROM Campan c WHERE c.cAMPANPerAgrPobb = :cAMPANPerAgrPobb"),
    @NamedQuery(name = "Campan.findByCAMPANDiaMaxAgeb", query = "SELECT c FROM Campan c WHERE c.cAMPANDiaMaxAgeb = :cAMPANDiaMaxAgeb"),
    @NamedQuery(name = "Campan.findByCAMPANActPobGuib", query = "SELECT c FROM Campan c WHERE c.cAMPANActPobGuib = :cAMPANActPobGuib"),
    @NamedQuery(name = "Campan.findByCAMPANIdCamCbxb", query = "SELECT c FROM Campan c WHERE c.cAMPANIdCamCbxb = :cAMPANIdCamCbxb"),
    @NamedQuery(name = "Campan.findByCAMPANCamAd1Cbxb", query = "SELECT c FROM Campan c WHERE c.cAMPANCamAd1Cbxb = :cAMPANCamAd1Cbxb"),
    @NamedQuery(name = "Campan.findByCAMPANCamAd2Cbxb", query = "SELECT c FROM Campan c WHERE c.cAMPANCamAd2Cbxb = :cAMPANCamAd2Cbxb"),
    @NamedQuery(name = "Campan.findByCAMPANCamAd3Cbxb", query = "SELECT c FROM Campan c WHERE c.cAMPANCamAd3Cbxb = :cAMPANCamAd3Cbxb"),
    @NamedQuery(name = "Campan.findByCAMPANCamAd4Cbxb", query = "SELECT c FROM Campan c WHERE c.cAMPANCamAd4Cbxb = :cAMPANCamAd4Cbxb"),
    @NamedQuery(name = "Campan.findByCAMPANCamAd5Cbxb", query = "SELECT c FROM Campan c WHERE c.cAMPANCamAd5Cbxb = :cAMPANCamAd5Cbxb"),
    @NamedQuery(name = "Campan.findByCAMPANTipoMarcb", query = "SELECT c FROM Campan c WHERE c.cAMPANTipoMarcb = :cAMPANTipoMarcb"),
    @NamedQuery(name = "Campan.findByCAMPANTimOutCBXb", query = "SELECT c FROM Campan c WHERE c.cAMPANTimOutCBXb = :cAMPANTimOutCBXb"),
    @NamedQuery(name = "Campan.findByCAMPANFechCreab", query = "SELECT c FROM Campan c WHERE c.cAMPANFechCreab = :cAMPANFechCreab"),
    @NamedQuery(name = "Campan.findByCAMPANUsuaCreab", query = "SELECT c FROM Campan c WHERE c.cAMPANUsuaCreab = :cAMPANUsuaCreab"),
    @NamedQuery(name = "Campan.findByCAMPANTipoFiltb", query = "SELECT c FROM Campan c WHERE c.cAMPANTipoFiltb = :cAMPANTipoFiltb"),
    @NamedQuery(name = "Campan.findByCAMPANDistTrabb", query = "SELECT c FROM Campan c WHERE c.cAMPANDistTrabb = :cAMPANDistTrabb"),
    @NamedQuery(name = "Campan.findByCAMPANTipoDistb", query = "SELECT c FROM Campan c WHERE c.cAMPANTipoDistb = :cAMPANTipoDistb"),
    @NamedQuery(name = "Campan.findByCAMPANConsIntePREGUNDisb", query = "SELECT c FROM Campan c WHERE c.cAMPANConsIntePREGUNDisb = :cAMPANConsIntePREGUNDisb"),
    @NamedQuery(name = "Campan.findByCAMPANRedSinGesb", query = "SELECT c FROM Campan c WHERE c.cAMPANRedSinGesb = :cAMPANRedSinGesb"),
    @NamedQuery(name = "Campan.findByCAMPANRedReiAutb", query = "SELECT c FROM Campan c WHERE c.cAMPANRedReiAutb = :cAMPANRedReiAutb"),
    @NamedQuery(name = "Campan.findByCAMPANRedReiAgeb", query = "SELECT c FROM Campan c WHERE c.cAMPANRedReiAgeb = :cAMPANRedReiAgeb"),
    @NamedQuery(name = "Campan.findByCAMPANRedNoReib", query = "SELECT c FROM Campan c WHERE c.cAMPANRedNoReib = :cAMPANRedNoReib"),
    @NamedQuery(name = "Campan.findByCAMPANTimMaxGesb", query = "SELECT c FROM Campan c WHERE c.cAMPANTimMaxGesb = :cAMPANTimMaxGesb"),
    @NamedQuery(name = "Campan.findByCAMPANConsinteOPCIONb", query = "SELECT c FROM Campan c WHERE c.cAMPANConsinteOPCIONb = :cAMPANConsinteOPCIONb"),
    @NamedQuery(name = "Campan.findByCAMPANConfDinamb", query = "SELECT c FROM Campan c WHERE c.cAMPANConfDinamb = :cAMPANConfDinamb"),
    @NamedQuery(name = "Campan.findByCAMPANMarcadorAMDb", query = "SELECT c FROM Campan c WHERE c.cAMPANMarcadorAMDb = :cAMPANMarcadorAMDb")})
public class Campan extends ImpEntidadBase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CAMPAN_ConsInte__b", nullable = false)
    private Integer cAMPANConsInteb;
    @Basic(optional = false)
    @Column(name = "CAMPAN_Nombre____b", nullable = false, length = 50)
    private String cAMPANNombreb;
    @Basic(optional = false)
    @Column(name = "CAMPAN_IndiAbie__b", nullable = false)
    private short cAMPANIndiAbieb;
    @Basic(optional = false)
    @Column(name = "CAMPAN_IndManMet_b", nullable = false)
    private short cAMPANIndManMetb;
    @Column(name = "CAMPAN_MetConEfe_b")
    private Integer cAMPANMetConEfeb;
    @Column(name = "CAMPAN_SentPrin__b", length = 255)
    private String cAMPANSentPrinb;
    @Column(name = "CAMPAN_MarcCrea__b", length = 255)
    private String cAMPANMarcCreab;
    @Column(name = "CAMPAN_TipoCamp__b", length = 50)
    private String cAMPANTipoCampb;
    @Column(name = "CAMPAN_TipFueTel_b", length = 50)
    private String cAMPANTipFueTelb;
    @Basic(optional = false)
    @Column(name = "CAMPAN_TieLimRei_b", nullable = false)
    private short cAMPANTieLimReib;
    @Basic(optional = false)
    @Column(name = "CAMPAN_LimiRein__b", nullable = false)
    private int cAMPANLimiReinb;
    @Column(name = "CAMPAN_NoReMiDi__b")
    private Short cAMPANNoReMiDib;
    @Column(name = "CAMPAN_PerAgrPob_b")
    private Short cAMPANPerAgrPobb;
    @Column(name = "CAMPAN_DiaMaxAge_b")
    private Integer cAMPANDiaMaxAgeb;
    @Column(name = "CAMPAN_ActPobGui_b")
    private Short cAMPANActPobGuib;
    @Column(name = "CAMPAN_IdCamCbx__b")
    private Integer cAMPANIdCamCbxb;
    @Column(name = "CAMPAN_CamAd1Cbx_b")
    private Integer cAMPANCamAd1Cbxb;
    @Column(name = "CAMPAN_CamAd2Cbx_b")
    private Integer cAMPANCamAd2Cbxb;
    @Column(name = "CAMPAN_CamAd3Cbx_b")
    private Integer cAMPANCamAd3Cbxb;
    @Column(name = "CAMPAN_CamAd4Cbx_b")
    private Integer cAMPANCamAd4Cbxb;
    @Column(name = "CAMPAN_CamAd5Cbx_b")
    private Integer cAMPANCamAd5Cbxb;
    @Column(name = "CAMPAN_TipoMarc__b")
    private Integer cAMPANTipoMarcb;
    @Column(name = "CAMPAN_TimOutCBX_b")
    private Integer cAMPANTimOutCBXb;
    @Column(name = "CAMPAN_FechCrea__b")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cAMPANFechCreab;
    @Column(name = "CAMPAN_UsuaCrea__b", length = 253)
    private String cAMPANUsuaCreab;
    @Lob
    @Column(name = "CAMPAN_DescFilt__b", length = 2147483647)
    private String cAMPANDescFiltb;
    @Column(name = "CAMPAN_TipoFilt__b")
    private Integer cAMPANTipoFiltb;
    @Lob
    @Column(name = "CAMPAN_CondFilt__b", length = 2147483647)
    private String cAMPANCondFiltb;
    @Column(name = "CAMPAN_DistTrab__b")
    private Integer cAMPANDistTrabb;
    @Column(name = "CAMPAN_TipoDist__b")
    private Integer cAMPANTipoDistb;
    @Column(name = "CAMPAN_ConsInte__PREGUN_Dis_b")
    private Integer cAMPANConsIntePREGUNDisb;
    @Column(name = "CAMPAN_RedSinGes_b")
    private Short cAMPANRedSinGesb;
    @Column(name = "CAMPAN_RedReiAut_b")
    private Short cAMPANRedReiAutb;
    @Column(name = "CAMPAN_RedReiAge_b")
    private Short cAMPANRedReiAgeb;
    @Column(name = "CAMPAN_RedNo_Rei_b")
    private Short cAMPANRedNoReib;
    @Column(name = "CAMPAN_TimMaxGes_b")
    private Integer cAMPANTimMaxGesb;
    @Column(name = "CAMPAN_Consinte__OPCION_b")
    private Integer cAMPANConsinteOPCIONb;
    @Column(name = "CAMPAN_ConfDinam_b")
    private Integer cAMPANConfDinamb;
    @Basic(optional = false)
    @Column(name = "CAMPAN_MarcadorAMD_b", nullable = false)
    private short cAMPANMarcadorAMDb;
    @JoinTable(name = "usdica", joinColumns = {
        @JoinColumn(name = "USDICA_ConsInte__CAMPAN_b", referencedColumnName = "CAMPAN_ConsInte__b", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "USDICA_ConsInte__USUARI_b", referencedColumnName = "USUARI_ConsInte__b", nullable = false)})
    @ManyToMany
    private List<Usuari> usuariList;
    @JoinColumn(name = "CAMPAN_ConsInte__MUESTR_b", referencedColumnName = "MUESTR_ConsInte__b", nullable = false)
    @ManyToOne(optional = false)
    private Muestr cAMPANConsInteMUESTRb;
    @JoinColumn(name = "CAMPAN_ConsInte__GUION__Gui_b", referencedColumnName = "GUION__ConsInte__b", nullable = false)
    @ManyToOne(optional = false)
    private Guion cAMPANConsInteGUIONGuib;
    @JoinColumn(name = "CAMPAN_ConsInte__GUION__Pob_b", referencedColumnName = "GUION__ConsInte__b", nullable = false)
    @ManyToOne(optional = false)
    private Guion cAMPANConsInteGUIONPobb;
    @JoinColumn(name = "CAMPAN_ConsInte__PROYEC_b", referencedColumnName = "PROYEC_ConsInte__b")
    @ManyToOne
    private Proyec cAMPANConsIntePROYECb;
    @OneToMany(mappedBy = "aGENDAConsInteCAMPANb")
    private List<Agenda> agendaList;

    public Campan() {
    }

    public Campan(Integer cAMPANConsInteb) {
        this.cAMPANConsInteb = cAMPANConsInteb;
    }

    public Campan(Integer cAMPANConsInteb, String cAMPANNombreb, short cAMPANIndiAbieb, short cAMPANIndManMetb, short cAMPANTieLimReib, int cAMPANLimiReinb, short cAMPANMarcadorAMDb) {
        this.cAMPANConsInteb = cAMPANConsInteb;
        this.cAMPANNombreb = cAMPANNombreb;
        this.cAMPANIndiAbieb = cAMPANIndiAbieb;
        this.cAMPANIndManMetb = cAMPANIndManMetb;
        this.cAMPANTieLimReib = cAMPANTieLimReib;
        this.cAMPANLimiReinb = cAMPANLimiReinb;
        this.cAMPANMarcadorAMDb = cAMPANMarcadorAMDb;
    }

    public Integer getCAMPANConsInteb() {
        return cAMPANConsInteb;
    }

    public void setCAMPANConsInteb(Integer cAMPANConsInteb) {
        this.cAMPANConsInteb = cAMPANConsInteb;
    }

    public String getCAMPANNombreb() {
        return cAMPANNombreb;
    }

    public void setCAMPANNombreb(String cAMPANNombreb) {
        this.cAMPANNombreb = cAMPANNombreb;
    }

    public short getCAMPANIndiAbieb() {
        return cAMPANIndiAbieb;
    }

    public void setCAMPANIndiAbieb(short cAMPANIndiAbieb) {
        this.cAMPANIndiAbieb = cAMPANIndiAbieb;
    }

    public short getCAMPANIndManMetb() {
        return cAMPANIndManMetb;
    }

    public void setCAMPANIndManMetb(short cAMPANIndManMetb) {
        this.cAMPANIndManMetb = cAMPANIndManMetb;
    }

    public Integer getCAMPANMetConEfeb() {
        return cAMPANMetConEfeb;
    }

    public void setCAMPANMetConEfeb(Integer cAMPANMetConEfeb) {
        this.cAMPANMetConEfeb = cAMPANMetConEfeb;
    }

    public String getCAMPANSentPrinb() {
        return cAMPANSentPrinb;
    }

    public void setCAMPANSentPrinb(String cAMPANSentPrinb) {
        this.cAMPANSentPrinb = cAMPANSentPrinb;
    }

    public String getCAMPANMarcCreab() {
        return cAMPANMarcCreab;
    }

    public void setCAMPANMarcCreab(String cAMPANMarcCreab) {
        this.cAMPANMarcCreab = cAMPANMarcCreab;
    }

    public String getCAMPANTipoCampb() {
        return cAMPANTipoCampb;
    }

    public void setCAMPANTipoCampb(String cAMPANTipoCampb) {
        this.cAMPANTipoCampb = cAMPANTipoCampb;
    }

    public String getCAMPANTipFueTelb() {
        return cAMPANTipFueTelb;
    }

    public void setCAMPANTipFueTelb(String cAMPANTipFueTelb) {
        this.cAMPANTipFueTelb = cAMPANTipFueTelb;
    }

    public short getCAMPANTieLimReib() {
        return cAMPANTieLimReib;
    }

    public void setCAMPANTieLimReib(short cAMPANTieLimReib) {
        this.cAMPANTieLimReib = cAMPANTieLimReib;
    }

    public int getCAMPANLimiReinb() {
        return cAMPANLimiReinb;
    }

    public void setCAMPANLimiReinb(int cAMPANLimiReinb) {
        this.cAMPANLimiReinb = cAMPANLimiReinb;
    }

    public Short getCAMPANNoReMiDib() {
        return cAMPANNoReMiDib;
    }

    public void setCAMPANNoReMiDib(Short cAMPANNoReMiDib) {
        this.cAMPANNoReMiDib = cAMPANNoReMiDib;
    }

    public Short getCAMPANPerAgrPobb() {
        return cAMPANPerAgrPobb;
    }

    public void setCAMPANPerAgrPobb(Short cAMPANPerAgrPobb) {
        this.cAMPANPerAgrPobb = cAMPANPerAgrPobb;
    }

    public Integer getCAMPANDiaMaxAgeb() {
        return cAMPANDiaMaxAgeb;
    }

    public void setCAMPANDiaMaxAgeb(Integer cAMPANDiaMaxAgeb) {
        this.cAMPANDiaMaxAgeb = cAMPANDiaMaxAgeb;
    }

    public Short getCAMPANActPobGuib() {
        return cAMPANActPobGuib;
    }

    public void setCAMPANActPobGuib(Short cAMPANActPobGuib) {
        this.cAMPANActPobGuib = cAMPANActPobGuib;
    }

    public Integer getCAMPANIdCamCbxb() {
        return cAMPANIdCamCbxb;
    }

    public void setCAMPANIdCamCbxb(Integer cAMPANIdCamCbxb) {
        this.cAMPANIdCamCbxb = cAMPANIdCamCbxb;
    }

    public Integer getCAMPANCamAd1Cbxb() {
        return cAMPANCamAd1Cbxb;
    }

    public void setCAMPANCamAd1Cbxb(Integer cAMPANCamAd1Cbxb) {
        this.cAMPANCamAd1Cbxb = cAMPANCamAd1Cbxb;
    }

    public Integer getCAMPANCamAd2Cbxb() {
        return cAMPANCamAd2Cbxb;
    }

    public void setCAMPANCamAd2Cbxb(Integer cAMPANCamAd2Cbxb) {
        this.cAMPANCamAd2Cbxb = cAMPANCamAd2Cbxb;
    }

    public Integer getCAMPANCamAd3Cbxb() {
        return cAMPANCamAd3Cbxb;
    }

    public void setCAMPANCamAd3Cbxb(Integer cAMPANCamAd3Cbxb) {
        this.cAMPANCamAd3Cbxb = cAMPANCamAd3Cbxb;
    }

    public Integer getCAMPANCamAd4Cbxb() {
        return cAMPANCamAd4Cbxb;
    }

    public void setCAMPANCamAd4Cbxb(Integer cAMPANCamAd4Cbxb) {
        this.cAMPANCamAd4Cbxb = cAMPANCamAd4Cbxb;
    }

    public Integer getCAMPANCamAd5Cbxb() {
        return cAMPANCamAd5Cbxb;
    }

    public void setCAMPANCamAd5Cbxb(Integer cAMPANCamAd5Cbxb) {
        this.cAMPANCamAd5Cbxb = cAMPANCamAd5Cbxb;
    }

    public Integer getCAMPANTipoMarcb() {
        return cAMPANTipoMarcb;
    }

    public void setCAMPANTipoMarcb(Integer cAMPANTipoMarcb) {
        this.cAMPANTipoMarcb = cAMPANTipoMarcb;
    }

    public Integer getCAMPANTimOutCBXb() {
        return cAMPANTimOutCBXb;
    }

    public void setCAMPANTimOutCBXb(Integer cAMPANTimOutCBXb) {
        this.cAMPANTimOutCBXb = cAMPANTimOutCBXb;
    }

    public Date getCAMPANFechCreab() {
        return cAMPANFechCreab;
    }

    public void setCAMPANFechCreab(Date cAMPANFechCreab) {
        this.cAMPANFechCreab = cAMPANFechCreab;
    }

    public String getCAMPANUsuaCreab() {
        return cAMPANUsuaCreab;
    }

    public void setCAMPANUsuaCreab(String cAMPANUsuaCreab) {
        this.cAMPANUsuaCreab = cAMPANUsuaCreab;
    }

    public String getCAMPANDescFiltb() {
        return cAMPANDescFiltb;
    }

    public void setCAMPANDescFiltb(String cAMPANDescFiltb) {
        this.cAMPANDescFiltb = cAMPANDescFiltb;
    }

    public Integer getCAMPANTipoFiltb() {
        return cAMPANTipoFiltb;
    }

    public void setCAMPANTipoFiltb(Integer cAMPANTipoFiltb) {
        this.cAMPANTipoFiltb = cAMPANTipoFiltb;
    }

    public String getCAMPANCondFiltb() {
        return cAMPANCondFiltb;
    }

    public void setCAMPANCondFiltb(String cAMPANCondFiltb) {
        this.cAMPANCondFiltb = cAMPANCondFiltb;
    }

    public Integer getCAMPANDistTrabb() {
        return cAMPANDistTrabb;
    }

    public void setCAMPANDistTrabb(Integer cAMPANDistTrabb) {
        this.cAMPANDistTrabb = cAMPANDistTrabb;
    }

    public Integer getCAMPANTipoDistb() {
        return cAMPANTipoDistb;
    }

    public void setCAMPANTipoDistb(Integer cAMPANTipoDistb) {
        this.cAMPANTipoDistb = cAMPANTipoDistb;
    }

    public Integer getCAMPANConsIntePREGUNDisb() {
        return cAMPANConsIntePREGUNDisb;
    }

    public void setCAMPANConsIntePREGUNDisb(Integer cAMPANConsIntePREGUNDisb) {
        this.cAMPANConsIntePREGUNDisb = cAMPANConsIntePREGUNDisb;
    }

    public Short getCAMPANRedSinGesb() {
        return cAMPANRedSinGesb;
    }

    public void setCAMPANRedSinGesb(Short cAMPANRedSinGesb) {
        this.cAMPANRedSinGesb = cAMPANRedSinGesb;
    }

    public Short getCAMPANRedReiAutb() {
        return cAMPANRedReiAutb;
    }

    public void setCAMPANRedReiAutb(Short cAMPANRedReiAutb) {
        this.cAMPANRedReiAutb = cAMPANRedReiAutb;
    }

    public Short getCAMPANRedReiAgeb() {
        return cAMPANRedReiAgeb;
    }

    public void setCAMPANRedReiAgeb(Short cAMPANRedReiAgeb) {
        this.cAMPANRedReiAgeb = cAMPANRedReiAgeb;
    }

    public Short getCAMPANRedNoReib() {
        return cAMPANRedNoReib;
    }

    public void setCAMPANRedNoReib(Short cAMPANRedNoReib) {
        this.cAMPANRedNoReib = cAMPANRedNoReib;
    }

    public Integer getCAMPANTimMaxGesb() {
        return cAMPANTimMaxGesb;
    }

    public void setCAMPANTimMaxGesb(Integer cAMPANTimMaxGesb) {
        this.cAMPANTimMaxGesb = cAMPANTimMaxGesb;
    }

    public Integer getCAMPANConsinteOPCIONb() {
        return cAMPANConsinteOPCIONb;
    }

    public void setCAMPANConsinteOPCIONb(Integer cAMPANConsinteOPCIONb) {
        this.cAMPANConsinteOPCIONb = cAMPANConsinteOPCIONb;
    }

    public Integer getCAMPANConfDinamb() {
        return cAMPANConfDinamb;
    }

    public void setCAMPANConfDinamb(Integer cAMPANConfDinamb) {
        this.cAMPANConfDinamb = cAMPANConfDinamb;
    }

    public short getCAMPANMarcadorAMDb() {
        return cAMPANMarcadorAMDb;
    }

    public void setCAMPANMarcadorAMDb(short cAMPANMarcadorAMDb) {
        this.cAMPANMarcadorAMDb = cAMPANMarcadorAMDb;
    }

    @XmlTransient
    public List<Usuari> getUsuariList() {
        return usuariList;
    }

    public void setUsuariList(List<Usuari> usuariList) {
        this.usuariList = usuariList;
    }

    public Muestr getCAMPANConsInteMUESTRb() {
        return cAMPANConsInteMUESTRb;
    }

    public void setCAMPANConsInteMUESTRb(Muestr cAMPANConsInteMUESTRb) {
        this.cAMPANConsInteMUESTRb = cAMPANConsInteMUESTRb;
    }

    public Guion getCAMPANConsInteGUIONGuib() {
        return cAMPANConsInteGUIONGuib;
    }

    public void setCAMPANConsInteGUIONGuib(Guion cAMPANConsInteGUIONGuib) {
        this.cAMPANConsInteGUIONGuib = cAMPANConsInteGUIONGuib;
    }

    public Guion getCAMPANConsInteGUIONPobb() {
        return cAMPANConsInteGUIONPobb;
    }

    public void setCAMPANConsInteGUIONPobb(Guion cAMPANConsInteGUIONPobb) {
        this.cAMPANConsInteGUIONPobb = cAMPANConsInteGUIONPobb;
    }

    public Proyec getCAMPANConsIntePROYECb() {
        return cAMPANConsIntePROYECb;
    }

    public void setCAMPANConsIntePROYECb(Proyec cAMPANConsIntePROYECb) {
        this.cAMPANConsIntePROYECb = cAMPANConsIntePROYECb;
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
        hash += (cAMPANConsInteb != null ? cAMPANConsInteb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campan)) {
            return false;
        }
        Campan other = (Campan) object;
        if ((this.cAMPANConsInteb == null && other.cAMPANConsInteb != null) || (this.cAMPANConsInteb != null && !this.cAMPANConsInteb.equals(other.cAMPANConsInteb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dyalogo.crm.servicios.bd.tablas.Campan[ cAMPANConsInteb=" + cAMPANConsInteb + " ]";
    }

}
