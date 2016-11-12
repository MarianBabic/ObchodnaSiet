package dao;

import java.util.List;
import entity.Pobocka;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class PobockaDaoImpl implements PobockaDao {

    private final JdbcTemplate jdbcTemplate;
    private OracleDataSource oracleDataSource;

    public PobockaDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addPobocka(Pobocka pobocka) {
        String sql = "INSERT INTO pobocka (nazov, adresa, vydaje, prijmy) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql, pobocka.getNazov(), pobocka.getAdresa(), pobocka.getVydaje(), pobocka.getPrijmy());
    }

    @Override
    public Pobocka getPobocka(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pobocka> getPobocky() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePobocka(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePobocka(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
