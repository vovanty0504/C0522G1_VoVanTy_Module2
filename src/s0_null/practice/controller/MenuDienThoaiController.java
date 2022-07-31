package s0_null.practice.controller;

import java.util.Scanner;

public class MenuDienThoaiController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static DienThoaiXachTayController dienThoaiXachTayController = new DienThoaiXachTayController();
    private static DienThoaiChinhHangController dienThoaiChinhHangController = new DienThoaiChinhHangController();
    public static void hienThiDienThoai() {

        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Menu quản lí điện thoại \n" +
                            "1. quản lý điện thoại chính hãng\n" +
                            "2. quản lý điện thoại xách tay\n" +
                            "3. thoát chương trình");
                    System.out.println("mời bạn nhập lựa chọn: ");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số!");
                }
            }

            switch (choose) {
                case 1:
                    dienThoaiChinhHangController.dienThoaiChinhHang();
                    break;
                case 2:
                    dienThoaiXachTayController.dienThoaiXachTay();
                    break;
                case 3:
                    System.out.println("tạm biệt quý khách!");
                    System.exit(0);
                default:
                    System.out.println("vui lòng nhập lại");

            }
        } while (true);

    }
}
