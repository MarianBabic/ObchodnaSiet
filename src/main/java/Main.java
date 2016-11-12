
import dao.DaoFactory;
import dao.PobockaDao;
import entity.Pobocka;

public class Main {

    public static void main(String[] args) {

        Pobocka pobocka = new Pobocka("Filialka - Optima", "Moldavska cesta, Kosice", 0, 0);
        PobockaDao pobockaDao = DaoFactory.INSTANCE.getPobockaDao();
        pobockaDao.addPobocka(pobocka);

        System.out.println("<<< VSETKO BEZI >>>");

    }

}
