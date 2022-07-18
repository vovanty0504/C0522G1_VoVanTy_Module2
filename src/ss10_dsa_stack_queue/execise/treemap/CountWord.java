package ss10_dsa_stack_queue.execise.treemap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi để kiểm tra: ");
        String string = scanner.nextLine();
        String[] array = string.toLowerCase().split(" ");


        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String key : array) {
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, 1);
            } else {
                int count = treeMap.get(key);
                treeMap.put(key, count + 1);
            }

        }

        System.out.println("số lần xuất hiện trong mảng là:\n" + string);

        Set<String> keys = treeMap.keySet();
        for (String key : keys) {
            System.out.print(key + " = " + treeMap.get(key) + ", ");
        }
    }
}
