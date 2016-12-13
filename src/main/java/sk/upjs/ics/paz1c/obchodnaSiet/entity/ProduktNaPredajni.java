package sk.upjs.ics.paz1c.obchodnaSiet.entity;

public class ProduktNaPredajni {

    private int produktId;
    private int prevadzkaId;
    private double zlava;
    private int kusy;

    public ProduktNaPredajni() {
    }

    public ProduktNaPredajni(int produktId, int prevadzkaId, double zlava, int kusy) {
        this.produktId = produktId;
        this.prevadzkaId = prevadzkaId;
        this.zlava = zlava;
        this.kusy = kusy;
    }

    public int getProduktId() {
        return produktId;
    }

    public void setProduktId(int produktId) {
        this.produktId = produktId;
    }

    public int getPrevadzkaId() {
        return prevadzkaId;
    }

    public void setPrevadzkaId(int prevadzkaId) {
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
        return "ProduktNaPredajni{" + "produktId=" + produktId + ", prevadzkaId=" + prevadzkaId + ", zlava=" + zlava + ", kusy=" + kusy + '}';
    }

}
