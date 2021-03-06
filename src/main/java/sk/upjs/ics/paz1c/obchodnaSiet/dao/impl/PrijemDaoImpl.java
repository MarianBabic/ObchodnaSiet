package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrijemDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prijem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PrijemDaoImpl implements PrijemDao {

    private final JdbcTemplate jdbcTemplate;

    public PrijemDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void pridajPrijem(Prijem prijem) {
        String sql = "INSERT INTO prijem (id, prevadzka_id, popis, datum, suma) VALUES (prijem_sequence.nextval,?,?,?,?)";
        jdbcTemplate.update(sql, prijem.getPrevadzkaId(), prijem.getPopis(), prijem.getDatum(), prijem.getSuma());
    }

    @Override
    public Prijem nacitajPrijem(Integer id) {
        String sql = "SELECT p.id, p.prevadzka_id, p.popis, p.datum, p.suma from prijem p WHERE p.id=" + id;
        return jdbcTemplate.queryForObject(sql, new PrijemRowMapper());
    }

    @Override
    public List<Prijem> nacitajVsetkyPrijmy() {
        String sql = "SELECT p.id, p.prevadzka_id, p.popis, p.datum, p.suma from prijem p";
        return jdbcTemplate.query(sql, new PrijemRowMapper());
    }

    // TODO
    @Override
    public void upravPrijem(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void odoberPrijem(Integer id) {
        String sql = "DELETE FROM prijem WHERE id=" + id;
        jdbcTemplate.execute(sql);
    }

    private class PrijemRowMapper implements RowMapper<Prijem> {

        @Override
        public Prijem mapRow(ResultSet rs, int i) throws SQLException {
            Prijem prijem = new Prijem();
            prijem.setId(rs.getInt("id"));
            prijem.setPrevadzkaId(rs.getInt("prevadzka_id"));
            prijem.setPopis(rs.getString("popis"));
            prijem.setDatum(rs.getDate("datum"));
            prijem.setSuma(rs.getDouble("suma"));
            return prijem;
        }

    }

}
