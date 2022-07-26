package ss00_mvc_haitt.utils;

import java.util.Scanner;

public class Name {
    public static String name() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] arr = name.toLowerCase().trim().split("");
        StringBuilder string = new StringBuilder().append(arr[0].toUpperCase());

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    string.append(arr[i].toUpperCase());
                } else {
                    string.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                string.append(arr[i]);
            }
        }
        return string.toString();
    }
}
