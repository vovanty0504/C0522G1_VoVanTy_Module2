package thi_module_2.controller;

import thi_module_2.service.IXeOToService;
import thi_module_2.service.impl.XeOToService;

import java.util.Scanner;

public class XeOToController {
    private static final Scanner SCANNER = new Scanner(System.in);
   private static final IXeOToService XEOTO = new XeOToService();

    public void quanLiXeOTo() {
        int luaChon;
        do {
            while (true) {
                try {
                    System.out.println("Menu quản lí xe ô tô \n" +
                            "1. Hiển Thi xe ô tô\n" +
                            "2. Đăng kí  xe ô tô\n" +
                            "3. Tìm Kiếm xe ô tô\n" +
                            "4. Xóa xe ô tô\n" +
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
                    XEOTO.hienThi();
                    break;
                case 2:
                    XEOTO.dangKi();
                    break;
                case 3:
                    XEOTO.timKiem();
                    break;
                case 4:
                    XEOTO.xoa();
                    break;
                case 5:
                    return;
                default:
                    System.err.println("vui lòng nhập lại");

            }
        } while (true);
    }
}
