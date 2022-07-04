package ss03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElementImMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập hàng: ");
        int row = scanner.nextInt();
        System.out.println("nhập cột: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("nhập phần tử[%d][%d]", i, j);
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        System.out.println("ma trận vừa tạo: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] > max) {
                    max = array[i][j];
                }

            }
            System.out.println();
        }
        System.out.println("phần tử lớn nhất trong mảng: " + max);
    }
}
