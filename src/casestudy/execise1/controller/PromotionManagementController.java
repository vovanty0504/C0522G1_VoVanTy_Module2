package casestudy.execise1.controller;

import java.util.Scanner;

public class PromotionManagementController {
    private static final Scanner scanner = new Scanner(System.in);
    int choose;

    public void PromotionManagement() {
        do {
            while (true) {
                try {
                    System.out.println("1. hiển thị danh sách khách hàng sử dụng dịch vụ\n" +
                            "2. Danh sách hiển thị khách hàng nhận được voucher\n" +
                            "3. Quay lại menu chính");
                    System.out.println("mời bạn nhập lựa chọn:");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập lại!");
                }
            }
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");
            }
        } while (true);
    }
}
