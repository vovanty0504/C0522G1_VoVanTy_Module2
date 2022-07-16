package advanced_post.exercise.service.impl;

import advanced_post.exercise.modle.Car;
import advanced_post.exercise.modle.Truck;
import advanced_post.exercise.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static final List<Truck> listTruck = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {

        System.out.print("Chủ sở hữu: ");
        String name = scanner.nextLine();

        System.out.print("Nhập biển kiểm soát: ");
        String seaOfControl = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập trọng tải (tấn): ");
        int tonnage = Integer.parseInt(scanner.nextLine());

        Truck truck = new Truck(name, seaOfControl, manufacturer, yearOfManufacture, tonnage);
        listTruck.add(truck);
        System.out.println("thêm mới thành công");

    }

    @Override
    public void displayAll() {
        for (Truck truck : listTruck) {
            System.out.println(truck);
        }
    }

    @Override
    public void remove() {
        System.out.println("mời bạn nhập biển kiểm soát để xóa: ");
        String licensePlatesRemove = scanner.nextLine();

        boolean isExist = false;
        for (Truck truck : listTruck) {
            if (licensePlatesRemove.equals(truck.getSeaOfControl())) {
                System.out.println("bạn có chắc chắn xóa không?\n" +
                        "1. có \n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    listTruck.remove(truck);
                    System.out.println("xóa thành công");
                }
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy ");
        }

    }

    @Override
    public void find() {
        System.out.println("Mời bạn nhập biển kiểm soát cần tìm: ");
        String findControlTest = scanner.nextLine();
        boolean isExist = false;

        for (Truck truck : listTruck) {
            if (findControlTest.equals(truck.getSeaOfControl())) {
                System.out.println(truck);
                isExist = true;
                break;
            }

        }
        if (!isExist) {
            System.out.println("không tìm thấy");
        }
    }
}
