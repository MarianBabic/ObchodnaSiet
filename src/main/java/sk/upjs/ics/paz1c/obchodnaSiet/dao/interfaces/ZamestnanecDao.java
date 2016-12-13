package sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces;

import sk.upjs.ics.paz1c.obchodnaSiet.entity.Zamestnanec;
import java.util.List;

public interface ZamestnanecDao {

    void pridajZamestnanaca(Zamestnanec zamestnanec);

    Zamestnanec nacitajZamestnanca(Integer id);

    List<Zamestnanec> nacitajVsetkychZamestnancov();

    void upravZamestnanca(Integer id);

    void odoberZamestnanca(Integer id);

}
