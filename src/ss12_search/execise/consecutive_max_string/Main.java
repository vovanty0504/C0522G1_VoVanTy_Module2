package ss12_search.execise.consecutive_max_string;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> max = new LinkedList<>();
        List<Character> list = new LinkedList<>();

        System.out.println("nhập chuỗi bất kì: ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.get(list.size() - 1) && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character : max) {
            System.out.print(character);
        }
    }
}
