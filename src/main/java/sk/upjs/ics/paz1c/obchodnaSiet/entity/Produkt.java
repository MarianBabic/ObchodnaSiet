package sk.upjs.ics.paz1c.obchodnaSiet.entity;

public class Produkt {

    private int id;
    private String nazov;
    private double nakupnaCena;
    private double predajnaCena;

    public Produkt() {
    }

    public Produkt(String nazov, double nakupnaCena, double predajnaCena) {
        this.nazov = nazov;
        this.nakupnaCena = nakupnaCena;
        this.predajnaCena = predajnaCena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public double getNakupnaCena() {
        return nakupnaCena;
    }

    public void setNakupnaCena(double nakupnaCena) {
        this.nakupnaCena = nakupnaCena;
    }

    public double getPredajnaCena() {
        return predajnaCena;
    }

    public void setPredajnaCena(double predajnaCena) {
        this.predajnaCena = predajnaCena;
    }

    @Override
    public String toString() {
        return "Produkt{" + "id=" + id + ", nazov=" + nazov + ", nakupnaCena=" + nakupnaCena + ", predajnaCena=" + predajnaCena + '}';
    }

}
