package ss05_acces_static_method_property.practice.static_property;

public class MainCar {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3", "Skyactiv3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda6", "Skyactiv6");
        System.out.println(Car.numberOfCars);
    }
}
