/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.DaoFactory;
import dao.interfaces.PrevadzkaDao;
import dao.interfaces.ProduktDao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class ProduktNaPredajniDaoImplTest {

    private ProduktDao produktDao;
    private PrevadzkaDao prevadzkaDao;

    public ProduktNaPredajniDaoImplTest() {
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
        prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of pridajProduktNaPredajnu method, of class
     * ProduktNaPredajniDaoImpl.
     */
    @Test
    public void testPridajProduktNaPredajnu() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nacitajProduktNaPredajni method, of class
     * ProduktNaPredajniDaoImpl.
     */
    @Test
    public void testNacitajProduktNaPredajni() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nacitajVsetkyProduktyNaPredajniach method, of class
     * ProduktNaPredajniDaoImpl.
     */
    @Test
    public void testNacitajVsetkyProduktyNaPredajniach() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upravProduktNaPredajni method, of class ProduktNaPredajniDaoImpl.
     */
    @Test
    public void testUpravProduktNaPredajni() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of odoberProduktZPredajne method, of class ProduktNaPredajniDaoImpl.
     */
    @Test
    public void testOdoberProduktZPredajne() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
