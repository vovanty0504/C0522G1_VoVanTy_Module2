package casestudy.execise1.controller;

import java.util.Scanner;

public class PromotionManagementController {
    private static final Scanner scanner = new Scanner(System.in);

    public void PromotionManagement(){
        do {
            System.out.println("1. hiển thị danh sách khách hàng sử dụng dịch vụ\n" +
                    "2. Danh sách hiển thị khách hàng nhận được voucher\n" +
                    "3. Quay lại menu chính");
            System.out.println("mời bạn nhập lựa chọn:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");
            }
        }while (true);
    }
}
