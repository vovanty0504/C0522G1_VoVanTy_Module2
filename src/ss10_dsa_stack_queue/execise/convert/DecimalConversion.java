package ss10_dsa_stack_queue.execise.convert;

import java.util.Scanner;
import java.util.Stack;

public class DecimalConversion {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số muốn chuyển ");
        int number = scanner.nextInt();

        while (number > 0) {
            integerStack.push(number % 2);
            number /= 2;
        }
        while (!integerStack.isEmpty()){
            System.out.print(integerStack.pop());
        }


    }
}
