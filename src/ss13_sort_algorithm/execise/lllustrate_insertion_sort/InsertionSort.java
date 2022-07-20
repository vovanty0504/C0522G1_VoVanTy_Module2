package ss13_sort_algorithm.execise.lllustrate_insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("nhập phần tử " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng số nguyên vừa tạo:\n" + Arrays.toString(array));


        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
        System.out.println(Arrays.toString(array));

    }
}
