package casestudy.execise1.controller;

import java.util.Scanner;

public class FacilityManagementController {
    private static final Scanner scanner = new Scanner(System.in);

    public void FacilityManagement() {
        do {
            System.out.println("1. Cơ sở danh sách hiển thị\n" +
                    "2. Thêm cơ sở mới\n" +
                    "3. Hiển thị danh sách bảo trì cơ sở\n" +
                    "4. Quay lại menu chính");
            System.out.println("mời bạn nhập lựa chon:");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    break;
                case 2:
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
}
