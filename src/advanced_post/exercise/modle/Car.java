package advanced_post.exercise.modle;

public class Car extends Vehicle {
    private int NumberOfSeats;
    private String typeOfCar;

    public Car() {
    }

    public Car(String name, String seaOfControl, String manufacturer, int yearOfManufacture, int numberOfSeats, String typeOfCar) {
        super(name, seaOfControl, manufacturer, yearOfManufacture);
        NumberOfSeats = numberOfSeats;
        this.typeOfCar = typeOfCar;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Số chỗ ngồi: " + getNumberOfSeats() +
                ", Kiểu xe: " + getTypeOfCar();
    }
}
