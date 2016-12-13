package sk.upjs.ics.paz1c.obchodnaSiet.entity;

import java.sql.Date;

public class Naklad {

    private int id;
    private int prevadzkaId;
    private String popis;
    private Date datum;
    private double suma;

    public Naklad() {
    }

    public Naklad(int prevadzkaId, String popis, Date datum, double suma) {
        this.prevadzkaId = prevadzkaId;
        this.popis = popis;
        this.datum = datum;
        this.suma = suma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrevadzkaId() {
        return prevadzkaId;
    }

    public void setPrevadzkaId(int prevadzkaId) {
        this.prevadzkaId = prevadzkaId;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "Naklad{" + "id=" + id + ", prevadzkaId=" + prevadzkaId + ", popis=" + popis + ", datum=" + datum + ", suma=" + suma + '}';
    }

}
