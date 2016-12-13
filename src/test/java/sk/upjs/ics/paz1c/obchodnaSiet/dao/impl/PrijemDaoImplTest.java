package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrevadzkaDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrijemDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prijem;
import java.sql.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrijemDaoImplTest {

    private final PrijemDao prijemDao;

    public PrijemDaoImplTest() {
        prijemDao = DaoFactory.INSTANCE.getPrijemDao();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of pridajPrijem method, of class PrijemDaoImpl.
     */
    @Test
    public void testPridajPrijem() {
        int pocetPred = prijemDao.nacitajVsetkyPrijmy().size();

        PrevadzkaDao prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
        prevadzkaDao.pridajPrevadzku(new Prevadzka("TEST", "TEST", "TEST"));
        List<Prevadzka> prevadzky = prevadzkaDao.nacitajVsetkyPrevadzky();
        int idPrevadzky = prevadzky.get(prevadzky.size() - 1).getId();

        prijemDao.pridajPrijem(new Prijem(idPrevadzky, "TEST", new Date(System.currentTimeMillis()), 0.0));

        int pocetPo = prijemDao.nacitajVsetkyPrijmy().size();

        List<Prijem> prijmy = prijemDao.nacitajVsetkyPrijmy();
        Integer idPrijem = prijmy.get(prijmy.size() - 1).getId();
        prijemDao.odoberPrijem(idPrijem);
        prevadzkaDao.odoberPrevadzku(idPrevadzky);

        assertEquals(pocetPred + 1, pocetPo);
    }

    /**
     * Test of nacitajPrijem method, of class PrijemDaoImpl.
     */
    @Test
    public void testNacitajPrijem() {
        PrevadzkaDao prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
        prevadzkaDao.pridajPrevadzku(new Prevadzka("TEST", "TEST", "TEST"));
        List<Prevadzka> prevadzky = prevadzkaDao.nacitajVsetkyPrevadzky();
        int idPrevadzky = prevadzky.get(prevadzky.size() - 1).getId();

        prijemDao.pridajPrijem(new Prijem(idPrevadzky, "TEST", new Date(System.currentTimeMillis()), 0.0));

        List<Prijem> prijmy = prijemDao.nacitajVsetkyPrijmy();
        Integer idPrijem = prijmy.get(prijmy.size() - 1).getId();

        Prijem prijem = prijemDao.nacitajPrijem(idPrijem);

        prijemDao.odoberPrijem(idPrijem);
        prevadzkaDao.odoberPrevadzku(idPrevadzky);

        assertTrue(prijem != null && prijem.getPrevadzkaId() == idPrevadzky && prijem.getPopis().equals("TEST") && prijem.getSuma() == 0.0);
    }

    /**
     * Test of nacitajVsetkyPrijmy method, of class PrijemDaoImpl.
     */
    @Test
    public void testNacitajVsetkyPrijmy() {
        List<Prijem> prijmy = prijemDao.nacitajVsetkyPrijmy();
        assertTrue(prijmy != null);
    }

    // TODO
//    /**
//     * Test of upravPrijem method, of class PrijemDaoImpl.
//     */
//    @Test
//    public void testUpravPrijem() {
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of odoberPrijem method, of class PrijemDaoImpl.
     */
    @Test
    public void testOdoberPrijem() {
        PrevadzkaDao prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
        prevadzkaDao.pridajPrevadzku(new Prevadzka("TEST", "TEST", "TEST"));
        List<Prevadzka> prevadzky = prevadzkaDao.nacitajVsetkyPrevadzky();
        int idPrevadzky = prevadzky.get(prevadzky.size() - 1).getId();

        prijemDao.pridajPrijem(new Prijem(idPrevadzky, "TEST", new Date(System.currentTimeMillis()), 0.0));

        List<Prijem> prijmy = prijemDao.nacitajVsetkyPrijmy();
        int id = prijmy.get(prijmy.size() - 1).getId();
        int pocetPred = prijmy.size();

        prijemDao.odoberPrijem(id);
        int pocetPo = prijemDao.nacitajVsetkyPrijmy().size();

        prevadzkaDao.odoberPrevadzku(idPrevadzky);

        assertTrue(pocetPred - 1 == pocetPo);
    }

}
