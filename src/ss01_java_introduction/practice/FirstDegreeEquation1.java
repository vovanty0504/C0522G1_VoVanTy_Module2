package ss01_java_introduction.practice;

import java.util.Scanner;

public class FirstDegreeEquation1 {
    public static void main(String[] args) {
        System.out.println("Bộ phân giải phương trình tuyến tính");
        System.out.println("Cho một phương trình dưới dạng 'a * x + b = c', vui lòng nhập hằng số:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Phương trình vượt qua với x = %f! \n" , answer);
        } else {
            if (b == c) {
                System.out.print("Giải pháp là tất cả X!");
            } else {
                System.out.print("Không có giải pháp!");
            }
        }
    }
}
