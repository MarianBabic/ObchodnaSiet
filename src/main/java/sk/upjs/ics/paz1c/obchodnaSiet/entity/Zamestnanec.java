package sk.upjs.ics.paz1c.obchodnaSiet.entity;

import java.sql.Date;

public class Zamestnanec {

    private Integer id;
    private String meno;
    private String priezvisko;
    private Integer prevadzkaId;
    private Date datumNastupu;
    private double platBrutto;

    public Zamestnanec() {
    }

    public Zamestnanec(String meno, String priezvisko, Integer prevadzkaId, Date datumNastupu, double platBrutto) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.prevadzkaId = prevadzkaId;
        this.datumNastupu = datumNastupu;
        this.platBrutto = platBrutto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public Integer getPrevadzkaId() {
        return prevadzkaId;
    }

    public void setPrevadzkaId(Integer prevadzkaId) {
        this.prevadzkaId = prevadzkaId;
    }

    public Date getDatumNastupu() {
        return datumNastupu;
    }

    public void setDatumNastupu(Date datumNastupu) {
        this.datumNastupu = datumNastupu;
    }

    public double getPlatBrutto() {
        return platBrutto;
    }

    public void setPlatBrutto(double platBrutto) {
        this.platBrutto = platBrutto;
    }

    @Override
    public String toString() {
        return meno + " " + priezvisko + " (id: " + id + ", id prevádzky: " + prevadzkaId + ", dátum nástupu: " + datumNastupu + ", plat brutto: " + platBrutto + ")";
    }

}
