package ss16_binary_file_serialization.execise.service.impl;

import ss16_binary_file_serialization.execise.exception.DuplicateIDException;
import ss16_binary_file_serialization.execise.modle.Product;
import ss16_binary_file_serialization.execise.service.IProductService;
import ss16_binary_file_serialization.execise.utils.ReadDataFromFile;
import ss16_binary_file_serialization.execise.utils.WriteToFile;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/ss16_binary_file_serialization/execise/data/product.csv";


    public void display() {
        List<Product> productList = ReadDataFromFile.readProductFile(PATH);
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void find() {
        List<Product> productList = ReadDataFromFile.readProductFile(PATH);
        boolean isExit = false;
        int productCode;
        while (true) {
            try {
                System.out.println("Nhập mã sảm phẩm:");
                productCode = Integer.parseInt(scanner.nextLine());
                for (Product product :productList) {
                    if (product.getProductCode()==productCode){
                        System.out.println(product);
                        isExit=true;
                    }
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("vui lòng nhập số");
            }
        }if(!isExit){
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void addProduct() {
        List<Product> productList = ReadDataFromFile.readProductFile(PATH);

        Product product = infoProduct();
        productList.add(product);
        System.out.println("thêm mới thành công! ");

        WriteToFile.WriteProductFile(PATH, productList);
    }

    public static Product infoProduct() {
        List<Product> productList = ReadDataFromFile.readProductFile(PATH);
        int productCode;
        while (true) {
            try {
                System.out.print("Nhập mã sản phẩm: ");
                productCode = Integer.parseInt(scanner.nextLine());
                for (Product product : productList) {
                    if (product.getProductCode() == productCode) {
                        throw new DuplicateIDException("Trùng mã sảm phẩm vui lòng nhập lại");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai! vui lòng nhập số");
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.print("Nhập tên sản phẩm:");
        String productName = scanner.nextLine();

        System.out.print("Nhập hãng sản phẩm:");
        String manufacturer = scanner.nextLine();

        double price;
        while (true) {
            try {
                System.out.print("Giá sản phẩm: ");
                price = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai! Vui lòng nhập số!");
            }
        }
        return new Product(productCode, productName, manufacturer, price);
    }
}
