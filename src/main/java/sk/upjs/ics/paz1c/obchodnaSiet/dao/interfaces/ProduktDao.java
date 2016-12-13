package sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces;

import sk.upjs.ics.paz1c.obchodnaSiet.entity.Produkt;
import java.util.List;

public interface ProduktDao {

    void pridajProdukt(Produkt produkt);

    Produkt nacitajProdukt(int id);

    List<Produkt> nacitajVsetkyProdukty();

    void upravProdukt(int id);

    void odoberProdukt(int id);

    double vycisliZisk(int id);

}
