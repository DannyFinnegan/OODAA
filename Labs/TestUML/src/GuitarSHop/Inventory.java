package GuitarSHop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory extends Instrument {

    private List instruments;

    public Inventory() {
        instruments = new LinkedList();
    }

    public void addInstruments(String serialNumber, double price, GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);
        instruments.add(guitar);
    }


    public List search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList();
        for (Iterator i = instruments.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSpec().matches(searchSpec))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}
