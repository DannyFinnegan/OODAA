package GuitarSHop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GuitarSpec {
    private Builder builder;
    private Model model;
    private GuitarType type;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, Model model, GuitarType type,  Wood topWood, Wood backWood) {
        this.builder = builder;
        this.topWood = topWood;
        this.backWood = backWood;
        this.type = type;
        this.model = model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public GuitarType getType() {
        return type;
    }

    public void setType(GuitarType type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }
    public List<Guitar> search(Inventory inventory, GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();
        for (Guitar guitar : inventory.getGuitars()) {
            // ignore serialNumber since it is unique
            // ignore price since it is irrelevant
            if (searchSpec.getBuilder() != guitar.getSpec().getBuilder())
                continue;

            String model = searchSpec.getModel().toString().toLowerCase();
            if (!model.equals(guitar.getSpec().getModel().toString().toLowerCase()))
                continue;

            if (searchSpec.getType() != guitar.getSpec().getType())
                continue;

            if (searchSpec.getBackWood() != null && !searchSpec.getBackWood().equals(guitar.getSpec().getBackWood()))
                continue;

            if (searchSpec.getTopWood() != null && !searchSpec.getTopWood().equals(guitar.getSpec().getTopWood()))
                continue;

            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
