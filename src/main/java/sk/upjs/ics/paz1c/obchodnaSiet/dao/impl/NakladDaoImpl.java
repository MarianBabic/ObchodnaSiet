package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.NakladDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Naklad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class NakladDaoImpl implements NakladDao {

    private final JdbcTemplate jdbcTemplate;

    public NakladDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void pridajNaklad(Naklad naklad) {
        String sql = "INSERT INTO naklad (id, prevadzka_id, popis, datum, suma) VALUES (naklad_sequence.nextval,?,?,?,?)";
        jdbcTemplate.update(sql, naklad.getPrevadzkaId(), naklad.getPopis(), naklad.getDatum(), naklad.getSuma());
    }

    @Override
    public Naklad nacitajNaklad(int id) {
        String sql = "SELECT n.id, n.prevadzka_id, n.popis, n.datum, n.suma from naklad n WHERE n.id=" + id;
        return jdbcTemplate.queryForObject(sql, new NakladRowMapper());
    }

    @Override
    public List<Naklad> nacitajVsetkyNaklady() {
        String sql = "SELECT n.id, n.prevadzka_id, n.popis, n.datum, n.suma from naklad n";
        return jdbcTemplate.query(sql, new NakladRowMapper());
    }

    // TODO
    @Override
    public void upravNaklad(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void odoberNaklad(int id) {
        String sql = "DELETE FROM naklad WHERE id=" + id;
        jdbcTemplate.execute(sql);
    }

    private class NakladRowMapper implements RowMapper<Naklad> {

        @Override
        public Naklad mapRow(ResultSet rs, int i) throws SQLException {
            Naklad naklad = new Naklad();
            naklad.setId(rs.getInt("id"));
            naklad.setPrevadzkaId(rs.getInt("prevadzka_id"));
            naklad.setPopis(rs.getString("popis"));
            naklad.setDatum(rs.getDate("datum"));
            naklad.setSuma(rs.getDouble("suma"));
            return naklad;
        }

    }

}
