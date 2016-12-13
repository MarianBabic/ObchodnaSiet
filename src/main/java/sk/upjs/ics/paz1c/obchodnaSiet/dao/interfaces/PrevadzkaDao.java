package sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces;

import java.util.List;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;

public interface PrevadzkaDao {

    void pridajPrevadzku(Prevadzka prevadzka);

    Prevadzka nacitajPrevadzku(int id);

    List<Prevadzka> nacitajVsetkyPrevadzky();

    void upravPrevadzku(int id);

    void odoberPrevadzku(int id);

    double vycisliZisk(int id);

}
