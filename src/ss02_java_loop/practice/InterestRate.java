package ss02_java_loop.practice;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền đầu tư: ");
        double money = Double.parseDouble(input.nextLine());

        System.out.println("Nhập số tháng: ");
        int month = Integer.parseInt(input.nextLine());

        System.out.println("Nhập lãi suất hàng năm theo tỷ lệ phần trăm: ");
        double interestRate = Double.parseDouble(input.nextLine());

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Tổng số tiền lãi: " + totalInterest);

    }
}
