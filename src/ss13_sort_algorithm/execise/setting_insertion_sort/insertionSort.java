package ss13_sort_algorithm.execise.setting_insertion_sort;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] array = {123, 15, 4561, 21, 3};
        System.out.println("Mảng ban đầu: "+Arrays.toString(array));
        System.out.println("Mảng ban sau khi sắp xếp: "+Arrays.toString(insertion(array)));
    }

    public static int[] insertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
        return array;
    }
}
