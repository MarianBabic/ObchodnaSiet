package dao.impl;

import dao.DaoFactory;
import dao.interfaces.ZamestnanecDao;
import entity.Zamestnanec;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ZamestnanecDaoImplTest {

    private ZamestnanecDao zamestnanecDao;

    public ZamestnanecDaoImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        zamestnanecDao = DaoFactory.INSTANCE.getZamestnanecDao();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of pridajZamestnanaca method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testPridajZamestnanaca() {
        System.out.println("pridajZamestnanaca");
        Zamestnanec zamestnanec = null;
        ZamestnanecDaoImpl instance = null;
        instance.pridajZamestnanaca(zamestnanec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nacitajZamestnanca method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testNacitajZamestnanca() {
        System.out.println("nacitajZamestnanca");
        int id = 0;
        ZamestnanecDaoImpl instance = null;
        Zamestnanec expResult = null;
        Zamestnanec result = instance.nacitajZamestnanca(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nacitajVsetkychZamestnancov method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testNacitajVsetkychZamestnancov() {
        System.out.println("nacitajVsetkychZamestnancov");
        ZamestnanecDaoImpl instance = null;
        List<Zamestnanec> expResult = null;
        List<Zamestnanec> result = instance.nacitajVsetkychZamestnancov();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of upravZamestnanca method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testUpravZamestnanca() {
        System.out.println("upravZamestnanca");
        int id = 0;
        ZamestnanecDaoImpl instance = null;
        instance.upravZamestnanca(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of odoberZamestnanca method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testOdoberZamestnanca() {
        System.out.println("odoberZamestnanca");
        int id = 0;
        ZamestnanecDaoImpl instance = null;
        instance.odoberZamestnanca(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vycisliZisk method, of class ZamestnanecDaoImpl.
     */
    @Test
    public void testVycisliZisk() {
        System.out.println("vycisliZisk");
        int id = 0;
        ZamestnanecDaoImpl instance = null;
        double expResult = 0.0;
        double result = instance.vycisliZisk(id);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
