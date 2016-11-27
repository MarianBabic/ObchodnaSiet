package dao.impl;

import dao.interfaces.PrevadzkaDao;
import java.util.List;
import entity.Prevadzka;
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
    public Prevadzka nacitajPrevadzku(int id) {
        String sql = "SELECT * FROM prevadzka WHERE id=" + id;
        BeanPropertyRowMapper<Prevadzka> rowMapper = new BeanPropertyRowMapper<>(Prevadzka.class);
        return (Prevadzka) jdbcTemplate.queryForObject(sql, rowMapper);
        // toto je skratena verzia predoslych 2 riadkov :)
//        return jdbcTemplate.query(sql, rowMapper).get(0);
    }

    @Override
    public List<Prevadzka> nacitajVsetkyPrevadzky() {
        String sql = "SELECT * FROM prevadzka";
        BeanPropertyRowMapper<Prevadzka> rowMapper = new BeanPropertyRowMapper<>(Prevadzka.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void upravPrevadzku(int id, String nazov, String adresa, String otvaracieHodiny) {
        String sql = "UPDATE prevadzka SET nazov=?,adresa=?,otvaracie_hodiny=? WHERE id=" + id;
        jdbcTemplate.update(sql, nazov, adresa, otvaracieHodiny);
    }

    @Override
    public void odoberPrevadzku(int id) {
        String sql = "DELETE FROM prevadzka WHERE id=" + id;
        jdbcTemplate.execute(sql);
    }

    @Override
    public double vycisliZisk(int id) {
        String sql1 = "SELECT SUM(suma) FROM naklad WHERE prevadzka_id=" + id;
        double naklad = jdbcTemplate.queryForObject(sql1, Double.class);

        String sql2 = "SELECT SUM(suma) FROM prijem WHERE prevadzka_id=" + id;
        double prijem = jdbcTemplate.queryForObject(sql2, Double.class);

        return prijem - naklad;
    }

}
