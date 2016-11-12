package entity;

public class Pobocka {

    private Long id;
    private String nazov;
    private String adresa;

    // TODO
    // co to ma uchovavat? ma to byt int?
    private int vydaje;

    // TODO
    // co to ma uchovavat? ma to byt int?
    private int prijmy;

    public Pobocka() {
    }

    public Pobocka(String nazov, String adresa, int vydaje, int prijmy) {
        this.nazov = nazov;
        this.adresa = adresa;
        this.vydaje = vydaje;
        this.prijmy = prijmy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getVydaje() {
        return vydaje;
    }

    public void setVydaje(int vydaje) {
        this.vydaje = vydaje;
    }

    public int getPrijmy() {
        return prijmy;
    }

    public void setPrijmy(int prijmy) {
        this.prijmy = prijmy;
    }

    @Override
    public String toString() {
        return "Pobocka{" + "id=" + id + ", nazov=" + nazov + ", adresa=" + adresa + ", vydaje=" + vydaje + ", prijmy=" + prijmy + '}';
    }

}
