package ss10_dsa_stack_queue.execise.reverse_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseINT {
    public static void main(String[] args) {
        Stack<Integer> array = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("độ dài mảng: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.printf("phần tử %d: ", i);
            array.push(scanner.nextInt());
        }
        System.out.print("Mảng vừa tạo: " + array + "\n");

        Stack<Integer> arrayReverse = new Stack<>();
        while (!array.isEmpty()) {
            arrayReverse.push(array.pop());
        }

        for (int item : arrayReverse) {
            array.push(item);
        }
        System.out.println("Mảng sau khi đảo ngược: " + array);


    }

}
