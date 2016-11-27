package dao.impl;

import dao.DaoFactory;
import dao.interfaces.ProduktDao;
import entity.Produkt;
import java.util.List;
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
        int pocetPred = produktDao.nacitajVsetkyProdukty().size();
        produktDao.pridajProdukt(new Produkt("TEST", 1, 2));
        int pocetPo = produktDao.nacitajVsetkyProdukty().size();
        assertEquals(pocetPred + 1, pocetPo);
    }

    /**
     * Test of nacitajProdukt method, of class ProduktDaoImpl.
     */
    @Test
    public void testNacitajProdukt() {
        Produkt produkt = null;
        if (!produktDao.nacitajVsetkyProdukty().isEmpty()) {
            produkt = produktDao.nacitajProdukt(produktDao.nacitajVsetkyProdukty().get(0).getId());
        }
        assertTrue(produkt != null);
    }

    /**
     * Test of nacitajVsetkyProdukty method, of class ProduktDaoImpl.
     */
    @Test
    public void testNacitajVsetkyProdukty() {
        List<Produkt> nacitanyList = produktDao.nacitajVsetkyProdukty();
        assertTrue(nacitanyList != null);
    }

    /**
     * Test of upravProdukt method, of class ProduktDaoImpl.
     */
    @Test
    public void testUpravProdukt() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of odoberProdukt method, of class ProduktDaoImpl.
     */
    @Test
    public void testOdoberProdukt() {
        Produkt produkt = new Produkt();
        produktDao.pridajProdukt(new Produkt("TEST", 1, 2));
        List<Produkt> zoznamProduktov = produktDao.nacitajVsetkyProdukty();
        for (Produkt p : zoznamProduktov) {
            if (p.getNazov().equals("TEST")) {
                produkt = p;
            }
        }
        int pocetPred = zoznamProduktov.size();
        produktDao.odoberProdukt(produkt.getId());
        int pocetPo = produktDao.nacitajVsetkyProdukty().size();
        assertTrue(pocetPred - 1 == pocetPo);
    }

    /**
     * Test of vycisliZisk method, of class ProduktDaoImpl.
     */
    @Test
    public void testVycisliZisk() {
        Produkt produkt = new Produkt("TEST", 1, 2);
        produktDao.pridajProdukt(produkt);
        List<Produkt> produkty = produktDao.nacitajVsetkyProdukty();
        int idProduktu = produkty.get(produkty.size() - 1).getId();
        assertTrue(1.0 == produktDao.vycisliZisk(idProduktu));
    }

}
