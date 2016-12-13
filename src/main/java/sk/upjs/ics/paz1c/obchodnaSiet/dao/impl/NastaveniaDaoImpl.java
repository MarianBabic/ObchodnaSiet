package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.NastaveniaDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Nastavenia;

public class NastaveniaDaoImpl implements NastaveniaDao {

    private final JdbcTemplate jdbcTemplate;

    public NastaveniaDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void pridajNastavenia(Nastavenia nastavenia) {
        String sql = "INSERT INTO nastavenia (id, nazov_obchodnej_siete, mena) VALUES (nastavenia_sequence.nextval,?,?)";
        jdbcTemplate.update(sql, nastavenia.getNazovObchodnejSiete(), nastavenia.getMena());
    }

    @Override
    public Nastavenia nacitajNastavenia(int id) {
        String sql = "SELECT * FROM nastavenia n WHERE n.id=" + id;
        BeanPropertyRowMapper<Nastavenia> rowMapper = new BeanPropertyRowMapper<>(Nastavenia.class);
        return jdbcTemplate.queryForObject(sql, rowMapper);
    }

    // TODO
    @Override
    public void upravNastavenia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
