package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.NakladDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Naklad;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;
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
        jdbcTemplate.update(sql, naklad.getPrevadzka().getId(), naklad.getPopis(), naklad.getDatum(), naklad.getSuma());
    }

    @Override
    public Naklad nacitajNaklad(int id) {
        String sql = "SELECT n.id, p.id AS p_id, p.nazov AS p_nazov, p.adresa AS p_adresa, p.otvaracie_hodiny AS p_otvaracie_hodiny, n.popis, n.datum, n.suma from naklad n JOIN prevadzka p ON p.id=n.prevadzka_id WHERE n.id=" + id;
        return jdbcTemplate.queryForObject(sql, new NakladRowMapper());
    }

    @Override
    public List<Naklad> nacitajVsetkyNaklady() {
        String sql = "SELECT n.id, p.id AS p_id, p.nazov AS p_nazov, p.adresa AS p_adresa, p.otvaracie_hodiny AS p_otvaracie_hodiny, n.popis, n.datum, n.suma from naklad n JOIN prevadzka p ON p.id=n.prevadzka_id";
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

            Prevadzka prevadzka = new Prevadzka();
            prevadzka.setId(rs.getInt("p_id"));
            prevadzka.setNazov(rs.getString("p_nazov"));
            prevadzka.setAdresa(rs.getString("p_adresa"));
            prevadzka.setOtvaracieHodiny(rs.getString("p_otvaracie_hodiny"));

            naklad.setPrevadzka(prevadzka);
            // 2nd version without JOIN in SQL statement
//            naklad.setPrevadzka(DaoFactory.INSTANCE.getPrevadzkaDao().nacitajPrevadzku(rs.getInt("prevadzka_id")));
            naklad.setPopis(rs.getString("popis"));
            naklad.setDatum(rs.getDate("datum"));
            naklad.setSuma(rs.getDouble("suma"));
            return naklad;
        }

    }

}
