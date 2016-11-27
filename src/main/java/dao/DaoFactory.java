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

    private DaoFactory() {
        try {
            OracleDataSource dataSource = new OracleDataSource();
            dataSource.setURL("jdbc:oracle:thin:@//localhost:1521/XE");
            dataSource.setUser("obchodna_siet");
            dataSource.setPassword("password");

            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

            nakladDao = new NakladDaoImpl(jdbcTemplate);
            prevadzkaDao = new PrevadzkaDaoImpl(jdbcTemplate);
            prijemDao = new PrijemDaoImpl(jdbcTemplate);
            produktDao = new ProduktDaoImpl(jdbcTemplate);
            zamestnanecDao = new ZamestnanecDaoImpl(jdbcTemplate);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public NakladDao getNakladDao() {
        return nakladDao;
    }

    public PrevadzkaDao getPrevadzkaDao() {
        return prevadzkaDao;
    }

    public PrijemDao getPrijemDao() {
        return prijemDao;
    }

    public ProduktDao getProduktDao() {
        return produktDao;
    }

    public ZamestnanecDao getZamestnanecDao() {
        return zamestnanecDao;
    }

}
