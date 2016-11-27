package dao.interfaces;

import entity.Naklad;
import java.util.List;

public interface NakladDao {

    void pridajNaklad(Naklad naklad);

    Naklad nacitajNaklad(int id);

    List<Naklad> nacitajVsetkyNaklady();

    void upravNaklad(int id);

    void odoberNaklad(int id);

}
