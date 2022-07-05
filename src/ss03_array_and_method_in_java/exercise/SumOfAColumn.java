package ss03_array_and_method_in_java.exercise;

import java.util.Scanner;


public class SumOfAColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cột");
        int row = scanner.nextInt();
        System.out.println("nhập hàng");
        int col = scanner.nextInt();
        double[][] array = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("nhập phần tử [%d] [%d]", i, j);
                array[i][j] = scanner.nextDouble();
            }
        }
        int indexCol;
        boolean iSNotCol;
        do {
            System.out.println("nhập vị trí cột cần tính tổng: ");
            indexCol = scanner.nextInt();
            iSNotCol = indexCol < 0 || indexCol > col - 1;
            if (iSNotCol) {
                System.out.println("nhập lại:");
            }
        } while (iSNotCol);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][indexCol];
        }
        System.out.printf("tổng các phần tử ở cột thứ %d là: %5.2f", indexCol, sum);
    }
}
