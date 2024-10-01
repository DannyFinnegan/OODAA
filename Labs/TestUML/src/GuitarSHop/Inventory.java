package GuitarSHop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, Model model,
                          GuitarType type, Wood backWood, Wood topWood){
        //Guitar guitar = new Guitar(serialNumber, price, model, type, builder, backwood , topwood);
        Guitar guitar = new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); ((Iterator) i).hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List search(Guitar searchGuitar) {
        List<Guitar> matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            //ignore serialNumber since it is unique
            //ignore price since it is irrelevant

            Builder builder = searchGuitar.getBuilder();

            Model model = searchGuitar.getModel();
            if (model != null && !model.equals(guitar.getModel()))
                continue;

            GuitarType type = searchGuitar.getType();
            if (!searchGuitar.equals("")) {
                if ((type != null) && (!type.equals(guitar.getType()))) {
                    continue;
                }
            }

            Wood backWood = searchGuitar.getBackwood();
            if (backWood != null && !backWood.equals(guitar.getBackwood()))
                continue;
            Wood topWood = searchGuitar.getBackwood();
            if (topWood != null && !topWood.equals(guitar.getTopwood()))
                continue;
          matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}
