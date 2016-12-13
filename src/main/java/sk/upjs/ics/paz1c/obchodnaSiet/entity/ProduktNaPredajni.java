package sk.upjs.ics.paz1c.obchodnaSiet.entity;

public class ProduktNaPredajni {

    private Produkt produkt;
    private Prevadzka prevadzka;
    private double zlava;
    private int kusy;

    // for Spring
    public ProduktNaPredajni() {
    }

    public ProduktNaPredajni(Produkt produkt, Prevadzka prevadzka, double zlava, int kusy) {
        this.produkt = produkt;
        this.prevadzka = prevadzka;
        this.zlava = zlava;
        this.kusy = kusy;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public Prevadzka getPrevadzka() {
        return prevadzka;
    }

    public void setPrevadzka(Prevadzka prevadzka) {
        this.prevadzka = prevadzka;
    }

    public double getZlava() {
        return zlava;
    }

    public void setZlava(double zlava) {
        this.zlava = zlava;
    }

    public int getKusy() {
        return kusy;
    }

    public void setKusy(int kusy) {
        this.kusy = kusy;
    }

    @Override
    public String toString() {
        return "ProduktNaPredajni{" + "produkt=" + produkt + ", prevadzka=" + prevadzka + ", zlava=" + zlava + ", kusy=" + kusy + '}';
    }

}
