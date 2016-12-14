package sk.upjs.ics.paz1c.obchodnaSiet.model;

import javax.swing.AbstractListModel;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.interfaces.PrevadzkaDao;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Prevadzka;

public class PrevadzkyListModel extends AbstractListModel<Prevadzka>{

    private PrevadzkaDao dao;
    
    public PrevadzkyListModel(){
        dao = DaoFactory.INSTANCE.getPrevadzkaDao();
    }
    
    @Override
    public int getSize() {
        return dao.nacitajVsetkyPrevadzky().size();
    }

    @Override
    public Prevadzka getElementAt(int index) {
        return dao.nacitajPrevadzku(index);
    }
    
}
