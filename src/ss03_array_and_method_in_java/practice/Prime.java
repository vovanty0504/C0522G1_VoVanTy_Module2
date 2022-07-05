package ss03_array_and_method_in_java.practice;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int number = scanner.nextInt();
        int count = 0;
        int index = 2;
        while (count < number) {
            if (isPrime(index)) {
                System.out.print(index + "\t");
                count++;
            }
            index++;
        }
    }

    static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
