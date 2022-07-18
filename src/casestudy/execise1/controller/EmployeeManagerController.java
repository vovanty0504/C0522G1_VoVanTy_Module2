package casestudy.execise1.controller;

import java.util.Scanner;

public class EmployeeManagerController {
    private static final Scanner scanner = new Scanner(System.in);

    public void employeeManager() {
        do {
            System.out.println("1. Danh sách hiển thị nhân viên\n" +
                    "2. Thêm nhân viên mới\n" +
                    "3. Chỉnh sửa nhân viên\n" +
                    "4. Quay lại menu chính");
            System.out.println("Mời bạn nhập lựa chọn: ");
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
