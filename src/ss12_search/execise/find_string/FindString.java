package ss12_search.execise.find_string;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chuỗi:");
        String string = scanner.nextLine();

        List<Character> list = new LinkedList<>();
        List<Character> tempList = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            tempList.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > tempList.get(tempList.size() - 1)) {
                    tempList.add(string.charAt(j));
                }
            }
            if (tempList.size() > list.size()) {
                list.clear();
                list.addAll(tempList);
            }
            tempList.clear();
        }
        for (Character character : list) {
            System.out.print(character);
        }
    }
}
