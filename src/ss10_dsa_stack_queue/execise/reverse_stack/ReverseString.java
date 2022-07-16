package ss10_dsa_stack_queue.execise.reverse_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> stringReverse = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi bất kì : ");
        String string = scanner.nextLine();

        String[] stringArray = string.split(" ");
        System.out.println(Arrays.toString(stringArray));

        for (String item : stringArray) {
            stringReverse.push(item);
        }
        string = " ";
        while (!stringReverse.isEmpty()) {
            string += stringReverse.pop() + " ";
        }
        System.out.println(string);

    }

}



