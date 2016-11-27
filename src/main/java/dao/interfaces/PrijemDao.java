package dao.interfaces;

import entity.Prijem;
import java.util.List;

public interface PrijemDao {
    
    void pridajPrijem(Prijem prijem);

    Prijem nacitajPrijem(int id);

    List<Prijem> nacitajVsetkyPrijmy();

    void upravPrijem(int id);

    void odoberPrijem(int id);
    
}
