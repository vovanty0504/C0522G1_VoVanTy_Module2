package ss03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SmallValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("nhập phần từ mảng [%d]", i);
            array[i] = scanner.nextInt();
        }
        System.out.println("mảng vừa tạo");
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("phần tử nhỏ nhất trong mảng: " + min);
    }
}
