package sk.upjs.ics.paz1c.obchodnaSiet.dao.impl;

import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ProduktDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Produkt;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProduktDaoImplTest {

    private final ProduktDao produktDao;

    public ProduktDaoImplTest() {
        produktDao = DaoFactory.INSTANCE.getProduktDao();
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
     * Test of pridajProdukt method, of class ProduktDaoImpl.
     */
    @Test
    public void testPridajProdukt() {
        int pocetPred = produktDao.nacitajVsetkyProdukty().size();
        produktDao.pridajProdukt(new Produkt("TEST", 0, 0));
        int pocetPo = produktDao.nacitajVsetkyProdukty().size();

        List<Produkt> list = produktDao.nacitajVsetkyProdukty();
        Integer id = list.get(list.size() - 1).getId();
        produktDao.odoberProdukt(id);

        assertEquals(pocetPred + 1, pocetPo);
    }

    /**
     * Test of nacitajProdukt method, of class ProduktDaoImpl.
     */
    @Test
    public void testNacitajProdukt() {
        produktDao.pridajProdukt(new Produkt("TEST", 0, 0));
        List<Produkt> list = produktDao.nacitajVsetkyProdukty();
        Integer id = list.get(list.size() - 1).getId();

        Produkt produkt = produktDao.nacitajProdukt(id);
        
        produktDao.odoberProdukt(id);

        assertTrue(produkt != null && produkt.getNazov().equals("TEST") && produkt.getNakupnaCena() == 0.0 && produkt.getPredajnaCena() == 0.0);
    }

    /**
     * Test of nacitajVsetkyProdukty method, of class ProduktDaoImpl.
     */
    @Test
    public void testNacitajVsetkyProdukty() {
        List<Produkt> nacitanyList = produktDao.nacitajVsetkyProdukty();
        assertTrue(nacitanyList != null);
    }

    // TODO
//    /**
//     * Test of upravProdukt method, of class ProduktDaoImpl.
//     */
//    @Test
//    public void testUpravProdukt() {
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of odoberProdukt method, of class ProduktDaoImpl.
     */
    @Test
    public void testOdoberProdukt() {
        produktDao.pridajProdukt(new Produkt("TEST", 0, 0));
        int pocetPred = produktDao.nacitajVsetkyProdukty().size();

        List<Produkt> list = produktDao.nacitajVsetkyProdukty();
        Integer id = list.get(list.size() - 1).getId();
        produktDao.odoberProdukt(id);

        int pocetPo = produktDao.nacitajVsetkyProdukty().size();

        assertTrue(pocetPred - 1 == pocetPo);
    }

    /**
     * Test of vycisliZisk method, of class ProduktDaoImpl.
     */
    @Test
    public void testVycisliZisk() {
        produktDao.pridajProdukt(new Produkt("TEST", 0, 0));

        List<Produkt> list = produktDao.nacitajVsetkyProdukty();
        Integer id = list.get(list.size() - 1).getId();

        double zisk = produktDao.vycisliZisk(id);

        produktDao.odoberProdukt(id);

        assertTrue(zisk == 0.0);
    }

}
