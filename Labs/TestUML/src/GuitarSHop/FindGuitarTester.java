package GuitarSHop;

import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec(Builder.FENDER, Model.STRATOCASTOR, GuitarType.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = whatLookingFor.search(inventory, whatLookingFor);
        listMatchingGuitars(matchingGuitars);


    }

    public static void listMatchingGuitars(List<Guitar> matchingGuitars) {
        if (matchingGuitars.isEmpty()) {
            System.out.println("Sorry, we have nothing for you.");
        } else {
            System.out.println("You might like this: ");
            for (Guitar matchingGuitar : matchingGuitars) {
                System.out.println(matchingGuitar.getSerialNumber() + " " + matchingGuitar.getPrice());
            }
        }
    }

    public static void initialiseInventory(Inventory inventory) {
        //add guitars to the inventory
        GuitarSpec G1 = new GuitarSpec(Builder.FENDER, Model.STRATOCASTOR, GuitarType.ELECTRIC, Wood.ALDER, Wood.ALDER);
        GuitarSpec G2 = new GuitarSpec(Builder.COLLINS, Model.STRATOCASTOR, GuitarType.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V00001",
                1499.99, G1);

        inventory.addGuitar("V00002",
                1699.99, G2);


        inventory.addGuitar("V00003",
                899.99, G1);


    }
}
