package ss03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class CountElementOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi kí tự: ");
        String str = scanner.nextLine();
        System.out.println("nhập kí tự cần kiểm tra: ");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện: " + count);
    }
}
