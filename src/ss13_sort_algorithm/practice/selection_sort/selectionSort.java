package ss13_sort_algorithm.practice.selection_sort;

public class selectionSort {
    public static void selection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex!=i){
                array[currentMinIndex]= array[i];
                array[i]=currentMin;
            }
        }
    }

    public static void main(String[] args) {
        int[] array={4,5,31,46,23};
        selection(array);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }
}
