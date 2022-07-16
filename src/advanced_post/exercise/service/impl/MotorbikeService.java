package advanced_post.exercise.service.impl;

import advanced_post.exercise.modle.Motorbike;
import advanced_post.exercise.modle.Truck;
import advanced_post.exercise.service.IMotorBikeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeService implements IMotorBikeService {
    private static final List<Motorbike> listMotorbike = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

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

        System.out.print("Nhập trọng tải (tấn): ");
        double wattage = Double.parseDouble(scanner.nextLine());

        Motorbike motorbike = new Motorbike(name, seaOfControl, manufacturer, yearOfManufacture, wattage);
        listMotorbike.add(motorbike);
        System.out.println("thêm mới thành công");
    }

    @Override
    public void displayAll() {
        for (Motorbike motorbike : listMotorbike) {
            System.out.println(motorbike);
        }
    }

    @Override
    public void remove() {
        System.out.println("mời bạn nhập biển kiểm soát để xóa: ");
        String licensePlatesRemove = scanner.nextLine();
        boolean isExist = false;
        for (Motorbike motorbike : listMotorbike) {
            if (licensePlatesRemove.equals(motorbike.getSeaOfControl())) {
                System.out.println("bạn có chắc chắn xóa không? \n" +
                        "1. có \n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    listMotorbike.remove(motorbike);
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

        for (Motorbike motorbike : listMotorbike) {
            if (findControlTest.equals(motorbike.getSeaOfControl())) {
                System.out.println(motorbike);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy");
        }
    }
}
