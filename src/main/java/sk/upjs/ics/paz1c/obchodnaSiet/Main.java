package sk.upjs.ics.paz1c.obchodnaSiet;

import java.sql.Date;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.NakladDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.NastaveniaDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrevadzkaDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrijemDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ProduktDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ProduktNaPredajniDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ZamestnanecDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Nastavenia;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.ProduktNaPredajni;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Zamestnanec;
import sk.upjs.ics.paz1c.obchodnaSiet.forms.HlavneOknoForm;

public class Main {

    public static void main(String[] args) {

        PrevadzkaDao pd = DaoFactory.INSTANCE.getPrevadzkaDao();
        NakladDao nDao = DaoFactory.INSTANCE.getNakladDao();
        NastaveniaDao ndao = DaoFactory.INSTANCE.getNastaveniaDao();
        PrijemDao pDao = DaoFactory.INSTANCE.getPrijemDao();
        ProduktDao proDao = DaoFactory.INSTANCE.getProduktDao();
        ProduktNaPredajniDao pnpDao = DaoFactory.INSTANCE.getProduktNaPredajniDao();
        ZamestnanecDao zDao = DaoFactory.INSTANCE.getZamestnanecDao();

        // TODO
//        pd.upravPrevadzku(141);
        // TODO
//        nDao.upravNaklad(81);
        // TODO
//        pDao.upravPrijem(61);
//TODO
//proDao.upravProdukt(101);
// TODO
//pnpDao.upravProduktNaPredajni(101, 141);
// TODO
//zDao.upravZamestnanca(61);

ndao.pridajUpravNastavenia(new Nastavenia("test1", "test2"));

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HlavneOknoForm().setVisible(true);
            }
        });

    }

}
