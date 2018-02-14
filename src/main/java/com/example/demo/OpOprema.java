/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author sandi
 */
@Entity
@Table(name = "OP_OPREMA")
@NamedQueries({
    @NamedQuery(name = "OpOprema.findAll", query = "SELECT o FROM OpOprema o")
    , @NamedQuery(name = "OpOprema.findByInvStv", query = "SELECT o FROM OpOprema o WHERE o.invStv = :invStv")
    , @NamedQuery(name = "OpOprema.findByNaziv", query = "SELECT o FROM OpOprema o WHERE o.naziv = :naziv")
    , @NamedQuery(name = "OpOprema.findByVrNabavna", query = "SELECT o FROM OpOprema o WHERE o.vrNabavna = :vrNabavna")
    , @NamedQuery(name = "OpOprema.findByDtVnosa", query = "SELECT o FROM OpOprema o WHERE o.dtVnosa = :dtVnosa")
    , @NamedQuery(name = "OpOprema.findByVnasalec", query = "SELECT o FROM OpOprema o WHERE o.vnasalec = :vnasalec")
    , @NamedQuery(name = "OpOprema.findByTip", query = "SELECT o FROM OpOprema o WHERE o.tip = :tip")
    , @NamedQuery(name = "OpOprema.findByDtNabave", query = "SELECT o FROM OpOprema o WHERE o.dtNabave = :dtNabave")
    , @NamedQuery(name = "OpOprema.findByOezr", query = "SELECT o FROM OpOprema o WHERE o.oezr = :oezr")
    , @NamedQuery(name = "OpOprema.findByVrZaAmor", query = "SELECT o FROM OpOprema o WHERE o.vrZaAmor = :vrZaAmor")
    , @NamedQuery(name = "OpOprema.findByDtIzlocitve", query = "SELECT o FROM OpOprema o WHERE o.dtIzlocitve = :dtIzlocitve")
    , @NamedQuery(name = "OpOprema.findByStatus", query = "SELECT o FROM OpOprema o WHERE o.status = :status")
    , @NamedQuery(name = "OpOprema.findByNarocilo", query = "SELECT o FROM OpOprema o WHERE o.narocilo = :narocilo")
    , @NamedQuery(name = "OpOprema.findByRacun", query = "SELECT o FROM OpOprema o WHERE o.racun = :racun")
    , @NamedQuery(name = "OpOprema.findByIdPpDobavitelj", query = "SELECT o FROM OpOprema o WHERE o.idPpDobavitelj = :idPpDobavitelj")
    , @NamedQuery(name = "OpOprema.findByDobOznaka", query = "SELECT o FROM OpOprema o WHERE o.dobOznaka = :dobOznaka")
    , @NamedQuery(name = "OpOprema.findBySerijskaStv", query = "SELECT o FROM OpOprema o WHERE o.serijskaStv = :serijskaStv")
    , @NamedQuery(name = "OpOprema.findByTehPodatki", query = "SELECT o FROM OpOprema o WHERE o.tehPodatki = :tehPodatki")
    , @NamedQuery(name = "OpOprema.findByDtGarancijaDo", query = "SELECT o FROM OpOprema o WHERE o.dtGarancijaDo = :dtGarancijaDo")
    , @NamedQuery(name = "OpOprema.findByJeDel", query = "SELECT o FROM OpOprema o WHERE o.jeDel = :jeDel")
    , @NamedQuery(name = "OpOprema.findByDnOs", query = "SELECT o FROM OpOprema o WHERE o.dnOs = :dnOs")
    , @NamedQuery(name = "OpOprema.findByLokacija", query = "SELECT o FROM OpOprema o WHERE o.lokacija = :lokacija")
    , @NamedQuery(name = "OpOprema.findByDtZaAmor", query = "SELECT o FROM OpOprema o WHERE o.dtZaAmor = :dtZaAmor")
    , @NamedQuery(name = "OpOprema.findByAmorSkupina", query = "SELECT o FROM OpOprema o WHERE o.amorSkupina = :amorSkupina")
    , @NamedQuery(name = "OpOprema.findBySkrbnik", query = "SELECT o FROM OpOprema o WHERE o.skrbnik = :skrbnik")
    , @NamedQuery(name = "OpOprema.findBySfDokumenta", query = "SELECT o FROM OpOprema o WHERE o.sfDokumenta = :sfDokumenta")
    , @NamedQuery(name = "OpOprema.findByDtDokumenta", query = "SELECT o FROM OpOprema o WHERE o.dtDokumenta = :dtDokumenta")
    , @NamedQuery(name = "OpOprema.findByComputerName", query = "SELECT o FROM OpOprema o WHERE o.computerName = :computerName")
    , @NamedQuery(name = "OpOprema.findByAkcija", query = "SELECT o FROM OpOprema o WHERE o.akcija = :akcija")
    , @NamedQuery(name = "OpOprema.findByZadolzen", query = "SELECT o FROM OpOprema o WHERE o.zadolzen = :zadolzen")
    , @NamedQuery(name = "OpOprema.findByStanje", query = "SELECT o FROM OpOprema o WHERE o.stanje = :stanje")
    , @NamedQuery(name = "OpOprema.findByVrIzlocitve", query = "SELECT o FROM OpOprema o WHERE o.vrIzlocitve = :vrIzlocitve")
    , @NamedQuery(name = "OpOprema.findByStrMes", query = "SELECT o FROM OpOprema o WHERE o.strMes = :strMes")
    , @NamedQuery(name = "OpOprema.findByStrNos", query = "SELECT o FROM OpOprema o WHERE o.strNos = :strNos")
    , @NamedQuery(name = "OpOprema.findByFunGlej", query = "SELECT o FROM OpOprema o WHERE o.funGlej = :funGlej")
    , @NamedQuery(name = "OpOprema.findByFunVnos", query = "SELECT o FROM OpOprema o WHERE o.funVnos = :funVnos")})
public class OpOprema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "INV_STV")
    private String invStv;
    @Size(max = 64)
    @Column(name = "NAZIV")
    private String naziv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VR_NABAVNA")
    private BigDecimal vrNabavna;
    @Column(name = "DT_VNOSA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtVnosa;
    @Size(max = 30)
    @Column(name = "VNASALEC")
    private String vnasalec;
    @Size(max = 10)
    @Column(name = "TIP")
    private String tip;
    @Column(name = "DT_NABAVE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtNabave;
    @Size(max = 6)
    @Column(name = "OEZR")
    private String oezr;
    @Column(name = "VR_ZA_AMOR")
    private BigDecimal vrZaAmor;
    @Column(name = "DT_IZLOCITVE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtIzlocitve;
    @Column(name = "STATUS")
    private Short status;
    @Size(max = 16)
    @Column(name = "NAROCILO")
    private String narocilo;
    @Size(max = 16)
    @Column(name = "RACUN")
    private String racun;
    @Size(max = 10)
    @Column(name = "ID_PP_DOBAVITELJ")
    private String idPpDobavitelj;
    @Size(max = 30)
    @Column(name = "DOB_OZNAKA")
    private String dobOznaka;
    @Size(max = 30)
    @Column(name = "SERIJSKA_STV")
    private String serijskaStv;
    @Size(max = 80)
    @Column(name = "TEH_PODATKI")
    private String tehPodatki;
    @Column(name = "DT_GARANCIJA_DO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtGarancijaDo;
    @Size(max = 10)
    @Column(name = "JE_DEL")
    private String jeDel;
    @Size(max = 1)
    @Column(name = "DN_OS")
    private String dnOs;
    @Size(max = 10)
    @Column(name = "LOKACIJA")
    private String lokacija;
    @Column(name = "DT_ZA_AMOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtZaAmor;
    @Size(max = 10)
    @Column(name = "AMOR_SKUPINA")
    private String amorSkupina;
    @Size(max = 120)
    @Column(name = "SKRBNIK")
    private String skrbnik;
    @Size(max = 10)
    @Column(name = "SF_DOKUMENTA")
    private String sfDokumenta;
    @Column(name = "DT_DOKUMENTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtDokumenta;
    @Size(max = 10)
    @Column(name = "COMPUTER_NAME")
    private String computerName;
    @Size(max = 10)
    @Column(name = "AKCIJA")
    private String akcija;
    @Size(max = 30)
    @Column(name = "ZADOLZEN")
    private String zadolzen;
    @Size(max = 1)
    @Column(name = "STANJE")
    private String stanje;
    @Column(name = "VR_IZLOCITVE")
    private BigDecimal vrIzlocitve;
    @Size(max = 10)
    @Column(name = "STR_MES")
    private String strMes;
    @Size(max = 10)
    @Column(name = "STR_NOS")
    private String strNos;
    @Size(max = 30)
    @Column(name = "FUN_GLEJ")
    private String funGlej;
    @Size(max = 30)
    @Column(name = "FUN_VNOS")
    private String funVnos;

    public OpOprema() {
    }

    public OpOprema(String invStv) {
        this.invStv = invStv;
    }

    public String getInvStv() {
        return invStv;
    }

    public void setInvStv(String invStv) {
        this.invStv = invStv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getVrNabavna() {
        return vrNabavna;
    }

    public void setVrNabavna(BigDecimal vrNabavna) {
        this.vrNabavna = vrNabavna;
    }

    public Date getDtVnosa() {
        return dtVnosa;
    }

    public void setDtVnosa(Date dtVnosa) {
        this.dtVnosa = dtVnosa;
    }

    public String getVnasalec() {
        return vnasalec;
    }

    public void setVnasalec(String vnasalec) {
        this.vnasalec = vnasalec;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Date getDtNabave() {
        return dtNabave;
    }

    public void setDtNabave(Date dtNabave) {
        this.dtNabave = dtNabave;
    }

    public String getOezr() {
        return oezr;
    }

    public void setOezr(String oezr) {
        this.oezr = oezr;
    }

    public BigDecimal getVrZaAmor() {
        return vrZaAmor;
    }

    public void setVrZaAmor(BigDecimal vrZaAmor) {
        this.vrZaAmor = vrZaAmor;
    }

    public Date getDtIzlocitve() {
        return dtIzlocitve;
    }

    public void setDtIzlocitve(Date dtIzlocitve) {
        this.dtIzlocitve = dtIzlocitve;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getNarocilo() {
        return narocilo;
    }

    public void setNarocilo(String narocilo) {
        this.narocilo = narocilo;
    }

    public String getRacun() {
        return racun;
    }

    public void setRacun(String racun) {
        this.racun = racun;
    }

    public String getIdPpDobavitelj() {
        return idPpDobavitelj;
    }

    public void setIdPpDobavitelj(String idPpDobavitelj) {
        this.idPpDobavitelj = idPpDobavitelj;
    }

    public String getDobOznaka() {
        return dobOznaka;
    }

    public void setDobOznaka(String dobOznaka) {
        this.dobOznaka = dobOznaka;
    }

    public String getSerijskaStv() {
        return serijskaStv;
    }

    public void setSerijskaStv(String serijskaStv) {
        this.serijskaStv = serijskaStv;
    }

    public String getTehPodatki() {
        return tehPodatki;
    }

    public void setTehPodatki(String tehPodatki) {
        this.tehPodatki = tehPodatki;
    }

    public Date getDtGarancijaDo() {
        return dtGarancijaDo;
    }

    public void setDtGarancijaDo(Date dtGarancijaDo) {
        this.dtGarancijaDo = dtGarancijaDo;
    }

    public String getJeDel() {
        return jeDel;
    }

    public void setJeDel(String jeDel) {
        this.jeDel = jeDel;
    }

    public String getDnOs() {
        return dnOs;
    }

    public void setDnOs(String dnOs) {
        this.dnOs = dnOs;
    }

    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public Date getDtZaAmor() {
        return dtZaAmor;
    }

    public void setDtZaAmor(Date dtZaAmor) {
        this.dtZaAmor = dtZaAmor;
    }

    public String getAmorSkupina() {
        return amorSkupina;
    }

    public void setAmorSkupina(String amorSkupina) {
        this.amorSkupina = amorSkupina;
    }

    public String getSkrbnik() {
        return skrbnik;
    }

    public void setSkrbnik(String skrbnik) {
        this.skrbnik = skrbnik;
    }

    public String getSfDokumenta() {
        return sfDokumenta;
    }

    public void setSfDokumenta(String sfDokumenta) {
        this.sfDokumenta = sfDokumenta;
    }

    public Date getDtDokumenta() {
        return dtDokumenta;
    }

    public void setDtDokumenta(Date dtDokumenta) {
        this.dtDokumenta = dtDokumenta;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getAkcija() {
        return akcija;
    }

    public void setAkcija(String akcija) {
        this.akcija = akcija;
    }

    public String getZadolzen() {
        return zadolzen;
    }

    public void setZadolzen(String zadolzen) {
        this.zadolzen = zadolzen;
    }

    public String getStanje() {
        return stanje;
    }

    public void setStanje(String stanje) {
        this.stanje = stanje;
    }

    public BigDecimal getVrIzlocitve() {
        return vrIzlocitve;
    }

    public void setVrIzlocitve(BigDecimal vrIzlocitve) {
        this.vrIzlocitve = vrIzlocitve;
    }

    public String getStrMes() {
        return strMes;
    }

    public void setStrMes(String strMes) {
        this.strMes = strMes;
    }

    public String getStrNos() {
        return strNos;
    }

    public void setStrNos(String strNos) {
        this.strNos = strNos;
    }

    public String getFunGlej() {
        return funGlej;
    }

    public void setFunGlej(String funGlej) {
        this.funGlej = funGlej;
    }

    public String getFunVnos() {
        return funVnos;
    }

    public void setFunVnos(String funVnos) {
        this.funVnos = funVnos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invStv != null ? invStv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpOprema)) {
            return false;
        }
        OpOprema other = (OpOprema) object;
        if ((this.invStv == null && other.invStv != null) || (this.invStv != null && !this.invStv.equals(other.invStv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.OpOprema[ invStv=" + invStv + " ]";
    }
    
}
