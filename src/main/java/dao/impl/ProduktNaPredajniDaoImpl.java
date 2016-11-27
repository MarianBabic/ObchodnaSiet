package dao.impl;

import dao.interfaces.ProduktNaPredajniDao;
import entity.Prevadzka;
import entity.Produkt;
import entity.ProduktNaPredajni;
import java.util.List;

public class ProduktNaPredajniDaoImpl implements ProduktNaPredajniDao {

    @Override
    public void pridajProduktNaPredajnu(Produkt produkt, Prevadzka prevadzka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProduktNaPredajni nacitajProduktNaPredajni(int produktId, int prevadzkaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProduktNaPredajni> nacitajVsetkyProduktyNaPredajniach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upravProduktNaPredajni(int produktId, int prevadzkaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void odoberProduktZPredajne(int produktId, int prevadzkaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
