package thi_module_2.controller;

import java.util.Scanner;

public class DangKiPhuongTienController {
    private static final Scanner SCANNER = new Scanner(System.in);

    public  void dangKiPhuongTien() {
        XeTaiController xeTai = new XeTaiController();
        XeOToController xeOTo = new XeOToController();

        int luaChon;
        do {
            while (true) {

                try {
                    System.out.println("Đăng kí phương tiện \n" +
                            "1. Đăng kí xe tải\n" +
                            "2. Đăng kí xe ô tô\n" +
                            "3. quay về menu chính");
                    System.out.println("mời bạn nhập lựa chọn: ");
                    luaChon = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số!");
                }
            }

            switch (luaChon) {
                case 1:
                    xeTai.quanLiXeTai();
                    break;
                case 2:
                    xeOTo.quanLiXeOTo();
                    break;
                case 3:
                    return;
                default:
                    System.err.println("vui lòng nhập lại");

            }
        } while (true);

    }
}
