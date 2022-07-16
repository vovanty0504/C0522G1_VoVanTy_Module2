package advanced_post.exercise.modle;

public abstract class Vehicle {
    private String name;
    private String seaOfControl;
    private String manufacturer;
    private int yearOfManufacture;


    public Vehicle() {
    }

    public Vehicle(String name, String seaOfControl, String manufacturer, int yearOfManufacture) {
        this.name = name;
        this.seaOfControl = seaOfControl;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;

    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chủ sở hữu: " + getName() +
                ", Biển kiểm soát: " + getSeaOfControl() +
                ", Nhà sản xuất: " + getManufacturer() +
                ", Năm Sản xuất: " + getYearOfManufacture();
    }
}
