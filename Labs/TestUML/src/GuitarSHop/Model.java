package GuitarSHop;

public enum Model {
    STRATOCASTOR, WARLOCK;

    @Override
    public String toString() {
        return switch (this) {
            case STRATOCASTOR -> "Stratocastor";
            case WARLOCK -> "Warlock";
            default -> "Stratocastor";
        };
    }
}