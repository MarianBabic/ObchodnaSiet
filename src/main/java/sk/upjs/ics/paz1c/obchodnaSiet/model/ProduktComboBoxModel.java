package sk.upjs.ics.paz1c.obchodnaSiet.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import sk.upjs.ics.paz1c.obchodnaSiet.dao.DaoFactory;
import sk.upjs.ics.paz1c.obchodnaSiet.entity.Produkt;

public class ProduktComboBoxModel extends DefaultComboBoxModel<Produkt> {

    private List<Produkt> produkty;

    public ProduktComboBoxModel() {
        produkty = DaoFactory.INSTANCE.getProduktDao().nacitajVsetkyProdukty();
    }

    public void pridajProdukt(Produkt produkt) {
        DaoFactory.INSTANCE.getProduktDao().pridajProdukt(produkt);
    }

    public List<String> getProduktyStringy() {
        List<String> zoznam = new ArrayList<>();
        for (Produkt produkt : produkty) {
            zoznam.add(produkt.toString());
        }
        return zoznam;
    }

}
