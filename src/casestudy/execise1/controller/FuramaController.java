package casestudy.execise1.controller;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagerController employee = new EmployeeManagerController();
        CustomerManagementController customer = new CustomerManagementController();
        FacilityManagementController facility = new FacilityManagementController();
        BookingManagementController booking = new BookingManagementController();
        PromotionManagementController promotion = new PromotionManagementController();
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Menu quản lí khách sạn \n" +
                            "1. quản lý nhân viên\n" +
                            "2. quản lý khách hàng\n" +
                            "3. quản lý cơ sở\n" +
                            "4. quản lý đặt phòng\n" +
                            "5. quản lý khuyến mãi\n" +
                            "6. thoát ra");
                    System.out.println("mời bạn nhập lựa chọn: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số!");
                }
            }

            switch (choose) {
                case 1:
                    employee.employeeManager();
                    break;
                case 2:
                    customer.customerManagement();
                    break;
                case 3:
                    facility.FacilityManagement();
                    break;
                case 4:
                    booking.bookingManagement();
                    break;
                case 5:
                    promotion.PromotionManagement();
                    break;
                case 6:
                    System.out.println("tạm biệt quý khách!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("vui lòng nhập lại");

            }
        } while (true);
    }
}
