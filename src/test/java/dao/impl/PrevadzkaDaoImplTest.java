package dao.impl;

import dao.DaoFactory;
import dao.interfaces.PrevadzkaDao;
import entity.Prevadzka;
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
        System.out.println("pridajPrevadzku");
        Prevadzka prevadzka = null;
        PrevadzkaDaoImpl instance = null;
        instance.pridajPrevadzku(prevadzka);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nacitajPrevadzku method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testNacitajPrevadzku() {
        System.out.println("nacitajPrevadzku");
        int id = 0;
        PrevadzkaDaoImpl instance = null;
        Prevadzka expResult = null;
        Prevadzka result = instance.nacitajPrevadzku(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nacitajVsetkyPrevadzky method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testNacitajVsetkyPrevadzky() {
        System.out.println("nacitajVsetkyPrevadzky");
        PrevadzkaDaoImpl instance = null;
        List<Prevadzka> expResult = null;
        List<Prevadzka> result = instance.nacitajVsetkyPrevadzky();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upravPrevadzku method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testUpravPrevadzku() {
        System.out.println("upravPrevadzku");
        int id = 0;
        String nazov = "";
        String adresa = "";
        String otvaracieHodiny = "";
        PrevadzkaDaoImpl instance = null;
        instance.upravPrevadzku(id, nazov, adresa, otvaracieHodiny);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of odoberPrevadzku method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testOdoberPrevadzku() {
        System.out.println("odoberPrevadzku");
        int id = 0;
        PrevadzkaDaoImpl instance = null;
        instance.odoberPrevadzku(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vycisliZisk method, of class PrevadzkaDaoImpl.
     */
    @Test
    public void testVycisliZisk() {
        System.out.println("vycisliZisk");
        int id = 0;
        PrevadzkaDaoImpl instance = null;
        double expResult = 0.0;
        double result = instance.vycisliZisk(id);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
