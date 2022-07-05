package ss03_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalMatrixSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cột ma trận: ");
        int row = scanner.nextInt();
        int[][] array2d = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("nhập phần tử [%d] [%d]", i, j);
                array2d[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            sum += array2d[i][i];
        }
        int sum1 = 0;
        for (int i = 0; i < array2d.length; i++) {
            sum1 += array2d[i][array2d.length - 1 - i];
        }
        System.out.println("tổng đường chéo thứ nhất: " + sum);
        System.out.println("tổng đường chéo thứ hai: " + sum1);
    }
}
