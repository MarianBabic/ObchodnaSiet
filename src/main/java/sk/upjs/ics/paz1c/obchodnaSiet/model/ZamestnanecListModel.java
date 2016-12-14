package sk.upjs.ics.paz1c.obchodnaSiet.model;

import java.util.List;
import javax.swing.AbstractListModel;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.ZamestnanecDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Zamestnanec;

public class ZamestnanecListModel extends AbstractListModel<Zamestnanec> {

    private ZamestnanecDao zamestnanecDao;
    private List<Zamestnanec> zamestnanci;

    public ZamestnanecListModel() {
        zamestnanecDao = DaoFactory.INSTANCE.getZamestnanecDao();
        zamestnanci = zamestnanecDao.nacitajVsetkychZamestnancov();

    }

    @Override
    public int getSize() {
        return zamestnanci.size();
    }

    @Override
    public Zamestnanec getElementAt(int index) {
        return zamestnanci.get(index);
    }

    public void refresh(){
        zamestnanci = zamestnanecDao.nacitajVsetkychZamestnancov();
        fireContentsChanged(this, 0, getSize());
    }
}
