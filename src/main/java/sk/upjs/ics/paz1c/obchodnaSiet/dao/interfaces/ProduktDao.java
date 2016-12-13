package sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces;

import sk.upjs.ics.paz1c.obchodnaSiet.entity.Produkt;
import java.util.List;

public interface ProduktDao {

    void pridajProdukt(Produkt produkt);

    Produkt nacitajProdukt(Integer id);

    List<Produkt> nacitajVsetkyProdukty();

    void upravProdukt(Integer id);

    void odoberProdukt(Integer id);

    double vycisliZisk(Integer id);

}
