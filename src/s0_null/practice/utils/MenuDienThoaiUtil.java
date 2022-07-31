package s0_null.practice.utils;

import java.util.Scanner;

public class MenuDienThoaiUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String phamViBaoHanh() {
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Phạm vi bảo hành\n" +
                            "1. Toan Quoc\n" +
                            "2. Toan Quoc");

                    System.out.print("Nhập lựa chọn: ");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }

            switch (choose) {
                case 1:
                    return "Toan Quoc";
                case 2:
                    return "Toan Quoc";
                default:
                    System.out.println("vui lòng nhập lại!");
            }
        } while (true);
    }

    public static String trangThai(){
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Trạng Thái\n" +
                            "1. Da sua chua\n" +
                            "2. Chua sua chua");

                    System.out.print("Nhập lựa chọn: ");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số");
                }
            }

            switch (choose) {
                case 1:
                    return "Da Sua Chua";
                case 2:
                    return "Chua Sua Chua";
                default:
                    System.out.println("vui lòng nhập lại!");
            }
        } while (true);
    }
}
