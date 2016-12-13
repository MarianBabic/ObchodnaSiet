package sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces;

import sk.upjs.ics.paz1c.obchodnaSiet.entity.Nastavenia;

public interface NastaveniaDao {

    void pridajNastavenia(Nastavenia nastavenia);

    Nastavenia nacitajNastavenia(int id);

    void upravNastavenia(int id);

}
