package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrevadzkaDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Naklad;
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
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.NakladDao;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrijemDao;

public class PrevadzkaDaoImplTest {

    private final PrevadzkaDao prevadzkaDao;

    public PrevadzkaDaoImplTest() {
        prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
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
     * Test of pridajPrevadzku method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testPridajPrevadzku() {
        int pocetPred = prevadzkaDao.nacitajVsetkyPrevadzky().size();
        prevadzkaDao.pridajPrevadzku(new Prevadzka("TEST", "TEST", "TEST"));
        int pocetPo = prevadzkaDao.nacitajVsetkyPrevadzky().size();

        List<Prevadzka> list = prevadzkaDao.nacitajVsetkyPrevadzky();
        Integer id = list.get(list.size() - 1).getId();
        prevadzkaDao.odoberPrevadzku(id);

        assertEquals(pocetPred + 1, pocetPo);
    }

    /**
     * Test of nacitajPrevadzku method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testNacitajPrevadzku() {
        PrevadzkaDao prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
        prevadzkaDao.pridajPrevadzku(new Prevadzka("TEST", "TEST", "TEST"));
        List<Prevadzka> prevadzky = prevadzkaDao.nacitajVsetkyPrevadzky();
        int idPrevadzky = prevadzky.get(prevadzky.size() - 1).getId();

        Prevadzka prevadzka = prevadzkaDao.nacitajPrevadzku(idPrevadzky);

        prevadzkaDao.odoberPrevadzku(idPrevadzky);

        assertTrue(prevadzka != null && prevadzka.getNazov().equals("TEST") && prevadzka.getAdresa().equals("TEST") && prevadzka.getOtvaracieHodiny().equals("TEST"));
    }

    /**
     * Test of nacitajVsetkyPrevadzky method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testNacitajVsetkyPrevadzky() {
        List<Prevadzka> zoznamPrevadzok = prevadzkaDao.nacitajVsetkyPrevadzky();
        assertFalse(zoznamPrevadzok == null);
    }

    // TODO
//    /**
//     * Test of upravPrevadzku method, of class PrevadzkaDaoImpl.
//     */
//    @Test
//    public void testUpravPrevadzku() {
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of odoberPrevadzku method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testOdoberPrevadzku() {
        prevadzkaDao.pridajPrevadzku(new Prevadzka("TEST", "TEST", "TEST"));
        int pocetPred = prevadzkaDao.nacitajVsetkyPrevadzky().size();

        List<Prevadzka> list = prevadzkaDao.nacitajVsetkyPrevadzky();
        Integer id = list.get(list.size() - 1).getId();
        prevadzkaDao.odoberPrevadzku(id);

        int pocetPo = prevadzkaDao.nacitajVsetkyPrevadzky().size();

        assertTrue(pocetPred - 1 == pocetPo);
    }

    /**
     * Test of vycisliZisk method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testVycisliZisk() {
        prevadzkaDao.pridajPrevadzku(new Prevadzka("TEST", "TEST", "TEST"));
        List<Prevadzka> list = prevadzkaDao.nacitajVsetkyPrevadzky();
        Integer id = list.get(list.size() - 1).getId();

        NakladDao nakladDao = DaoFactory.INSTANCE.getNakladDao();
        PrijemDao prijemDao = DaoFactory.INSTANCE.getPrijemDao();
        nakladDao.pridajNaklad(new Naklad(id, "TEST", new Date(System.currentTimeMillis()), 0));
        prijemDao.pridajPrijem(new Prijem(id, "TEST", new Date(System.currentTimeMillis()), 0));
        double ocakavanyZisk = 0;

        double vycislenyZisk = prevadzkaDao.vycisliZisk(id);

        List<Naklad> naklady = nakladDao.nacitajVsetkyNaklady();
        Integer idNaklad = naklady.get(naklady.size() - 1).getId();
        nakladDao.odoberNaklad(idNaklad);
        List<Prijem> prijmy = prijemDao.nacitajVsetkyPrijmy();
        Integer idPrijem = prijmy.get(prijmy.size() - 1).getId();
        prijemDao.odoberPrijem(idPrijem);
        prevadzkaDao.odoberPrevadzku(id);

        assertTrue(ocakavanyZisk == vycislenyZisk);

    }

}
