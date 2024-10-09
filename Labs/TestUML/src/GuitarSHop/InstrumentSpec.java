package GuitarSHop;

public class  InstrumentSpec {
    private Model model;
    private Builder builder;
    private GuitarType type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, Model model, GuitarType type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Model getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public GuitarType getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if (builder != otherSpec.getBuilder())
            return false;

        if ((model != null) && (!model.equals("")) && !model.equals(otherSpec.getModel()))
            return false;

        if (type != otherSpec.getType())
            return false;

        if (backWood != otherSpec.getBackWood())
            return false;

        if (topWood != otherSpec.getTopWood())
            return false;

        return true;
    }
}
