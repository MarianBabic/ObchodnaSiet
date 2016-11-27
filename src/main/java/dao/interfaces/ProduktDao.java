package dao.interfaces;

import entity.Produkt;
import java.util.List;

public interface ProduktDao {

    void pridajProdukt(Produkt produkt);

    Produkt nacitajProdukt(int id);

    List<Produkt> nacitajVsetkyProdukty();

    void upravProdukt(int id);

    void odoberProdukt(int id);

    double vycisliZisk(int id);

}
