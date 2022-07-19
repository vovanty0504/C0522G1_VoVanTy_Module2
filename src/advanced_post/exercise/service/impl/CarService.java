package advanced_post.exercise.service.impl;

import advanced_post.exercise.modle.Car;
import advanced_post.exercise.service.ICarService;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private static  Scanner scanner = new Scanner(System.in);
    private static  List<Car> listCar = new ArrayList<>();

    @Override
    public void add() {
        System.out.print("Chủ sở hữu: ");
        String name = scanner.nextLine();

        System.out.print("Nhập biển kiểm soát: ");
        String seaOfControl = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Nhập Số lượng chỗ ngồi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập Kiểu xe: ");
        String typeOfCar = scanner.nextLine();

        Car car = new Car(name, seaOfControl, manufacturer, yearOfManufacture, numberOfSeats, typeOfCar);
        listCar.add(car);
        System.out.println("thêm mới thành công");

    }

    @Override
    public void displayAll() {
        for (Car car : listCar) {
            System.out.println(car);
        }
    }

    @Override
    public void remove() {
        System.out.println("mời bạn nhập biển kiểm soát để xóa: ");
        String licensePlatesRemove = scanner.nextLine();

        boolean isExist = false;

        for (Car car : listCar) {
            if (licensePlatesRemove.equals(car.getSeaOfControl())) {
                System.out.println("bạn có chắc chẵn xóa không \n" +
                        "1. có \n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    listCar.remove(car);
                    System.out.println("xóa thành công");
                }
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void find() {
        System.out.println("Mời bạn nhập biển kiểm soát cần tìm: ");
        String findControlTest = scanner.nextLine();
        boolean isExist = false;

        for (Car car : listCar) {
            if (findControlTest.equals(car.getSeaOfControl())) {
                System.out.println(car);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy");
        }
    }


}
