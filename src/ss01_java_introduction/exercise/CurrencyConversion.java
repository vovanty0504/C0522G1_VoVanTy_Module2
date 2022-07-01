package ss01_java_introduction.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập USD: ");
        double usd = scanner.nextDouble();

        double exchange = usd * vnd;
        System.out.println("Giá tiền quy đổi là: " + exchange);
    }
}
