package sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces;

import java.util.List;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;

public interface PrevadzkaDao {

    void pridajPrevadzku(Prevadzka prevadzka);

    Prevadzka nacitajPrevadzku(Integer id);

    List<Prevadzka> nacitajVsetkyPrevadzky();

    void upravPrevadzku(Integer id);

    void odoberPrevadzku(Integer id);

    double vycisliZisk(Integer id);

}
