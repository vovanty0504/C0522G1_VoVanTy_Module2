package ss01_java_introduction.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double VND = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập USD: ");
        double USD = scanner.nextDouble();

        double Exchange = USD * VND;
        System.out.println("Đổi tiền USD Sang VND: " + Exchange);
    }
}
