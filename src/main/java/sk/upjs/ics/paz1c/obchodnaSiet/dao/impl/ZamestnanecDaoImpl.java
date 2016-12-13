package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ZamestnanecDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;
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
        String sql = "INSERT INTO zamestnanec (id, meno, priezvisko, prevadzka_id, odpracovany_cas, zisk_z_predaja, plat_brutto) VALUES (zamestnanec_sequence.nextval,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, zamestnanec.getMeno(), zamestnanec.getPriezvisko(), zamestnanec.getPrevadzka().getId(), zamestnanec.getOdpracovanyCas(), zamestnanec.getZiskZPredaja(), zamestnanec.getPlatBrutto());
    }

    @Override
    public Zamestnanec nacitajZamestnanca(int id) {
        String sql = "SELECT z.id, z.meno, z.priezvisko, p.id AS p_id, p.nazov AS p_nazov, p.adresa AS p_adresa, p.otvaracie_hodiny AS p_otvaracie_hodiny, z.odpracovany_cas, z.zisk_z_predaja, z.plat_brutto from zamestnanec z JOIN prevadzka p ON p.id=z.prevadzka_id WHERE z.id=" + id;
        return jdbcTemplate.queryForObject(sql, new ZamestnanecRowMapper());
    }

    @Override
    public List<Zamestnanec> nacitajVsetkychZamestnancov() {
        String sql = "SELECT z.id, z.meno, z.priezvisko, p.id AS p_id, p.nazov AS p_nazov, p.adresa AS p_adresa, p.otvaracie_hodiny AS p_otvaracie_hodiny, z.odpracovany_cas, z.zisk_z_predaja, z.plat_brutto from zamestnanec z JOIN prevadzka p ON p.id=z.prevadzka_id";
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

    @Override
    public double vycisliZisk(int id) {
        String sql = "SELECT zisk_z_predaja FROM zamestnanec WHERE id=" + id;
        return jdbcTemplate.queryForObject(sql, Double.class);
    }

    private class ZamestnanecRowMapper implements RowMapper<Zamestnanec> {

        @Override
        public Zamestnanec mapRow(ResultSet rs, int i) throws SQLException {
            Zamestnanec zamestnanec = new Zamestnanec();
            zamestnanec.setId(rs.getInt("id"));
            zamestnanec.setMeno(rs.getString("meno"));
            zamestnanec.setPriezvisko(rs.getString("priezvisko"));

            Prevadzka prevadzka = new Prevadzka();
            prevadzka.setId(rs.getInt("p_id"));
            prevadzka.setNazov(rs.getString("p_nazov"));
            prevadzka.setAdresa(rs.getString("p_adresa"));
            prevadzka.setOtvaracieHodiny(rs.getString("p_otvaracie_hodiny"));

            zamestnanec.setPrevadzka(prevadzka);
            zamestnanec.setOdpracovanyCas(rs.getDouble("odpracovany_cas"));
            zamestnanec.setZiskZPredaja(rs.getDouble("zisk_z_predaja"));
            zamestnanec.setPlatBrutto(rs.getDouble("plat_brutto"));
            return zamestnanec;
        }

    }

}
