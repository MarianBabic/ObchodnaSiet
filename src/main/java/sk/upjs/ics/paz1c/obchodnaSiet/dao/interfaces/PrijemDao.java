package sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces;

import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prijem;
import java.util.List;

public interface PrijemDao {

    void pridajPrijem(Prijem prijem);

    Prijem nacitajPrijem(Integer id);

    List<Prijem> nacitajVsetkyPrijmy();

    void upravPrijem(Integer id);

    void odoberPrijem(Integer id);

}
