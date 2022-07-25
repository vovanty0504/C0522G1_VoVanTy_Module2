package ss16_binary_file_serialization.execise1.binary_file.controller;

import ss16_binary_file_serialization.execise1.binary_file.modle.Product;
import ss16_binary_file_serialization.execise1.binary_file.service.IProductService;
import ss16_binary_file_serialization.execise1.binary_file.service.impl.ProductService;
import ss16_binary_file_serialization.execise1.binary_file.utils.WriteToFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerProduct {
    public static void menuDisplay() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "samsung", "samsungj7prime", 500000));
        WriteToFile.WriteProductFile("src/ss16_binary_file_serialization/execise/data/product.csv", products);

        Scanner scanner = new Scanner(System.in);
        IProductService product = new ProductService();
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Quản lí sản phẩm! \n" +
                            "1.Thêm sản phẩm\n" +
                            "2.Hiển thị sản phẩm\n" +
                            "3.Tìm kiếm sản phẩm");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }

            switch (choose) {
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    product.display();
                    break;
                case 3:
                    product.find();
                    break;
                case 4:
                    break;
            }
        } while (true);
    }
}
