
import dao.DaoFactory;
import dao.impl.PrevadzkaDaoImpl;
import entity.*;
import dao.interfaces.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class Main {

    // TODO - toto este musim otestovat aj v unit testoch
    public static void otestovat() {
        Produkt produkt = new Produkt("chlieb", 0.5, 0.8);
        ProduktDao produktDao = DaoFactory.INSTANCE.getProduktDao();
//        produktDao.upravProdukt(0);

        Naklad naklad = new Naklad(DaoFactory.INSTANCE.getPrevadzkaDao().nacitajPrevadzku(33), "nejaky naklad", new Date(System.currentTimeMillis()), 5);
        NakladDao nakladDao = DaoFactory.INSTANCE.getNakladDao();
//        nakladDao.upravNaklad(0);

        Prijem prijem = new Prijem(DaoFactory.INSTANCE.getPrevadzkaDao().nacitajPrevadzku(33), "prijem", new Date(System.currentTimeMillis()), 100);
        PrijemDao prijemDao = DaoFactory.INSTANCE.getPrijemDao();
//        prijemDao.upravPrijem(0);

        Zamestnanec zamestnanec = new Zamestnanec("Adam", "Blazon", DaoFactory.INSTANCE.getPrevadzkaDao().nacitajVsetkyPrevadzky().get(0), 172, 1500, 500);
        ZamestnanecDao zamestnanecDao = DaoFactory.INSTANCE.getZamestnanecDao();
//        zamestnanecDao.upravZamestnanca(0);
    }

    public static void main(String[] args) {
        
        PrevadzkaDao prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
        prevadzkaDao.pridajPrevadzku(new Prevadzka("TEST", "TEST", "TEST"));
        
        otestovat();

//TODO        produkt na predajni
    }

}
