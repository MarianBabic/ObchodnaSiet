package dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum DaoFactory {

    INSTANCE;

    private PobockaDao pobockaDao;

    private DaoFactory() {
        try {
            OracleDataSource dataSource = new OracleDataSource();
            // obchodna_siet
            dataSource.setURL("jdbc:oracle:thin:@//localhost:1521/XE");
            dataSource.setDatabaseName("obchodna_siet");
            dataSource.setUser("system");
            dataSource.setPassword("root");

            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

            pobockaDao = new PobockaDaoImpl(jdbcTemplate);
        } catch (SQLException ex) {
            Logger.getLogger(DaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public PobockaDao getPobockaDao() {
        return pobockaDao;
    }

}
