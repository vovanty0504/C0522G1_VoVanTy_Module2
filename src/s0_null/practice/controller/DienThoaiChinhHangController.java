package s0_null.practice.controller;

import s0_null.practice.service.IDienThoaiChinhHangService;
import s0_null.practice.service.impl.DienThoaiChinhHangService;

import java.util.Scanner;

public class DienThoaiChinhHangController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static IDienThoaiChinhHangService dienThoaiChinhHang = new DienThoaiChinhHangService();

    public void dienThoaiChinhHang() {
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Menu quản lí thẻ thanh toán \n" +
                            "1. Thêm mới\n" +
                            "2. Xóa\n" +
                            "3. Hiển thị danh sách\n" +
                            "4. Tìm kiếm\n" +
                            "5. Quay về menu chính");
                    System.out.println("mời bạn nhập lựa chọn: ");
                    choose = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số!");
                }
            }

            switch (choose) {
                case 1:
                    dienThoaiChinhHang.add();
                    break;
                case 2:
                    dienThoaiChinhHang.remove();
                    break;
                case 3:
                    dienThoaiChinhHang.display();
                    break;
                case 4:
                    dienThoaiChinhHang.find();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");

            }
        } while (true);
    }
}
