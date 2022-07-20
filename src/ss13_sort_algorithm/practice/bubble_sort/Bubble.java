package ss13_sort_algorithm.practice.bubble_sort;

public class Bubble {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 3, 4, 8};
        bubbleSort(array);
        for (int i=0;i < array.length;i++){
            System.out.print(array[i] +",");
        }

    }

    public static void bubbleSort(int[] array) {
        boolean needNextPass = true;
        for (int i = 1; i < array.length - 1 && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}

