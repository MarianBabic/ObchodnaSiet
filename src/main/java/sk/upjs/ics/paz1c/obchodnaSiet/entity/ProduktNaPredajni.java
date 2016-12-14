package sk.upjs.ics.paz1c.obchodnaSiet.entity;

public class ProduktNaPredajni {

    private Integer produktId;
    private Integer prevadzkaId;
    private double zlava;
    private int kusy;

    public ProduktNaPredajni() {
    }

    public ProduktNaPredajni(Integer produktId, Integer prevadzkaId, double zlava, int kusy) {
        this.produktId = produktId;
        this.prevadzkaId = prevadzkaId;
        this.zlava = zlava;
        this.kusy = kusy;
    }

    public Integer getProduktId() {
        return produktId;
    }

    public void setProduktId(Integer produktId) {
        this.produktId = produktId;
    }

    public Integer getPrevadzkaId() {
        return prevadzkaId;
    }

    public void setPrevadzkaId(Integer prevadzkaId) {
        this.prevadzkaId = prevadzkaId;
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
        return "id produktu: " + produktId + ", id predajne: " + prevadzkaId + ", zľava: " + zlava + "počet kusov: " + kusy;
    }

}
