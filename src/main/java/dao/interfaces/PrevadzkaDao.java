package dao.interfaces;

import java.util.List;
import entity.Prevadzka;

public interface PrevadzkaDao {

    void pridajPrevadzku(Prevadzka prevadzka);

    Prevadzka nacitajPrevadzku(int id);

    List<Prevadzka> nacitajVsetkyPrevadzky();

    void upravPrevadzku(int id, String nazov, String adresa, String otvaracieHodiny);

    void odoberPrevadzku(int id);
    
    double vycisliZisk(int id);

}
