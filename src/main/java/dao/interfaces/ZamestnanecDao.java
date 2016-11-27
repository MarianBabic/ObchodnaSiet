package dao.interfaces;

import entity.Zamestnanec;
import java.util.List;

public interface ZamestnanecDao {

    void pridajZamestnanaca(Zamestnanec zamestnanec);

    Zamestnanec nacitajZamestnanca(int id);

    List<Zamestnanec> nacitajVsetkychZamestnancov();

    void upravZamestnanca(int id);

    void odoberZamestnanca(int id);

    double vycisliZisk(int id);

}
