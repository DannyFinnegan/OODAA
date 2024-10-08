package GuitarSHop;

import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec(numStrings.Six);

        List matchingInstruments = inventory.search(whatLookingFor);
         listMatchingGuitars(matchingInstruments);
    }

    public static void listMatchingGuitars(List<Guitar> matchingGuitars) {
        if (matchingGuitars.isEmpty()) {
            System.out.println("Sorry, we have nothing for you.");
        } else {
            System.out.println("You might like this: ");
            for (Guitar matchingGuitar : matchingGuitars) {
                System.out.println("Serial Number: " + matchingGuitar.getSerialNumber() +
                        "\nPrice: €" + matchingGuitar.getPrice() +
                        "\nBuilder: " + matchingGuitar.getSpec().getBuilder() +
                        "\nModel: " + matchingGuitar.getSpec().getModel() +
                        "\nType: " + matchingGuitar.getSpec().getType() +
                        "\nTop Wood: " + matchingGuitar.getSpec().getTopWood() +
                        "\nBack Wood: " + matchingGuitar.getSpec().getBackWood() +
                        "\nNumber of Strings: " + matchingGuitar.getSpec().getNumStrings());
            }
        }
    }

    public static void initialiseInventory(Inventory inventory) {
        //add guitars to the inventory

        GuitarSpec G1 = new GuitarSpec(numStrings.Six);
        GuitarSpec G2 = new GuitarSpec(numStrings.Six);
        GuitarSpec I1 = new GuitarSpec(numStrings.twelve);
        GuitarSpec I2 = new GuitarSpec(numStrings.twelve);


        inventory.addInstruments("V00001",
                1499.99, G1);
        inventory.addInstruments("V00002",
                1699.99, G2);
        inventory.addInstruments("V00003",
                899.99, G1);
    }
}