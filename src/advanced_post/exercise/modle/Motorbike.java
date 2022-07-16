package advanced_post.exercise.modle;

public class Motorbike extends Vehicle {
    private double wattage;

    public Motorbike() {
    }

    public Motorbike(String name, String seaOfControl, String manufacturer, int yearOfManufacture, double wattage) {
        super(name, seaOfControl, manufacturer, yearOfManufacture);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return super.toString() + ", công xuất " + getWattage() + " (kw)";
    }
}
