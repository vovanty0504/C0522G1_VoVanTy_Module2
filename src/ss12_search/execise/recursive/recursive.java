package ss12_search.execise.recursive;

public class recursive {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int number = 5;
        System.out.println(recursive(array, 0, array.length - 1, number));
    }

    public static int recursive(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = (right + left) / 2;
            if (x == arr[mid]) {
                return mid;
            }
            if (x > arr[mid]) {
                return recursive(arr, mid + 1, right, x);
            }
            return recursive(arr, left, mid - 1, x);
        }
        return -1;
    }
}
