package s0_null.practice.controller;

import s0_null.practice.service.IDienThoaiXachTayService;
import s0_null.practice.service.impl.DienThoaiXachTayService;

import java.util.Scanner;

public class DienThoaiXachTayController {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static IDienThoaiXachTayService dienThoaiXachTay = new DienThoaiXachTayService();

    public void dienThoaiXachTay() {
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
                    dienThoaiXachTay.add();
                    break;
                case 2:
                    dienThoaiXachTay.remove();
                    break;
                case 3:
                    dienThoaiXachTay.display();
                    break;
                case 4:
                    dienThoaiXachTay.find();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");

            }
        } while (true);

    }
}
