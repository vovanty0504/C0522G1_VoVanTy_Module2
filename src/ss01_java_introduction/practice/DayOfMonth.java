package ss01_java_introduction.practice;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tháng nào bạn muốn đếm ngày?");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.print("tháng 2 có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("tháng " + month + " có 30 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng " + month + " có 31 ngày ");
                break;
            default:
                System.out.print("Đầu vào không hợp lệ");
        }
    }
}
