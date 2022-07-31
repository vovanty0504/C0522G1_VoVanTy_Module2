package on_tap.controller;

import on_tap.service.IPaymentCardService;
import on_tap.service.impl.PaymentCardService;

import java.util.Scanner;

public class PaymentCardController {
    private static final Scanner SCANNER = new Scanner(System.in);
    IPaymentCardService paymentCard= new PaymentCardService();

    public void menuPaymentCard() {
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
                paymentCard.add();
                    break;
                case 2:
                paymentCard.remove();
                    break;
                case 3:
                  paymentCard.display();
                    break;
                case 4:
                    paymentCard.find();
                case 5:
                  return;
                default:
                    System.out.println("vui lòng nhập lại");

            }
        } while (true);
    }
}
