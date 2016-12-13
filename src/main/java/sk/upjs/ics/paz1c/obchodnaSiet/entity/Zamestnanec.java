package sk.upjs.ics.paz1c.obchodnaSiet.entity;

public class Zamestnanec {

    private int id;
    private String meno;
    private String priezvisko;
    private Prevadzka prevadzka;
    private double odpracovanyCas;
    private double ziskZPredaja;
    private double platBrutto;

    // for Spring
    public Zamestnanec() {
    }

    public Zamestnanec(String meno, String priezvisko, Prevadzka prevadzka, double odpracovanyCas, double ziskZPredaja, double platBrutto) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.prevadzka = prevadzka;
        this.odpracovanyCas = odpracovanyCas;
        this.ziskZPredaja = ziskZPredaja;
        this.platBrutto = platBrutto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Prevadzka getPrevadzka() {
        return prevadzka;
    }

    public void setPrevadzka(Prevadzka prevadzka) {
        this.prevadzka = prevadzka;
    }

    public double getOdpracovanyCas() {
        return odpracovanyCas;
    }

    public void setOdpracovanyCas(double odpracovanyCas) {
        this.odpracovanyCas = odpracovanyCas;
    }

    public double getZiskZPredaja() {
        return ziskZPredaja;
    }

    public void setZiskZPredaja(double ziskZPredaja) {
        this.ziskZPredaja = ziskZPredaja;
    }

    public double getPlatBrutto() {
        return platBrutto;
    }

    public void setPlatBrutto(double platBrutto) {
        this.platBrutto = platBrutto;
    }

    @Override
    public String toString() {
        return "Zamestnanec{" + "id=" + id + ", meno=" + meno + ", priezvisko=" + priezvisko + ", prevadzka=" + prevadzka + ", odpracovanyCas=" + odpracovanyCas + ", ziskZPredaja=" + ziskZPredaja + ", platBrutto=" + platBrutto + '}';
    }

}
