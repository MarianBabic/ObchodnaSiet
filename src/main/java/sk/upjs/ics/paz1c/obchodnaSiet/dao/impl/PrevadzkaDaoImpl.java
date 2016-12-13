package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrevadzkaDao;
import java.util.List;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class PrevadzkaDaoImpl implements PrevadzkaDao {

    private final JdbcTemplate jdbcTemplate;

    public PrevadzkaDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void pridajPrevadzku(Prevadzka prevadzka) {
        String sql = "INSERT INTO prevadzka (id, nazov, adresa, otvaracie_hodiny) VALUES (prevadzka_sequence.nextval,?,?,?)";
        jdbcTemplate.update(sql, prevadzka.getNazov(), prevadzka.getAdresa(), prevadzka.getOtvaracieHodiny());
    }

    @Override
    public Prevadzka nacitajPrevadzku(Integer id) {
        String sql = "SELECT * FROM prevadzka WHERE id=" + id;
        BeanPropertyRowMapper<Prevadzka> rowMapper = new BeanPropertyRowMapper<>(Prevadzka.class);
        return jdbcTemplate.queryForObject(sql, rowMapper);
        // aj nasledujuce funguje :)
        // return jdbcTemplate.query(sql, rowMapper).get(0);
    }

    @Override
    public List<Prevadzka> nacitajVsetkyPrevadzky() {
        String sql = "SELECT * FROM prevadzka";
        BeanPropertyRowMapper<Prevadzka> rowMapper = new BeanPropertyRowMapper<>(Prevadzka.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    // TODO
    @Override
    public void upravPrevadzku(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void odoberPrevadzku(Integer id) {
        String sql = "DELETE FROM prevadzka WHERE id=" + id;
        jdbcTemplate.execute(sql);
    }

    @Override
    public double vycisliZisk(Integer id) {
        String sql1 = "SELECT SUM(suma) FROM naklad WHERE prevadzka_id=" + id;
        Double naklad = jdbcTemplate.queryForObject(sql1, Double.class);

        String sql2 = "SELECT SUM(suma) FROM prijem WHERE prevadzka_id=" + id;
        Double prijem = jdbcTemplate.queryForObject(sql2, Double.class);

        // TODO should throw Exception instead of returning Double.MIN_VALUE
        if (naklad == null && prijem == null) {
            return Double.MIN_VALUE;
        }
        if (naklad == null) {
            return prijem;
        }
        if (prijem == null) {
            return -naklad;
        }
        return prijem - naklad;
    }

}
