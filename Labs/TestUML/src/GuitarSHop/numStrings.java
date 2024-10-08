package GuitarSHop;

public enum numStrings {
    Six, twelve;

    @Override
    public String toString() {
        return switch (this) {
            case Six -> "6";
            case twelve -> "12";
            default -> "6";
        };
    }
}

