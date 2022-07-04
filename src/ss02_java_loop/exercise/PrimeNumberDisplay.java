package ss02_java_loop.exercise;

import java.util.Scanner;

public class PrimeNumberDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int countSNT = 2;
        System.out.print("Nhập số để xuất: ");
        int number = scanner.nextInt();
        while (count < number) {
            int division = 0;
            for (int i = 1; i <= countSNT; i++) {
                if (countSNT % i == 0) {
                    division++;
                }
            }
            if (division == 2) {
                count++;
                System.out.println(countSNT + "\n");
            }
            countSNT++;
        }
    }
}
