package casestudy.execise1;

import java.util.Scanner;

public class DisplayMainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("mời bạn nhập ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Mã hàng: 147, Hãng xe: Toyota , Quốc gia: Nhật Bản");
                    break;
                case 2:
                    System.out.println("Mã hàng 258, Hãng xe: Mazda : Quốc gia: Việt Nam");
                case 3:
                    System.out.println("Mã hàng 369, Hãng xe: Kia , Quốc gia: China");
                default:
                    System.out.println("vui lòng nhập lại");
            }
        } while (number < 0 || number > 3);
    }
}
