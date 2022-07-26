package casestudy.execise1.controller;

import casestudy.execise1.service.IHouseService;
import casestudy.execise1.service.IRoomService;
import casestudy.execise1.service.IVillaService;
import casestudy.execise1.service.impl.HouseService;
import casestudy.execise1.service.impl.RoomService;
import casestudy.execise1.service.impl.VillaService;

import java.util.Scanner;

public class FacilityManagementController {
    private static final Scanner scanner = new Scanner(System.in);
    IHouseService house = new HouseService();
    IRoomService room = new RoomService();
    IVillaService villa = new VillaService();
    int choose;

    public void FacilityManagement() {
        do {
            while (true) {
                try {
                    System.out.println("1. Cơ sở danh sách hiển thị\n" +
                            "2. Thêm cơ sở mới\n" +
                            "3. Hiển thị danh sách bảo trì cơ sở\n" +
                            "4. Quay lại menu chính");
                    System.out.println("mời bạn nhập lựa chon:");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số!");
                }
            }
            switch (choose) {
                case 1:
                    break;
                case 2:
                    facilityMenu();
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");
            }

        } while (true);
    }

    public void facilityMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("1. Thêm Villa\n" +
                            "2. Thêm house\n" +
                            "3. Thêm Room\n" +
                            "4. Trở lại!");
                    System.out.print("vui lòng nhập lựa chọn: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }

            switch (choose) {
                case 1:
                    villa.add();
                    break;
                case 2:
                    house.add();
                    break;
                case 3:
                    room.add();
                    break;
                case 4:
                    return;
            }
        } while (true);

    }
}
