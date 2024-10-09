package GuitarSHop;

public class MandolinSpec {
    private Style style;

    public Style getStyle() {
        return style;
    }

    public boolean matches(MandolinSpec otherSpec) {
        if(style != otherSpec.style)
            return false;
        return true;
    }


}
