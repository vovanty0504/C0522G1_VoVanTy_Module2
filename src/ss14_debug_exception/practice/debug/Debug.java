package ss14_debug_exception.practice.debug;

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        System.out.println("linear equation resolver");
        System.out.println("đã cho một phương trình là a * x + b = 0, xin");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("the solution is : %f");
        }
    }
}
