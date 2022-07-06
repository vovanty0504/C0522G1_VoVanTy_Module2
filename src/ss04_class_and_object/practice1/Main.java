package ss04_class_and_object.practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều rộng: ");
        double width = scanner.nextDouble();

        System.out.println("nhập chiều cao: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Hình chữ nhật của bạn \n"+ rectangle.display());
        System.out.println("chu vi hình chữ nhật \n " + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật \n " + rectangle.getArea());

    }

}
