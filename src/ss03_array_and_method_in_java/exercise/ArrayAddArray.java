package ss03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("độ dài mảng 1");
        int length1 = scanner.nextInt();
        int[] array1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.printf("Nhập arr[%d]: ", i);
            array1[i] = scanner.nextInt();
        }
        System.out.println("độ dài mảng 2");
        int length2 = scanner.nextInt();
        int[] array2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.printf("Nhập arr[%d]: ", i);
            array2[i] = scanner.nextInt();
        }
        System.out.println("mảng 1");
        System.out.println(Arrays.toString(array1));
        System.out.println("mảng 2");
        System.out.println(Arrays.toString(array2));
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[i + array1.length] = array2[i];
        }
        System.out.println("mảng 3");
        System.out.println(Arrays.toString(array3));
    }
}
