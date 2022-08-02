package casestudy.execise1.controller;

import casestudy.execise1.service.ICustomerService;
import casestudy.execise1.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerManagementController {
    private static final Scanner scanner = new Scanner(System.in);
    ICustomerService customer = new CustomerService();
    int choose;

    public void customerManagement() {
        do {
            while (true) {
                try {
                    System.out.println("1. Hiển thị danh sách khách hàng\n" +
                            "2. thêm khách hàng mới\n" +
                            "3. chỉnh sửa khách hàng\n" +
                            "4. Tìm kiếm khách hàng \n"+
                            "5.Xóa khách hàng\n" +
                            "6. Quay lại menu chính");
                    System.out.println("mời bạn nhập lựa chọn:");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số!");
                }
            }
            switch (choose) {
                case 1:
                    customer.display();
                    break;
                case 2:
                    customer.add();
                    break;
                case 3:
                    customer.edit();
                    break;
                case 4:
                    customer.find();
                    break;
                case 5:
                    customer.remove();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");
            }

        } while (true);

    }
}
