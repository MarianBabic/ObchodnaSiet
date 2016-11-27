package dao.interfaces;

import entity.*;
import java.util.List;

public interface ProduktNaPredajniDao {
    
    void pridajProduktNaPredajnu(Produkt produkt, Prevadzka prevadzka);
    
    ProduktNaPredajni nacitajProduktNaPredajni(int produktId, int prevadzkaId);
    
    List<ProduktNaPredajni> nacitajVsetkyProduktyNaPredajniach();
    
    void upravProduktNaPredajni(int produktId, int prevadzkaId);
    
    void odoberProduktZPredajne(int produktId, int prevadzkaId);
    
}
