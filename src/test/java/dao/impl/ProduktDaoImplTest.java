package dao.impl;

import dao.DaoFactory;
import dao.interfaces.ProduktDao;
import entity.Produkt;
import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProduktDaoImplTest {

    private ProduktDao produktDao;

    public ProduktDaoImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        produktDao = DaoFactory.INSTANCE.getProduktDao();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of pridajProdukt method, of class ProduktDaoImpl.
     */
    @Test
    public void testPridajProdukt() {
        int produktyPred = produktDao.nacitajVsetkyProdukty().size();
        Produkt novyProdukt = new Produkt("novy produkt", 1, 2);
        produktDao.pridajProdukt(novyProdukt);
        assertTrue(produktyPred + 1 == produktDao.nacitajVsetkyProdukty().size());
    }

    /**
     * Test of nacitajProdukt method, of class ProduktDaoImpl.
     */
    @Test
    public void testNacitajProdukt() {
        if (produktDao.nacitajVsetkyProdukty().size() != 0) {
            assertTrue(produktDao.nacitajProdukt(1) != null);
        }
    }

    /**
     * Test of nacitajVsetkyProdukty method, of class ProduktDaoImpl.
     */
    @Test
    public void testNacitajVsetkyProdukty() {
        List<Produkt> nacitanyList = produktDao.nacitajVsetkyProdukty();
        assertTrue(nacitanyList.size() > 0);
    }

    /**
     * Test of upravProdukt method, of class ProduktDaoImpl.
     */
    @Test
    public void testUpravProdukt() {
        System.out.println("upravProdukt");
        int id = 0;
        ProduktDaoImpl instance = null;
        instance.upravProdukt(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of odoberProdukt method, of class ProduktDaoImpl.
     */
    @Test
    public void testOdoberProdukt() {
        produktDao.pridajProdukt(new Produkt("rozok", 0.1, 0.2));
        int pocetPred = produktDao.nacitajVsetkyProdukty().size();
        produktDao.odoberProdukt(1);
        assertTrue(pocetPred - 1 == produktDao.nacitajVsetkyProdukty().size());
    }

    /**
     * Test of vycisliZisk method, of class ProduktDaoImpl.
     */
    @Test
    public void testVycisliZisk() {
        System.out.println("vycisliZisk");
        int id = 0;
        ProduktDaoImpl instance = null;
        double expResult = 0.0;
        double result = instance.vycisliZisk(id);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
