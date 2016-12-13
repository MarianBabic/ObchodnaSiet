package sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces;

import sk.upjs.ics.paz1c.obchodnaSiet.entity.Zamestnanec;
import java.util.List;

public interface ZamestnanecDao {

    void pridajZamestnanaca(Zamestnanec zamestnanec);

    Zamestnanec nacitajZamestnanca(int id);

    List<Zamestnanec> nacitajVsetkychZamestnancov();

    void upravZamestnanca(int id);

    void odoberZamestnanca(int id);

}
