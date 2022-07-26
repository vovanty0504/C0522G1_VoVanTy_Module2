package casestudy.execise1.controller;

import java.util.Scanner;

public class BookingManagementController {
    private static final Scanner scanner = new Scanner(System.in);
    int choose;
    public void bookingManagement() {
        do {
            while (true) {
                try {
                    System.out.println("1. thêm đặt chỗ mới\n" +
                            "2. đặt trước danh sách hiển thị\n" +
                            "3. tạo các co thắt mới\n" +
                            "4. hiển thị danh sách hợp đồng\n" +
                            "5. chỉnh sửa hợp đồng\n" +
                            "6. Quay lại menu chính");
                    System.out.println("mời bạn nhập lựa chọn");
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");
            }

        } while (true);
    }
}
