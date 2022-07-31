package casestudy.execise1.controller;

import casestudy.execise1.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityManagementController {
    private static final Scanner scanner = new Scanner(System.in);
    FacilityService facility = new FacilityService();

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
                    facility.display();
                    break;
                case 2:
                    facility.add();
                    break;
                case 3:
                    facility.displayMaintain();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");
            }

        } while (true);


    }

}
