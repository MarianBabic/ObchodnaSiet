package sk.upjs.ics.paz1c.obchodnaSiet.model;

import java.util.List;
import javax.swing.AbstractListModel;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.NakladDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Naklad;

public class NakladListModel extends AbstractListModel<Naklad> {

    private final NakladDao nakladDao;
    private final List<Naklad> naklady;

    public NakladListModel() {
        nakladDao = DaoFactory.INSTANCE.getNakladDao();
        naklady = nakladDao.nacitajVsetkyNaklady();
    }

    @Override
    public int getSize() {
        return naklady.size();
    }

    @Override
    public Naklad getElementAt(int index) {
        return naklady.get(index);
    }

}
