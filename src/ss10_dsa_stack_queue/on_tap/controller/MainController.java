package ss10_dsa_stack_queue.on_tap.controller;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentCardController paymentCard = new PaymentCardController();
        SavingsCardController savingsCard = new SavingsCardController();


        int choose;
        do {
            while (true) {
                try {
                    System.out.println("Menu quản lí thẻ ngân hàng \n" +
                            "1. quản lý thẻ tiết kiệm\n" +
                            "2. quản lý thẻ thanh toán\n" +
                            "3. thoát chương trình");
                    System.out.println("mời bạn nhập lựa chọn: ");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui lòng nhập số!");
                }
            }

            switch (choose) {
                case 1:
                    savingsCard.menuSavingsCard();
                    break;
                case 2:
                    paymentCard.menuPaymentCard();
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
