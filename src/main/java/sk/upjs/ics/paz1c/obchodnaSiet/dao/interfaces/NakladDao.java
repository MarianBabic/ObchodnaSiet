package sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces;

import sk.upjs.ics.paz1c.obchodnaSiet.entity.Naklad;
import java.util.List;

public interface NakladDao {

    void pridajNaklad(Naklad naklad);

    Naklad nacitajNaklad(Integer id);

    List<Naklad> nacitajVsetkyNaklady();

    void upravNaklad(Integer id);

    void odoberNaklad(Integer id);

}
