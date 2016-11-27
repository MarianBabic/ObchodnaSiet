
import dao.DaoFactory;
import entity.*;
import dao.interfaces.*;
import java.sql.Date;
import java.util.Calendar;

public class Main {

    // po otestovani zmazem
    public static void testPrevadzka() {
        Prevadzka prevadzka = new Prevadzka("Bufet na Jesennej", "Jesenna ulica, Kosice", "pracovne dni 7:00-15:00");
        PrevadzkaDao prevadzkaDao = DaoFactory.INSTANCE.getPrevadzkaDao();

//        prevadzkaDao.pridajPrevadzku(prevadzka);
        System.out.println(prevadzkaDao.nacitajPrevadzku(1));

        System.out.println(prevadzkaDao.nacitajVsetkyPrevadzky());

        prevadzkaDao.upravPrevadzku(1, "Bufet - Jesenna", "Jesenna ulica", "po-pi 7-15");

        prevadzkaDao.odoberPrevadzku(8);

    }

    // po otestovani zmazem
    public static void testProdukt() {
        Produkt produkt = new Produkt("Hell 0.33 l", 0.5, 0.8);
        ProduktDao produktDao = DaoFactory.INSTANCE.getProduktDao();

//        produktDao.pridajProdukt(produkt);
        System.out.println(produktDao.nacitajProdukt(7));

        System.out.println(produktDao.nacitajVsetkyProdukty());

        produktDao.odoberProdukt(8);

        System.out.println(produktDao.vycisliZisk(10));
    }

    // po otestovani zmazem
    public static void testNaklad() {
        Naklad naklad = new Naklad(DaoFactory.INSTANCE.getPrevadzkaDao().nacitajVsetkyPrevadzky().get(0), "nejaky naklad", new Date(System.currentTimeMillis()), 5);
        NakladDao nakladDao = DaoFactory.INSTANCE.getNakladDao();

//        nakladDao.pridajNaklad(naklad);
        System.out.println(nakladDao.nacitajNaklad(2));

        System.out.println(nakladDao.nacitajVsetkyNaklady());

//        nakladDao.odoberNaklad(1);
    }

    // po otestovani zmazem
    public static void testPrijem() {
        Prijem prijem = new Prijem(DaoFactory.INSTANCE.getPrevadzkaDao().nacitajVsetkyPrevadzky().get(0), "prijem", new Date(System.currentTimeMillis()), 100);
        PrijemDao prijemDao = DaoFactory.INSTANCE.getPrijemDao();

//        prijemDao.pridajPrijem(prijem);
        System.out.println(prijemDao.nacitajPrijem(3));

        System.out.println(prijemDao.nacitajVsetkyPrijmy());

//        prijemDao.odoberPrijem(2);
    }

    // po otestovani zmazem
    public static void testZamestnanec() {
        Zamestnanec zamestnanec = new Zamestnanec("Adam", "Blazon", DaoFactory.INSTANCE.getPrevadzkaDao().nacitajVsetkyPrevadzky().get(0), 172, 1500, 500);
        ZamestnanecDao zamestnanecDao = DaoFactory.INSTANCE.getZamestnanecDao();

        zamestnanecDao.pridajZamestnanaca(zamestnanec);
        
        System.out.println(zamestnanecDao.nacitajZamestnanca(2));
        
        System.out.println(zamestnanecDao.nacitajVsetkychZamestnancov());
        
//        zamestnanecDao.odoberZamestnanca(1);

    }

    public static void main(String[] args) {

//        testPrevadzka();
//        testProdukt();
//        testNaklad();
//        testPrijem();
        testZamestnanec();

    }

}
