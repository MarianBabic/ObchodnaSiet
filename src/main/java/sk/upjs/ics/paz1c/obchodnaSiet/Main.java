package sk.upjs.ics.paz1c.obchodnaSiet;

import java.sql.Date;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.NakladDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrevadzkaDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrijemDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ProduktDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ZamestnanecDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Zamestnanec;

public class Main {

    public static void main(String[] args) {

        PrevadzkaDao pd = DaoFactory.INSTANCE.getPrevadzkaDao();
        NakladDao nDao = DaoFactory.INSTANCE.getNakladDao();
        PrijemDao pDao = DaoFactory.INSTANCE.getPrijemDao();
        ProduktDao proDao = DaoFactory.INSTANCE.getProduktDao();
        ZamestnanecDao zDao = DaoFactory.INSTANCE.getZamestnanecDao();

        Prevadzka p = new Prevadzka("nazov", "adresa", "non-stop");
        pd.pridajPrevadzku(p);
        System.out.println(pd.nacitajPrevadzku(141));
        System.out.println(pd.nacitajVsetkyPrevadzky());
        pd.odoberPrevadzku(142);
        System.out.println(pd.vycisliZisk(141));

        // TODO
        pd.upravPrevadzku(141);
        // TODO
//        nDao.upravNaklad(81);
        // TODO
//        pDao.upravPrijem(61);
//TODO
//proDao.upravProdukt(101);
// TODO
//zDao.upravZamestnanca(61);
        
    }

}
