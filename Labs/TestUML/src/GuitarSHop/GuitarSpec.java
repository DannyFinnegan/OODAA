package GuitarSHop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GuitarSpec {
    private numStrings numStrings;

    public GuitarSpec(numStrings numStrings) {
        this.numStrings = GuitarSHop.numStrings.Six;
    }

    public GuitarSHop.numStrings getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(GuitarSHop.numStrings numStrings) {
        this.numStrings = numStrings;
    }

    public boolean matches(GuitarSpec OtherSpec) {

        if(numStrings != OtherSpec.numStrings)
            return false;

        return true;
    }


}

