package dao;

import java.util.List;
import entity.Pobocka;

public interface PobockaDao {

    void addPobocka(Pobocka pobocka);

    Pobocka getPobocka(Long id);

    List<Pobocka> getPobocky();

    void updatePobocka(Long id);

    void deletePobocka(Long id);

}
