package ss01_java_introduction.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập USD: ");
        double usd = scanner.nextDouble();

        double vnd = usd * 23000;
        System.out.println("Đổi tiền USD Sang VND: " + vnd);
    }
}
