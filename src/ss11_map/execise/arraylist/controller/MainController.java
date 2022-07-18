package ss11_map.execise.arraylist.controller;

import ss11_map.execise.arraylist.service.IProductService;
import ss11_map.execise.arraylist.service.impl.ProductService;

import java.util.Scanner;

public class MainController {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        IProductService product = new ProductService();

        do {
            System.out.println("quản lí sản phẩm\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm theo \n" +
                    "3. Xoá sản phẩm theo \n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần\n" +
                    "7. giảm dần theo giá\n" +
                    "8 . Thoát");
            System.out.println("mời bạn nhập: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    product.add();
                    break;
                case 2:
                    product.update();
                    break;
                case 3:
                    product.remove();
                    break;
                case 4:
                    product.display();
                    break;
                case 5:
                    product.find();
                    break;
                case 6:
                    product.sortAscending();
                    break;
                case 7:
                    product.sortDecrease();
                    break;
                case 8:
                    System.out.println("cảm ơn quý khách!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("vui lòng nhập lại: ");
            }


        } while (true);
    }
}
