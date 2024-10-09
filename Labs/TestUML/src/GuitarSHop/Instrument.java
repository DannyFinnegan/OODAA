package GuitarSHop;

public abstract class Instrument  {
    private String SerialNumber;
    private double price;
    private InstrumentSpec spec;

    public String getSerialNumber() {
        return SerialNumber;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        return this.price = price;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }
}
