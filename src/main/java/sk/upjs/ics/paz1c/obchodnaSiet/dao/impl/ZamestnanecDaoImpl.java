package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ZamestnanecDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Zamestnanec;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ZamestnanecDaoImpl implements ZamestnanecDao {
    
    private final JdbcTemplate jdbcTemplate;
    
    public ZamestnanecDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public void pridajZamestnanaca(Zamestnanec zamestnanec) {
        String sql = "INSERT INTO zamestnanec (id, meno, priezvisko, prevadzka_id, datum_nastupu, plat_brutto) VALUES (zamestnanec_sequence.nextval,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, zamestnanec.getMeno(), zamestnanec.getPriezvisko(), zamestnanec.getPrevadzkaId(), zamestnanec.getDatumNastupu(), zamestnanec.getPlatBrutto());
    }
    
    @Override
    public Zamestnanec nacitajZamestnanca(int id) {
        String sql = "SELECT z.id, z.meno, z.priezvisko, z.prevadzka_id, z.datum_nastupu, z.plat_brutto from zamestnanec z WHERE z.id=" + id;
        return jdbcTemplate.queryForObject(sql, new ZamestnanecRowMapper());
    }
    
    @Override
    public List<Zamestnanec> nacitajVsetkychZamestnancov() {
        String sql = "SELECT z.id, z.meno, z.priezvisko, , z.prevadzka_id, z.datum_nastupu, z.plat_brutto from zamestnanec z";
        return jdbcTemplate.query(sql, new ZamestnanecRowMapper());
    }

    // TODO
    @Override
    public void upravZamestnanca(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void odoberZamestnanca(int id) {
        String sql = "DELETE FROM zamestnanec WHERE id=" + id;
        jdbcTemplate.execute(sql);
    }
    
    private class ZamestnanecRowMapper implements RowMapper<Zamestnanec> {
        
        @Override
        public Zamestnanec mapRow(ResultSet rs, int i) throws SQLException {
            Zamestnanec zamestnanec = new Zamestnanec();
            zamestnanec.setId(rs.getInt("id"));
            zamestnanec.setMeno(rs.getString("meno"));
            zamestnanec.setPriezvisko(rs.getString("priezvisko"));
            zamestnanec.setPrevadzkaId(rs.getInt("prevadzka_id"));
            zamestnanec.setDatumNastupu(rs.getDate("datum_nastupu"));
            zamestnanec.setPlatBrutto(rs.getDouble("plat_brutto"));
            return zamestnanec;
        }
        
    }
    
}
