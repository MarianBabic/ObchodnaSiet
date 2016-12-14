package sk.upjs.ics.paz1c.obchodnaSiet.model;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ZamestnanecDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Zamestnanec;

public class ZamestnanecComboBoxModel extends DefaultComboBoxModel<Zamestnanec> {

    private ZamestnanecDao zamestnaneDao = DaoFactory.INSTANCE.getZamestnanecDao();
    private List<Zamestnanec> zamestnanci = zamestnaneDao.nacitajVsetkychZamestnancov();

    public ZamestnanecComboBoxModel() {
        for (Zamestnanec z : zamestnanci) {
            addElement(z);
        }
    }

}
