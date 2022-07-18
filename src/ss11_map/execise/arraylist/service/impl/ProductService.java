package ss11_map.execise.arraylist.service.impl;

import ss11_map.execise.arraylist.modle.Product;
import ss11_map.execise.arraylist.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {

    private static final List<Product> listProduct = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Mời bạn nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Mời bạn nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, price);
        listProduct.add(product);
        System.out.println("Thêm mới thành công!");

    }

    @Override
    public void update() {
        System.out.println("Mời bạn nhập ID:");
        int number = Integer.parseInt(scanner.nextLine());
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;

        for (Product product : listProduct) {
            if (product.getId() == number) {
                System.out.println("Mời bạn nhập lại tên: ");
                product.setName(scanner.nextLine());
                System.out.println("Mời bạn nhập lại giá:  ");
                product.setPrice(Double.parseDouble(scanner.nextLine()));
                isExit = true;
                System.out.println("cập nhập thành công!");
                break;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy ID");
        }
    }

    @Override
    public void display() {
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập ID để xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;

        for (Product product : listProduct) {
            if (product.getId() == id) {
                System.out.println("Mời bạn nhập lựa chọn \n" +
                        "1. có\n" +
                        "2. Không");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1) {
                    listProduct.remove(product);
                    System.out.println("xóa thành công!");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void find() {
        System.out.println("Nhập tên sản phẩm để tìm kiếm: ");
        String string = scanner.nextLine();
        boolean isFlag = false;

        for (Product product : listProduct) {
            if (string.equals(product.getName())) {
                System.out.println(product);
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println("Không tìm thấy");
        }
    }


    @Override
    public void sortAscending() {
        PriceAscending priceAscending = new PriceAscending();
        listProduct.sort(priceAscending);
    }

    @Override
    public void sortDecrease() {
        PriceDecrease priceDecrease = new PriceDecrease();
        listProduct.sort(priceDecrease);
    }


}
