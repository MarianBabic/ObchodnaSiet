package sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces;

import sk.upjs.ics.paz1c.obchodnaSiet.entity.ProduktNaPredajni;
import java.util.List;

public interface ProduktNaPredajniDao {
    
    void pridajProduktNaPredajnu(ProduktNaPredajni produktNaPredajni);
    
    ProduktNaPredajni nacitajProduktNaPredajni(Integer produktId, Integer prevadzkaId);
    
    List<ProduktNaPredajni> nacitajVsetkyProduktyNaPredajniach();
    
    void upravProduktNaPredajni(Integer produktId, Integer prevadzkaId);
    
    void odoberProduktZPredajne(Integer produktId, Integer prevadzkaId);
    
}
