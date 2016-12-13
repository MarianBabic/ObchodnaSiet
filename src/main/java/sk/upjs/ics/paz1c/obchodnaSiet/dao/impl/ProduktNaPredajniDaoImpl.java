package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ProduktNaPredajniDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.ProduktNaPredajni;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProduktNaPredajniDaoImpl implements ProduktNaPredajniDao {

    private final JdbcTemplate jdbcTemplate;

    public ProduktNaPredajniDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // TODO
    @Override
    public void pridajProduktNaPredajnu(int produktId, int prevadzkaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // TODO
    @Override
    public ProduktNaPredajni nacitajProduktNaPredajni(int produktId, int prevadzkaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // TODO
    @Override
    public List<ProduktNaPredajni> nacitajVsetkyProduktyNaPredajniach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // TODO
    @Override
    public void upravProduktNaPredajni(int produktId, int prevadzkaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // TODO
    @Override
    public void odoberProduktZPredajne(int produktId, int prevadzkaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
