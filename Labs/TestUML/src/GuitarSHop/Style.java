package GuitarSHop;

public enum Style {
    A, F;

    public String toString() {
        return switch (this) {
            case A -> "A";
            case F -> "F";
            default -> "A";
        };
    }
}
