package sk.upjs.ics.paz1c.obchodnaSiet.model;

import javax.swing.DefaultComboBoxModel;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Produkt;

public class ProduktComboBoxModel extends DefaultComboBoxModel<Produkt> {

    public void pridajProdukt(Produkt produkt) {
        DaoFactory.INSTANCE.getProduktDao().pridajProdukt(produkt);
    }

}
