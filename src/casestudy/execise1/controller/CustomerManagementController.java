package casestudy.execise1.controller;

import java.util.Scanner;

public class CustomerManagementController {
    private static final Scanner scanner = new Scanner(System.in);

    public void customerManagement(){
        do {
            System.out.println("1. hiển thị danh sách khách hàng\n" +
                    "2. thêm khách hàng mới\n" +
                    "3. chỉnh sửa khách hàng\n" +
                    "4. Quay lại menu chính");
            System.out.println("mời bạn nhập lựa chọn:");
           int choose= Integer.parseInt(scanner.nextLine());
           switch (choose){
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

        }while (true);

    }
}
