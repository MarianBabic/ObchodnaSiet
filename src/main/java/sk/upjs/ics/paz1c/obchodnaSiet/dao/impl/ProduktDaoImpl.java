package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ProduktDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Produkt;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProduktDaoImpl implements ProduktDao {

    private final JdbcTemplate jdbcTemplate;

    public ProduktDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void pridajProdukt(Produkt produkt) {
        String sql = "INSERT INTO produkt (id, nazov, nakupna_cena, predajna_cena) VALUES (produkt_sequence.nextval,?,?,?)";
        jdbcTemplate.update(sql, produkt.getNazov(), produkt.getNakupnaCena(), produkt.getPredajnaCena());
    }

    @Override
    public Produkt nacitajProdukt(Integer id) {
        String sql = "SELECT * FROM produkt WHERE id =" + id;
        BeanPropertyRowMapper<Produkt> rowMapper = new BeanPropertyRowMapper<>(Produkt.class);
        return jdbcTemplate.queryForObject(sql, rowMapper);
    }

    @Override
    public List<Produkt> nacitajVsetkyProdukty() {
        String sql = "SELECT * FROM produkt";
        BeanPropertyRowMapper<Produkt> rowMapper = new BeanPropertyRowMapper<>(Produkt.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    // TODO
    @Override
    public void upravProdukt(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void odoberProdukt(Integer id) {
        String sql = "DELETE FROM produkt WHERE id=" + id;
        jdbcTemplate.execute(sql);
    }

    @Override
    public double vycisliZisk(Integer id) {
        String sql = "SELECT (predajna_cena - nakupna_cena) as zisk FROM produkt WHERE id=" + id;
        return jdbcTemplate.queryForObject(sql, Double.class);
    }

}
