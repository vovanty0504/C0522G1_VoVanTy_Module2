package on_tap.controller;

import on_tap.service.ISavingsCardService;
import on_tap.service.impl.SavingsCardService;

import java.util.Scanner;

public class SavingsCardController {
    private static final Scanner SCANNER = new Scanner(System.in);
    ISavingsCardService savingsCard = new SavingsCardService();

    public void menuSavingsCard() {
        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Menu quản lí thẻ tiết kiệm\n" +
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
                    savingsCard.add();
                    break;
                case 2:
                    savingsCard.remove();
                    break;
                case 3:
                    savingsCard.display();
                    break;
                case 4:
                    savingsCard.find();
                case 5:
                    return;
                default:
                    System.out.println("vui lòng nhập lại");

            }
        } while (true);
    }
}
