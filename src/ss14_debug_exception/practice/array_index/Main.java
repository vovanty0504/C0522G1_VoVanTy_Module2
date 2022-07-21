package ss14_debug_exception.practice.array_index;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayIndexException arrExample = new ArrayIndexException();
        Integer[] array = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + array[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
