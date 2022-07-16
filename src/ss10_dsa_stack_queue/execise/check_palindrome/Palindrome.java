package ss10_dsa_stack_queue.execise.check_palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Character> stackString = new Stack<>();
        Queue<Character> queueString = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào chuỗi để kiểm tra!");
        String string = scanner.nextLine();


        for (int i = 0; i < string.length(); i++) {
            stackString.push(string.charAt(i));
            queueString.add(string.charAt(i));
        }
        boolean isFalse = false;
        while (!stackString.isEmpty() && !queueString.isEmpty()) {
            if (stackString.pop() != queueString.poll()) {
                isFalse = true;
                break;
            }
        }
        if(isFalse){
            System.out.println("Không phải Palindrome ");
        }else {

            System.out.println("Là Palindrome");
        }
    }
}
