package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrevadzkaDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ZamestnanecDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Zamestnanec;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ZamestnanecDaoImplTest {

    private ZamestnanecDao zamestnanecDao;

    public ZamestnanecDaoImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        zamestnanecDao = DaoFactory.INSTANCE.getZamestnanecDao();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of pridajZamestnanaca method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testPridajZamestnanaca() {
        PrevadzkaDao prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
        int pocetPred = zamestnanecDao.nacitajVsetkychZamestnancov().size();
        Prevadzka novaPrevadzka = new Prevadzka("TEST", "TEST", "TEST");
        prevadzkaDao.pridajPrevadzku(novaPrevadzka);
        List<Prevadzka> prevadzky = prevadzkaDao.nacitajVsetkyPrevadzky();
        int idPrevadzky = prevadzky.get(prevadzky.size() - 1).getId();
        zamestnanecDao.pridajZamestnanaca(new Zamestnanec("TEST", "TEST", DaoFactory.INSTANCE.getPrevadzkaDao().nacitajPrevadzku(idPrevadzky), 0.0, 0.0, 0.0));
        int pocetPo = zamestnanecDao.nacitajVsetkychZamestnancov().size();
        assertEquals(pocetPred + 1, pocetPo);
    }

    /**
     * Test of nacitajZamestnanca method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testNacitajZamestnanca() {
        Zamestnanec zamestnanec = null;
        if (!zamestnanecDao.nacitajVsetkychZamestnancov().isEmpty()) {
            zamestnanec = zamestnanecDao.nacitajZamestnanca(zamestnanecDao.nacitajVsetkychZamestnancov().get(0).getId());
        }
        assertTrue(zamestnanec != null);
    }

    /**
     * Test of nacitajVsetkychZamestnancov method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testNacitajVsetkychZamestnancov() {
        List<Zamestnanec> zamestnanci = zamestnanecDao.nacitajVsetkychZamestnancov();
        assertTrue(zamestnanci != null);
    }

    /**
     * Test of upravZamestnanca method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testUpravZamestnanca() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of odoberZamestnanca method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testOdoberZamestnanca() {
        Zamestnanec zamestnanec = new Zamestnanec();
        List<Zamestnanec> zamestnanci = zamestnanecDao.nacitajVsetkychZamestnancov();
        for (Zamestnanec z : zamestnanci) {
            if (z.getMeno().equals("TEST")) {
                zamestnanec = z;
            }
        }
        int pocetPred = zamestnanci.size();
        zamestnanecDao.odoberZamestnanca(zamestnanec.getId());
        int pocetPo = zamestnanecDao.nacitajVsetkychZamestnancov().size();
        assertTrue(pocetPred - 1 == pocetPo);
    }

    /**
     * Test of vycisliZisk method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testVycisliZisk() {
        double zisk = Double.MIN_VALUE;
        zisk = zamestnanecDao.nacitajZamestnanca(zamestnanecDao.nacitajVsetkychZamestnancov().get(0).getId()).getZiskZPredaja();
        assertTrue(zisk != Double.MIN_VALUE);
    }

}
