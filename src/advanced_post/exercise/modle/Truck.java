package advanced_post.exercise.modle;

public class Truck extends Vehicle {
    private double tonnage;

    public Truck() {
    }

    public Truck(String name, String seaOfControl, String manufacturer, int yearOfManufacture, double tonnage) {
        super(name, seaOfControl, manufacturer, yearOfManufacture);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Trọng tải: " + getTonnage() + " (tấn)";

    }
}
