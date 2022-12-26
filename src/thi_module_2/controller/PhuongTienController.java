package thi_module_2.controller;

import thi_module_2.service.IGiayDangKiPhuongTienService;
import thi_module_2.service.impl.GiayDangKiPhuongTienService;

import java.util.Scanner;

public class PhuongTienController {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void hienThi() {
        IGiayDangKiPhuongTienService dangKi = new GiayDangKiPhuongTienService();
        int luaChon;
        do {
            while (true) {
                try {
                    System.out.println("Quan lí phương tiện\n" +
                            "1. Đăng kí phương tiện\n" +
                            "2. Xem danh sách phương tiện\n" +
                            "3. Hủy đăng kí phương tiện\n"+
                            "4. Thoát");
                    System.out.println("mời bạn nhập lựa chọn: ");
                    luaChon = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số!");
                }
            }

            switch (luaChon) {
                case 1:
                    dangKi.themMoi();
//                    dangKiPhuongTienController.dangKiPhuongTien();
                    break;
                case 2:
                    dangKi.hienThi();
                    break;
                case 3:
                    dangKi.xoa();
                    break;
                case 4:
                    System.out.println("tạm biệt quý khách!");
                    System.exit(0);
                    break;
                default:
                    System.err.println("vui lòng nhập lại");

            }
        } while (true);
    }
}
