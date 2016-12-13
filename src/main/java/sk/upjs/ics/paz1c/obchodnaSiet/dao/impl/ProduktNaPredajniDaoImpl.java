package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ProduktNaPredajniDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.ProduktNaPredajni;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProduktNaPredajniDaoImpl implements ProduktNaPredajniDao {

    private final JdbcTemplate jdbcTemplate;

    public ProduktNaPredajniDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void pridajProduktNaPredajnu(ProduktNaPredajni pnp) {
        String sql = "INSERT INTO produkt_na_predajni (produkt_id, prevadzka_id, zlava, kusy) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql, pnp.getProduktId(), pnp.getPrevadzkaId(), pnp.getZlava(), pnp.getKusy());
    }

    @Override
    public ProduktNaPredajni nacitajProduktNaPredajni(Integer produktId, Integer prevadzkaId) {
        String sql = "SELECT * FROM produkt_na_predajni WHERE produkt_id=" + produktId + " AND prevadzka_id=" + prevadzkaId;
        BeanPropertyRowMapper<ProduktNaPredajni> rowMapper = new BeanPropertyRowMapper<>(ProduktNaPredajni.class);
        return jdbcTemplate.queryForObject(sql, rowMapper);
    }

    @Override
    public List<ProduktNaPredajni> nacitajVsetkyProduktyNaPredajniach() {
        String sql = "SELECT * FROM produkt_na_predajni";
        BeanPropertyRowMapper<ProduktNaPredajni> rowMapper = new BeanPropertyRowMapper<>(ProduktNaPredajni.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    // TODO
    @Override
    public void upravProduktNaPredajni(Integer produktId, Integer prevadzkaId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void odoberProduktZPredajne(Integer produktId, Integer prevadzkaId) {
        String sql = "DELETE FROM produkt_na_predajni WHERE produkt_id=" + produktId + " AND prevadzka_id=" + prevadzkaId;
        jdbcTemplate.execute(sql);
    }

}
