package ss10_dsa_stack_queue.execise.check_check_bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static boolean checkBracket(String string) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char item = string.charAt(i);

            if (item == '(') {
                characters.push(item);

            } else if (item == ')') {
                if (characters.isEmpty()) {
                    return false;
                }
                characters.pop();
            }
        }
        return characters.isEmpty();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi kiểm tra");
        String string = scanner.nextLine();
        System.out.println(checkBracket(string));
    }
}
