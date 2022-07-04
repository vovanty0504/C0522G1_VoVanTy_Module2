package ss02_java_loop.exercise;

import java.util.Scanner;

public class MenuDisplayShape {
    public static void main(String[] args) {
        int select;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("menu");
            System.out.println("1. hình chữ nhật");
            System.out.println("2. In hình tam giác vuông");
            System.out.println("3. In hình tam giác cân ");
            System.out.println("0. thoát");
            System.out.print("\nNhập sự lựa chọn của bạn: ");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("nhập chiều cao");
                    int length = scanner.nextInt();
                    System.out.println("nhập chiều rộng");
                    int width = scanner.nextInt();
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Nhập chiều cao: ");
                    int height = scanner.nextInt();

                    System.out.println("\nBotton-left: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\nTop-left: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height - i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("\nTop-right: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height; j++) {
                            if (j < i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("\nBotton-right: ");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < height; j++) {
                            if (j < height - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\nIn tam giác cân");
                    System.out.print("Nhập chiều cao: ");
                    int high = scanner.nextInt();
                    for (int i = 0; i < high; i++) {
                        for (int j = 0; j < high + i; j++) {
                            if (j < high - i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.out.println("không có lựa chọn \n");
            }

        } while (select != 0);
    }
}
