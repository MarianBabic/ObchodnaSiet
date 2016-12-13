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

    private PrijemDao prijemDao;

    public PrijemDaoImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        prijemDao = DaoFactory.INSTANCE.getPrijemDao();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of pridajPrijem method, of class PrijemDaoImpl.
     */
    @Test
    public void testPridajPrijem() {
        PrevadzkaDao prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
        int pocetPred = prijemDao.nacitajVsetkyPrijmy().size();
        Prevadzka novaPrevadzka = new Prevadzka("TEST", "TEST", "TEST");
        prevadzkaDao.pridajPrevadzku(novaPrevadzka);
        List<Prevadzka> prevadzky = prevadzkaDao.nacitajVsetkyPrevadzky();
        int idPrevadzky = prevadzky.get(prevadzky.size() - 1).getId();
        prijemDao.pridajPrijem(new Prijem(DaoFactory.INSTANCE.getPrevadzkaDao().nacitajPrevadzku(idPrevadzky), "TEST", new Date(System.currentTimeMillis()), 0.0));
        int pocetPo = prijemDao.nacitajVsetkyPrijmy().size();
        assertEquals(pocetPred + 1, pocetPo);
    }

    /**
     * Test of nacitajPrijem method, of class PrijemDaoImpl.
     */
    @Test
    public void testNacitajPrijem() {
        Prijem prijem = null;
        if (!prijemDao.nacitajVsetkyPrijmy().isEmpty()) {
            prijem = prijemDao.nacitajPrijem(prijemDao.nacitajVsetkyPrijmy().get(0).getId());
        }
        assertTrue(prijem != null);
    }

    /**
     * Test of nacitajVsetkyPrijmy method, of class PrijemDaoImpl.
     */
    @Test
    public void testNacitajVsetkyPrijmy() {
        List<Prijem> prijmy = prijemDao.nacitajVsetkyPrijmy();
        assertTrue(prijmy != null);
    }

    /**
     * Test of upravPrijem method, of class PrijemDaoImpl.
     */
    @Test
    public void testUpravPrijem() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of odoberPrijem method, of class PrijemDaoImpl.
     */
    @Test
    public void testOdoberPrijem() {
        Prijem prijem = new Prijem();
        List<Prijem> prijmy = prijemDao.nacitajVsetkyPrijmy();
        for (Prijem n : prijmy) {
            if (n.getPopis().equals("TEST")) {
                prijem = n;
            }
        }
        int pocetPred = prijmy.size();
        prijemDao.odoberPrijem(prijem.getId());
        int pocetPo = prijemDao.nacitajVsetkyPrijmy().size();
        assertTrue(pocetPred - 1 == pocetPo);
    }

}
