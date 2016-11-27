package dao.impl;

import dao.DaoFactory;
import dao.interfaces.NakladDao;
import dao.interfaces.PrevadzkaDao;
import entity.Naklad;
import entity.Prevadzka;
import java.sql.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.omg.CORBA.Current;

public class NakladDaoImplTest {
    
    private NakladDao nakladDao;
    
    public NakladDaoImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        nakladDao = DaoFactory.INSTANCE.getNakladDao();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pridajNaklad method, of class NakladDaoImpl.
     */
    @Test
    public void testPridajNaklad() {
        PrevadzkaDao prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
        int pocetPred = nakladDao.nacitajVsetkyNaklady().size();
        Prevadzka novaPrevadzka = new Prevadzka("TEST", "TEST", "TEST");
        prevadzkaDao.pridajPrevadzku(novaPrevadzka);
        List<Prevadzka> prevadzky = prevadzkaDao.nacitajVsetkyPrevadzky();
        int idPrevadzky = prevadzky.get(prevadzky.size() - 1).getId();
        nakladDao.pridajNaklad(new Naklad(DaoFactory.INSTANCE.getPrevadzkaDao().nacitajPrevadzku(idPrevadzky), "TEST", new Date(System.currentTimeMillis()), 0.0));
        int pocetPo = nakladDao.nacitajVsetkyNaklady().size();
        assertEquals(pocetPred + 1, pocetPo);
    }

    /**
     * Test of nacitajNaklad method, of class NakladDaoImpl.
     */
    @Test
    public void testNacitajNaklad() {
        Naklad naklad = null;
        if (!nakladDao.nacitajVsetkyNaklady().isEmpty()) {
            naklad = nakladDao.nacitajNaklad(nakladDao.nacitajVsetkyNaklady().get(0).getId());
        }
        assertTrue(naklad != null);
    }

    /**
     * Test of nacitajVsetkyNaklady method, of class NakladDaoImpl.
     */
    @Test
    public void testNacitajVsetkyNaklady() {
        List<Naklad> naklady = nakladDao.nacitajVsetkyNaklady();
        assertTrue(naklady != null);
    }

    /**
     * Test of upravNaklad method, of class NakladDaoImpl.
     */
    @Test
    public void testUpravNaklad() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of odoberNaklad method, of class NakladDaoImpl.
     */
    @Test
    public void testOdoberNaklad() {
        Naklad naklad = new Naklad();
        List<Naklad> naklady = nakladDao.nacitajVsetkyNaklady();
        for (Naklad n : naklady) {
            if (n.getPopis().equals("TEST")) {
                naklad = n;
            }
        }
        int pocetPred = naklady.size();
        nakladDao.odoberNaklad(naklad.getId());
        int pocetPo = nakladDao.nacitajVsetkyNaklady().size();
        assertTrue(pocetPred - 1 == pocetPo);
    }
    
}
