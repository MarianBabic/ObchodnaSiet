package dao.impl;

import dao.DaoFactory;
import dao.interfaces.PrevadzkaDao;
import entity.Naklad;
import entity.Prevadzka;
import entity.Prijem;
import java.sql.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrevadzkaDaoImplTest {

    private PrevadzkaDao prevadzkaDao;

    public PrevadzkaDaoImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
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
        assertEquals(pocetPred + 1, pocetPo);
    }

    /**
     * Test of nacitajPrevadzku method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testNacitajPrevadzku() {
        Prevadzka prevadzka = null;
        if (!prevadzkaDao.nacitajVsetkyPrevadzky().isEmpty()) {
            prevadzka = prevadzkaDao.nacitajPrevadzku(prevadzkaDao.nacitajVsetkyPrevadzky().get(0).getId());
        }
        assertTrue(prevadzka != null);
    }

    /**
     * Test of nacitajVsetkyPrevadzky method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testNacitajVsetkyPrevadzky() {
        List<Prevadzka> zoznamPrevadzok = prevadzkaDao.nacitajVsetkyPrevadzky();
        assertFalse(zoznamPrevadzok == null);
    }

    /**
     * Test of upravPrevadzku method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testUpravPrevadzku() {
        Prevadzka prevadzka = null;
        List<Prevadzka> zoznamPrevadzok = prevadzkaDao.nacitajVsetkyPrevadzky();
        for (Prevadzka p : zoznamPrevadzok) {
            if (p.getNazov().equals("TEST")) {
                prevadzka = p;
            }
        }
        if (prevadzka == null) {
            fail("Neexistuje testovacia prevadzka");
        }
        String nazov = "fsdgggf";
        String adresa = "sfhfhffg";
        String otvaracieHodiny = "jtfjfjfg";
        prevadzkaDao.upravPrevadzku(prevadzka.getId(), nazov, adresa, otvaracieHodiny);
        Prevadzka upravenaPrevadzka = prevadzkaDao.nacitajPrevadzku(prevadzka.getId());
        assertTrue(upravenaPrevadzka.getNazov().equals(nazov) && upravenaPrevadzka.getAdresa().equals(adresa) && upravenaPrevadzka.getOtvaracieHodiny().equals(otvaracieHodiny));
    }

    /**
     * Test of odoberPrevadzku method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testOdoberPrevadzku() {
        Prevadzka prevadzka = new Prevadzka();
        List<Prevadzka> zoznamPrevadzok = prevadzkaDao.nacitajVsetkyPrevadzky();
        for (Prevadzka p : zoznamPrevadzok) {
            if (p.getNazov().equals("TEST")) {
                prevadzka = p;
            }
        }
        int pocetPred = zoznamPrevadzok.size();
        prevadzkaDao.odoberPrevadzku(prevadzka.getId());
        int pocetPo = prevadzkaDao.nacitajVsetkyPrevadzky().size();
        assertTrue(pocetPred - 1 == pocetPo);
    }

    /**
     * Test of vycisliZisk method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testVycisliZisk() {
        Prevadzka novaPrevadzka = new Prevadzka("TEST", "TEST", "TEST");
        prevadzkaDao.pridajPrevadzku(novaPrevadzka);
        List<Prevadzka> prevadzky = prevadzkaDao.nacitajVsetkyPrevadzky();
        int idPrevadzky = prevadzky.get(prevadzky.size() - 1).getId();

        DaoFactory.INSTANCE.getNakladDao().pridajNaklad(new Naklad(DaoFactory.INSTANCE.getPrevadzkaDao().nacitajPrevadzku(idPrevadzky), "TEST", new Date(System.currentTimeMillis()), 100));
        DaoFactory.INSTANCE.getPrijemDao().pridajPrijem(new Prijem(DaoFactory.INSTANCE.getPrevadzkaDao().nacitajPrevadzku(idPrevadzky), "TEST", new Date(System.currentTimeMillis()), 50));
        double ocakavanyZisk = -50;

        double vycislenyZisk = prevadzkaDao.vycisliZisk(idPrevadzky);

        assertTrue(ocakavanyZisk == vycislenyZisk);

    }

}
