package thi_module_2.controller;

import thi_module_2.service.IXeTaiService;
import thi_module_2.service.impl.XeTaiService;

import java.util.Scanner;

public class XeTaiController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final IXeTaiService XETAI = new XeTaiService();

    public void quanLiXeTai() {
        int luaChon;
        do {
            while (true) {
                try {
                    System.out.println("Menu quản lí xe tải \n" +
                            "1. Hiển Thi\n" +
                            "2. Đăng kí xe tải\n" +
                            "3. Tìm Kiếm\n" +
                            "4. Xóa\n" +
                            "5. Quay về bảng chọn chính");
                    System.out.println("mời bạn nhập lựa chọn: ");
                    luaChon = Integer.parseInt(SCANNER.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số!");
                }
            }

            switch (luaChon) {
                case 1:
                    XETAI.hienThi();
                    break;
                case 2:
                    XETAI.dangKi();
                    break;
                case 3:
                    XETAI.timKiem();
                    break;
                case 4:
                    XETAI.xoa();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");
            }
        } while (true);

    }
}
