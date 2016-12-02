package dao;

import dao.interfaces.*;
import dao.impl.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum DaoFactory {

    INSTANCE;

    private NakladDao nakladDao;
    private PrevadzkaDao prevadzkaDao;
    private PrijemDao prijemDao;
    private ProduktDao produktDao;
    private ZamestnanecDao zamestnanecDao;

    public JdbcTemplate getJdbcTemplate() {
        try {
            OracleDataSource dataSource = new OracleDataSource();
            dataSource.setURL("jdbc:oracle:thin:@//localhost:1521/XE");
            dataSource.setUser("obchodna_siet");
            dataSource.setPassword("password");

            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

            return jdbcTemplate;
        } catch (SQLException ex) {
            Logger.getLogger(DaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public NakladDao getNakladDao() {
        if (nakladDao == null) {
            nakladDao = new NakladDaoImpl(getJdbcTemplate());
        }
        return nakladDao;
    }

    public PrevadzkaDao getPrevadzkaDao() {
        if (prevadzkaDao == null) {
            prevadzkaDao = new PrevadzkaDaoImpl(getJdbcTemplate());
        }
        return prevadzkaDao;
    }

    public PrijemDao getPrijemDao() {
        if (prijemDao == null) {
            prijemDao = new PrijemDaoImpl(getJdbcTemplate());
        }
        return prijemDao;
    }

    public ProduktDao getProduktDao() {
        if (produktDao == null) {
            produktDao = new ProduktDaoImpl(getJdbcTemplate());
        }
        return produktDao;
    }

    public ZamestnanecDao getZamestnanecDao() {
        if (zamestnanecDao == null) {
            zamestnanecDao = new ZamestnanecDaoImpl(getJdbcTemplate());
        }
        return zamestnanecDao;
    }

}
