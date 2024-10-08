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
    private numStrings numStrings;

    public GuitarSpec(Builder builder, Model model, GuitarType type, Wood topWood, Wood backWood, numStrings numStrings) {
        this.builder = builder;
        this.topWood = topWood;
        this.backWood = backWood;
        this.type = type;
        this.model = model;
        this.numStrings = numStrings;
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

    public GuitarSHop.numStrings getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(GuitarSHop.numStrings numStrings) {
        this.numStrings = numStrings;
    }

    public boolean matches(GuitarSpec OtherSpec) {
        if (builder != OtherSpec.getBuilder())
            return false;


        if ((model != null) && (!model.equals("")) && !model.equals(OtherSpec.model))
            return false;

        if (type != OtherSpec.type)
            return false;

        if (backWood != OtherSpec.backWood)
            return false;

        if (topWood != OtherSpec.topWood)
            return false;

        if (numStrings != OtherSpec.numStrings)
            return false;

        return true;
    }
}

