package ss03_array_and_method_in_java.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập độ dài mảng");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Nhập arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("mảng vừa tạo");
        System.out.println(Arrays.toString(arr));

        System.out.println("nhập phần tử cần xóa");
        int number = scanner.nextInt();
        boolean notArr = true;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                notArr = false;
                for (int j = i; j < arr.length - 1; j++) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                arr[arr.length - 1] = 0;
            }
        }
        if (notArr) {
            System.out.println("Không tìm thấy X trong mảng!");
        } else {
            System.out.println("Mảng sau khi xóa phần tử X: ");
            System.out.println(Arrays.toString(arr));
        }
    }
}
