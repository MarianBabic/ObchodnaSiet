package entity;

import java.sql.Date;

public class Naklad {

    private int id;
    private Prevadzka prevadzka;
    private String popis;
    private Date datum;
    private double suma;

    // for Spring
    public Naklad() {
    }

    public Naklad(Prevadzka prevadzka, String popis, Date datum, double suma) {
        this.prevadzka = prevadzka;
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
    
    public Prevadzka getPrevadzka() {
        return prevadzka;
    }

    public void setPrevadzka(Prevadzka prevadzka) {
        this.prevadzka = prevadzka;
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
        return "Naklad{" + "id=" + id + ", prevadzka=" + prevadzka + ", popis=" + popis + ", datum=" + datum + ", suma=" + suma + '}';
    }

}
